package map.test;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;

public class MapTest {
	public static void main(String[] args) {
//		1. ###################################################
//		HashMap<String, Object> userMap = new HashMap<>();
//		String jsonUser = "";
//		
//		userMap.put("id", 1);
//		userMap.put("userId", "hds");
//		userMap.put("name", "한동석");
//		userMap.put("age", 20);
//		
//		System.out.println(userMap.toString());
//		System.out.println(userMap.get("name"));
//		
//		jsonUser += "{\"id\"=" + userMap.get("id") + ", ";
//		jsonUser += "\"name\"=" + "\"" + userMap.get("name") + "\"}";
//				
//		System.out.println(jsonUser);
		
//		2. ###################################################
//		HashMap<String, Object> userMap = new HashMap<>();
		
//		JSONObject userJSON = null;
		
//		userMap.put("id", 1);
//		userMap.put("userId", "hds");
//		userMap.put("name", "한동석");
//		userMap.put("age", 20);
		
//		userJSON = new JSONObject(userMap);
//		System.out.println(userMap);
		
//		3. ###################################################
		User user = new User(1, "hds", "한동석", 20);
		JSONObject userJSON = new JSONObject(user);
		String json = userJSON.toString();
		JSONObject result = null; 
		
		System.out.println(json);
		
		try {
			result = new JSONObject(json);
			result.put("name", "홍길동");
			System.out.println(result.get("name"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
}















