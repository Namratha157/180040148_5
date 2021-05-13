package loops;
public class Que28 {
	public static void main(String[] args) {
		int a[][]=new int[2][2];
		a[0][0]=Integer.parseInt(args[0]);
		a[0][1]=Integer.parseInt(args[1]);
		a[1][0]=Integer.parseInt(args[2]);
		a[1][1]=Integer.parseInt(args[3]);
		if(args[0]==null || args[1]==null || args[2]==null || args[3]==null)
		{
			System.out.print("Please enter 4 integer numbers");
			return;
		}
		int b[][]=new int[2][2];
		b[0][0]=a[1][1];
		b[0][1]=a[1][0];
		b[1][0]=a[0][1];
		b[1][1]=a[0][0];
		System.out.println(b[0][0]+" "+b[0][1]);
		System.out.println(b[1][0]+" "+b[1][1]);
	}
}
