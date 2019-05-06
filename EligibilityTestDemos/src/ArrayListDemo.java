import java.util.ArrayList;
import java.util.ListIterator;

class Mobile
{
int price;
String name;
public Mobile(String name,int price)
{
this.price = price;
this.name = name;
}
public String toString()
{
return "Name: "+name+" , Price: "+price;
}
}

public class ArrayListDemo
{
public static void main(String arg[])
{
Mobile m1 = new Mobile("HTC",10000);
Mobile m2 = new Mobile("Nokia",5000);
Mobile m3 = new Mobile("Lenovo",15000);
Mobile m4 = new Mobile("OnePlus",20000);
Mobile m5 = new Mobile("Samsung",12000);

ArrayList<Mobile> al= new ArrayList<Mobile>();
al.add(m1);
al.add(m2);
al.add(m3);
al.add(m4);
al.add(m5);

ListIterator li = al.listIterator();
System.out.println("Traversing through the list:");
while(li.hasNext())
{
System.out.println(li.next());
}

System.out.println("Index of m2 is:"+al.indexOf(m2));
System.out.println("Whether the ArrayList is empty? - "+al.isEmpty());


System.out.println("Size of the ArrayList:"+al.size());
System.out.println("Removing one item from the list");
al.remove(m5);
System.out.println("Size of the ArrayList after removing one item:"+al.size());
System.out.println("Whether the ArrayList Contains m5 object ? -"+al.contains(m5));
System.out.println("Whether the ArrayList Contains m2 object? -"+al.contains(m2));

}
}