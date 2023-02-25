package graphQl;

import javax.servlet.annotation.WebServlet;

import com.coxautodev.graphql.tools.SchemaParser;

import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;
import ressources.LinkRepository;
import ressources.UserRepository;


@WebServlet(urlPatterns = "/test")
public class GraphQLEndpoint extends SimpleGraphQLServlet {
	 public GraphQLEndpoint() {
	        super(buildSchema());
	    }

	    private static GraphQLSchema buildSchema() {
	        LinkRepository linkRepository = new LinkRepository();
	        UserRepository userRepository = new UserRepository();
	        
	        return SchemaParser.newParser()
	                .file("schema.graphqls")
	                .resolvers(new QueryT(linkRepository, userRepository),new Mutation(linkRepository, userRepository))
	                .build()
	                .makeExecutableSchema();
	    }
}
