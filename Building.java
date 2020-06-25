/* Illustration of single inheritence , this keyword and super*/

/* Use of this keyword
  1)this can be used to refer current class instance variable.
  2)this can be used to invoke current class method (implicitly)
  3)this() can be used to invoke current class constructor.
  4)this can be passed as an argument in the method call.
  5)this can be passed as argument in the constructor call.
  6)this can be used to return the current class instance from the method. */

/* Super Keyword- The super keyword in Java is a reference variable which is used to refer immediate parent class object.
Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable. */

/* Usage of super Keyword
  1)super can be used to refer immediate parent class instance variable.
  2)super can be used to invoke immediate parent class method.
  3)super() can be used to invoke immediate parent class constructor.
 */


import java.util.*;
import java.io.*;
public class Building
{
	protected int floor,room,footage;
	public Building(int floor,int room,int footage)
	{
		this.floor=floor;
		this.room=room;
		this.footage=footage;
	}
	public void getData()
	{
		System.out.print("FLOOR"+floor+" ROOM "+room+" FOOTAGE "+footage+" ");
	}
}
class House extends Building
{
	private int bath,bed;
	public House(int floor,int room,int footage,int bath,int bed)
	{
		super(floor,room,footage);
		this.bath=bath;
		this.bed=bed;
	}
	public void getData1()
	{
		getData();
		System.out.println(" BEDROOM "+bed+" BATHROOM "+bath+" ");
	}
}
class DriverBuilding
{
public static void main(String [] args)
{
	Scanner sc= new Scanner(System.in);
	char j='y'; int c;
	while(j=='Y'||j=='y')
	{	 
		System.out.println("ENTER DATA");
		House b=new House(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()); 
		b.getData1();
			
		System.out.println("CONTINUE?PRESS Y");
		j=sc.next().charAt(0);
	}	
}

}
