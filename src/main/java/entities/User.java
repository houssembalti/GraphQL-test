package entities;

public class User {
	 private final String id;
	    private final String nameU;
	    private final String email;
	    
	    public User(String name, String email) {
	        this(null, name, email);
	    }
	    
	    public User(String id, String name, String email) {
	        this.id = id;
	        this.nameU = name;
	        this.email = email;
	        
	    }

	    public String getId() {
	        return id;
	    }

	    public String getName() {
	        return nameU;
	    }

	    public String getEmail() {
	        return email;
	    }

	   

}
