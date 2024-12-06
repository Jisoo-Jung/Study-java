package list.task.user;

import java.util.ArrayList;

public class Page {
	public static void main(String[] args) {
		
		ArrayList<User> users = new ArrayList<User>();
		ArrayList<User> copiedUsers = new ArrayList<User>();
//		ArrayList<User> copiedUsers = null;
		
		User user = new User();
		users.add(user);
		
		for (int i = 0; i < users.size(); i++) {
			User originalUser = users.get(i);
			User newUser = new User(originalUser);
			copiedUsers.add(newUser);
		}
		
		
//		copiedUsers = ((ArrayList<User>)users.clone());
//		copiedUsers = users;
		
		System.out.println(users.hashCode());
		System.out.println(copiedUsers.hashCode());
		
		System.out.println(users.get(0));
		System.out.println(copiedUsers.get(0));
		
		copiedUsers.add(new User());
		
		System.out.println(users.size());
		System.out.println(copiedUsers.size());
//		
		
		
		
		
	}
	
	
}










