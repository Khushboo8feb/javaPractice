package com.practice.hashMap;

import java.util.HashMap;

public class HashMapPractice {

	public static void main(String[] args) {
		
		HashMap<String, String> hashmap = new HashMap();
		hashmap.put("FirstName", "Khushboo");
		hashmap.put("LastName", "Gupta");
		hashmap.put("Work", "QA");
		System.out.println(hashmap);
		System.out.println(hashmap.get("FirstName"));
		System.out.println(hashmap.size());

	}

}
