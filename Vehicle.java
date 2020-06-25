/*  Hierarchical Inheritance in java with example program*/
/* Vehicle is the super class, where as Bus and Car are subclasses of Vehicle Class*/


import java.util.*;
import java.io.*;
public class Vehicle
{
	protected int regno,speed;
	protected String color,owner;
	public Vehicle(int regno,int speed,String color,String owner)
	{
		this.regno=regno;
		this.speed=speed;
		this.color=color;
		this.owner=owner;
	}
	void showData()
	{
		System.out.print("registration number "+regno+" SPEED "+speed+" COLOR "+color+" OWNER "+owner);
	}
}
class Bus extends Vehicle
{
	private int routeno;
	public Bus(int regno,int speed,String color,String owner,int routeno)
	{
		super(regno,speed,color,owner);
		this.routeno=routeno;
	}
	void showData1()
	{
		showData();
		System.out.println(" ROUTE NUMBER "+routeno);
	}
}
class Car extends Vehicle
{
	private String manufacturer;
	public Car(int regno,int speed,String color,String owner,String manufacturer)
	{
		super(regno,speed,color,owner);
		this.manufacturer=manufacturer;
	}
	void showData2()
	{
		showData();
		System.out.println(" MANUFACTURER "+manufacturer);
	}
}
class Driver1{
public static void main(String [] args)
{
	Scanner sc= new Scanner(System.in);
	char j='y'; int c;
	while(j=='Y'||j=='y')
	{	
		System.out.println("1 FOR BUS \n 2 FOR CAR");
		c=sc.nextInt();
		switch(c)
		{	
			case 1: 
			Bus b=new Bus(sc.nextInt(),sc.nextInt(),sc.next(),sc.next(),sc.nextInt()); 
			b.showData1();
			break;
			
			case 2: 
			Car d=new Car(sc.nextInt(),sc.nextInt(),sc.next(),sc.next(),sc.next()); 
			d.showData2();
			break;
			
			default: System.out.println("WRONG!");
		}
		System.out.println("CONTINUE?PRESS Y");
		j=sc.next().charAt(0);
	}	
}

}
