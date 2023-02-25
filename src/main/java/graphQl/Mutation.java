package graphQl;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import entities.Link;
import entities.User;
import ressources.LinkRepository;
import ressources.UserRepository;

public class Mutation implements GraphQLRootResolver {
	private final LinkRepository linkRepository;
	private final UserRepository userRepository;
	
	public Mutation(LinkRepository linkRepository, UserRepository userRepository) {
        this.linkRepository = linkRepository;
        this.userRepository = userRepository;
    }
	
	public Link saveLink(String url,String description) {
		
			Link l= new Link(url, description);
			this.linkRepository.saveLink(l);
			return l;
		
	}
}
