
package ressources;

import java.util.ArrayList;
import java.util.List;

import entities.Link;
import entities.User;

public class UserRepository {
	
	private  List<User> users;

    public UserRepository() {
        users = new ArrayList<>();
       
        users.add(new User("1234", "Benjamen", "benj@gmail.com"));
        users.add(new User("2567", "Mohamed", "med@esprit.tn"));    }
    
    public List<User> getUsers() {
        return users;
    }
    
    public User findByEmail(String email) {
        User firstU = null;
         
    	for(User u : users) {
        	if(u.getEmail().equals(email)) {
        		firstU=u;
        		break;
        	}
        }
        	
    	return firstU;
    }

    public User findById(String id) {
        User firstU = null;
         
    	for(User u : users) {
        	if(u.getId().equals(id)) {
        		firstU=u;
        	}
        }
        	
    	return firstU;
    }
    
    public User saveUser(User user) {
        users.add(user);
        return user;
    }
}
