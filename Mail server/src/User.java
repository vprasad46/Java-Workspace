import java.util.*;
public class User {
	
	static int count =1;
	String name;
	String password;
	int id;
	
	LinkedHashMap<User,String> inbox = new LinkedHashMap<User,String>();


	public User(String name, String password) {
		this.name = name;
		this.password = password;
		this.id = count++; 
	}

	
	
}
