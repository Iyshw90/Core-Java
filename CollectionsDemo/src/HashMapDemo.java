

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String arg[]) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(1001, 70);
		hm.put(1002, 90);
		hm.put(1003, 50);
		hm.put(1004, 80);
		hm.put(1005, 30);
		hm.put(1006, 60);

		System.out.println("Size:::" + hm.size());

		System.out.println("The value of 1001 is:" + hm.get(1001));
		System.out.println("Printing the Keys:");
		for (Integer i : hm.keySet()) {
			System.out.println(i);
		}

		System.out.println("Printing the Values:");
		for (Integer i : hm.values()) {
			System.out.println(i);
		}

		System.out.println("Printing the Keys and Values:");
		for (Integer i : hm.keySet()) {
			System.out.println("Keys :" + i + ", Value:" + hm.get(i));
		}

		// hm.clear();
		// System.out.println("Size after clear():::"+hm.size());

	}
}
