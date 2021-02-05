import java.util.ArrayList;
import java.util.Iterator;


interface sampleInterface //Interface Creation
{
	public void Addition(int l,int b);
}

public class CoreJavaBasicConecpts implements sampleInterface //Class
{

	@Override
	public void Addition(int l, int b) //Method
	{
		System.out.println("Addition is: "+l+b);
		
	}
	
	public static void main(String args[])
	{
		CoreJavaBasicConecpts cj=new CoreJavaBasicConecpts(); //Object
		cj.Addition(5, 6);
		ArrayList<String> li=new ArrayList<>(); //Collection
		li.add("first");
		li.add("Second");
		li.add("Third");
//		li.add(3); //Generic
		for(Object ob:li) //Traverse through ArrayList
		{
			System.out.println("Objects in collection are: "+ob);
		}
		
		//Traverse through ArrayList using Iterator
		Iterator<String> ob=li.iterator();
		while(ob.hasNext())
		{
			System.out.println(ob.next());
		}
		
		String str="String"; // String Creation using Literal way
		
		String str1=new String("String2");//String Creation Using new keyword
		//String functions
		System.out.println("String length: "+str.length());
		System.out.println("Concatinated String: "+str.concat("new"));
		System.out.println("Provides reference to unreference object: "+str.intern());
		System.out.println("Check Substring"+str.substring(0));
		System.out.println("Print Character at Index Number: "+str.charAt(3));
		System.out.println("Compares value: "+str.equals(str1));
		
	}
}

