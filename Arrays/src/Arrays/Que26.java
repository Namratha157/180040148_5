package loops;
import java.util.*;

public class Que26 {
	public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int[] b = new int[n];
        int j=0;
        for (int i=0;i<n-1;i++)
        {
            if (a[i]!=a[i+1])
            {
                b[j++]=a[i];
            }
        }
        b[j++]=a[n-1];
        for (int i=0;i<j;i++)
        {
        	System.out.print(b[i]+" ");
        }
        sc.close();
    }

}
