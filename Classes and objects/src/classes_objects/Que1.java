package classes_objects;
import java.util.Scanner;
class Box
{
	int l,w,h;
	Box(int l,int h,int w)
	{
		this.l=l;
		this.w=w;
		this.h=h;
	}
	int volume()
	{
		return l*w*h;
	}
}
public class Que1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int w=sc.nextInt();
		int h=sc.nextInt();
		Box b=new Box(l,h,w);
		System.out.println("The volume is : "+b.volume());
        sc.close();
	}
}
