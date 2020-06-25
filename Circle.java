/*  Illustration Array of objects*/



import java.util.*;
import java.io.*;
public class Circle
{
	private double radius;	
	private String color;
	public void inirad(double radius)
	{	
		this.radius=radius;
	}
	public void inicol(String color)
	{
		this.color=color;
	}
	public double getradius()
	{
		return radius;
	}
	public String getcolor()
	{	
		return color;
	}
	public double getarea()
	{
		double a= 3.14*radius*radius;
		return a;
	}
	
}
class Driver1{
public static void main(String [] args)
{
	Scanner scan= new Scanner(System.in);	
	String c[]= new String[5];
	double r[]= new double[5];
	double area[]=new double[5];
	Circle a[]= new Circle[5];
	for(int i=0;i<a.length;i++)
		{
			String x;
			double y;
			System.out.println("\n COLOR	"+(i+1));
			x=scan.next();
			System.out.println("\n  RADIUS	"+(i+1));
			y=scan.nextDouble();
			a[i]= new Circle();
			a[i].inirad(y);
			a[i].inicol(x);
		}
	for(int i=0;i<a.length;i++)
	{	
		c[i]= a[i].getcolor();
		r[i]= a[i].getradius();
		area[i]= a[i].getarea();
	}
	System.out.println("COlOR	RADIUS		AREA");	
	for(int i=0;i<r.length;i++)
		System.out.println(c[i]+"	"+r[i]+"		"+area[i]);
	
}	
}
