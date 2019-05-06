

import java.util.HashSet;
import java.util.Iterator;

class Employee {

	private String name;
	private int id;

	public Employee(String n, int i) {
		this.id = i;
		this.name = n;
	}

	public String toString() {
		return "[ Employee ID:" + id + ", Employee Name:" + name + " ]";

	}
}

public class HashSetDemo {

	public static void main(String arg[]) {
		Employee emp1 = new Employee("Yaman", 100);
		Employee emp2 = new Employee("RS", 101);
		Employee emp3 = new Employee("Shreeda", 102);
		Employee emp4 = new Employee("Yang", 103);
		Employee emp5 = new Employee("Siva", 104);
		Employee emp6 = new Employee("Sojunki", 105);

		HashSet<Employee> hs = new HashSet<Employee>();

		hs.add(emp1);
		hs.add(emp2);
		hs.add(emp3);
		hs.add(emp4);
		hs.add(emp5);

		System.out.println(hs);

		System.out.println(hs.contains(emp4));

		System.out.println(hs.contains(emp6));

		HashSet<Employee> hs1 = new HashSet<Employee>();

		hs1.add(emp1);
		hs1.add(emp2);

		System.out.println("Printing hs1:" + hs1);
		System.out.println("Contains All() :" + hs1.containsAll(hs));

		System.out.println("IS empty :" + hs.isEmpty());

		System.out.println("Size is :" + hs.size());

		Iterator i = hs.iterator();
		System.out.println("Iterating hashSet:");
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
