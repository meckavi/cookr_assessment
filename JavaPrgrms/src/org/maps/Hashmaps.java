package org.maps;

import java.util.HashMap;

public class Hashmaps {
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		System.out.println(map);
		
		HashMap<Integer,String> map1 = new HashMap<>();
		map1.putAll(map);
		System.out.println(map1);
		System.out.println(map.isEmpty());
		
		map1.clear();
		System.out.println(map1);
		
		System.out.println("CLONE :"+map.clone());
		
		System.out.println("KEY SET :"+map.keySet());
		
		System.out.println("TO GET VALUES ONLY :"+map.values());
		
		System.out.println("To get key :"+map.containsKey(3));
		
		System.out.println("to get value :"+map.containsValue("A"));
		
		System.out.println("ENTRY SET :"+map.entrySet());
		
		
		
		
	}

}
