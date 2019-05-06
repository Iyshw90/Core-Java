

import java.util.ArrayList;
import java.util.ListIterator;

class Mobile {
	private String name;
	private int price;

	public Mobile(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String toString() {
		return "[ Mobile:" + name + ",Price:" + price + "]";
	}
}

public class ArrayListDemo {
	public static void main(String arg[]) {
		Mobile m1 = new Mobile("Lenovo", 12000);
		Mobile m2 = new Mobile("MI", 10000);
		Mobile m3 = new Mobile("Nokia", 8000);
		Mobile m4 = new Mobile("HTC", 12000);
		Mobile m5 = new Mobile("OnePlus", 27000);

		ArrayList<Mobile> al = new ArrayList<Mobile>();
		al.add(m1);
		al.add(m2);
		al.add(m3);

		System.out.println("Size ::" + al.size());

		ListIterator li = al.listIterator();
		System.out.println("Iterating the ArrayList:");

		while (li.hasNext()) {
			System.out.println(li.next());
		}

		al.remove(1);

		ListIterator li1 = al.listIterator();
		System.out.println("Iterating the ArrayList after removing element:");

		while (li1.hasNext()) {
			System.out.println(li1.next());
		}

	}

}
