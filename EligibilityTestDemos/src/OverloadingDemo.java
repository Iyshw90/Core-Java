class Add
{

public int add(int x,int y)
{
int result = x+y;
return result;
}
public float add(float x, float y)
{
float result;
result = x+y;
return result;
}

public int add(int x, int y, int z)
{
int result;
result = x+y+z;
return result;
}

}

public class OverloadingDemo
{
public static void main(String arg[])
{
Add obj = new Add();
System.out.println("Adding Two numbers : 10 5 :"+obj.add(10,5));
System.out.println("Adding Three numbers: 10,11,12 :"+obj.add(10,11,12));
System.out.println("Adding two float values: "+obj.add(10.1f,2.5f));

}

}