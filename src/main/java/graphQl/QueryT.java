package graphQl;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import entities.Link;
import entities.User;
import ressources.LinkRepository;
import ressources.UserRepository;

public class QueryT implements GraphQLRootResolver {
    
    private final LinkRepository linkRepository;
    private final UserRepository userRepository;

    public QueryT(LinkRepository linkRepository, UserRepository userRepository) {
        this.linkRepository = linkRepository;
		this.userRepository = userRepository;
    }
public List<Link> getall(){
	return linkRepository.getAllLinks();
}
   
}
