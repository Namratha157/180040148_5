package classes_objects;
import java.util.*;
class Calculator
{
	static int powerInt(int n1,int n2)
	{
		return (int) Math.pow((int)n1, n2);
	}
	static double powerDouble(double n1,int n2)
	{
		return Math.pow(n1, n2);
	}
}
public class Que2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		double n3=sc.nextDouble();
		int n4=sc.nextInt();sc.close();
		System.out.println("Integer values : "+Calculator.powerInt(n1,n2));
		System.out.println("Integer and double values : "+Calculator.powerDouble(n3,n4));
	}
}
