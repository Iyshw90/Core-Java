import java.util.*;

public class BoxMain {
 
	public static void main(String arg[])
	{
		double res;
		Box obj=new Box();
		
		obj.setWidth(5);
		obj.setDepth(10);
		obj.setHeight(45);
		
		System.out.println("Enter the height value:"+obj.getWidth());
		System.out.println("Enter the height value:"+obj.getHeight());
		System.out.println("Enter the height value:"+obj.getDepth());
		
		res=obj.result();
		System.out.println("Result:"+res);
		
	}
}
