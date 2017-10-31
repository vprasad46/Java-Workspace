import java.util.*;
public class Index {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("::Welcome to Mail::");
		int it = 0;
		List<User> user = new ArrayList<User>();
		while(it ==0){
			
			System.out.println(":: 1.Login 2.Signup 3.Exit ::");
			int ch = input.nextInt();
		
			if(ch == 2){
				System.out.println("::Enter the username::");
				String name = input.next();
				System.out.println("::Enter the password::");
				String password = input.next();
				user.add(new User(name,password));
				System.out.println("::Please login to Continue::");
			}
			else if(ch ==1){
				System.out.println("::Enter the username::");
				String name = input.next();
				System.out.println("::Enter the password::");
				String password = input.next();
				
				User current_user = authenticate(name,password,user);
				if(current_user!=null){
					int session = 0;
					while(session == 0){
						System.out.println("::1.Inbox 2.Send Mail 3. Logout::");
						
						int choice = input.nextInt();
						
						if(choice ==2){
							System.out.println("::Enter the username of the reciepient::");
							String rname = input.next();
							System.out.println("::Enter the message::");
							String message = input.next();
							
							User ruser = finduser(rname, user);
							if(ruser!=null){
								ruser.inbox.put(current_user, message);
								System.out.println("::Mail Sent::");
							}
							else
								System.out.println("::reciepient not found::");	 
					    }
						else if(choice ==1){
							for(Map.Entry<User, String> entry:current_user.inbox.entrySet()){
								System.out.println("asdasd");
								System.out.println("--------------------------------------");
								System.out.println("Message from " +entry.getKey().name);
								System.out.println("---------------------------------------");
								System.out.println(entry.getValue());
								System.out.println("---------------------------------------");
							}
						}
						else if(choice == 3){
							System.out.println("::Logged out::");
							session = 1;
						}		
					}
				}
				else
					System.out.println("::Unable to authenticate the user::");
			}
			else if(ch ==3)
				it = 1;
		}	
	}
	
	public static User authenticate(String name,String password,List<User>user){	
		
		for(int i=0;i<user.size();i++){
			if(name.equals(user.get(i).name) && password.equals(user.get(i).password))
				return user.get(i);
		}
		return null;
	}
	
	public static User finduser(String name, List<User> user){
		for(int i=0;i<user.size();i++){
			if(name.equals(user.get(i).name))
				return user.get(i);
		}
		return null;
	}

}
