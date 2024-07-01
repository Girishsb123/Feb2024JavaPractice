package CollectionsTopics;

import java.util.HashMap;

public class UserRoles {

	public static String getUserCredentials(String role) {
		HashMap<String, String> userMap = new HashMap<String, String>();
		userMap.put("admin", "admin;admin@123");
		userMap.put("seller", "seller;seller@123");
		userMap.put("vendor", "vendor;vendor@123");
		userMap.put("manager", "manager;manager@123");

		return userMap.get(role);

	}

	public static void doLogin(String un, String pw) {
		System.out.println("login with : " + un + " " + pw);
	}

	public static void main(String[] args) {

		String creds = UserRoles.getUserCredentials("vendor");
		String username = creds.split(";")[0];
		String password = creds.split(";")[1];

		doLogin(username, password);

	}
}