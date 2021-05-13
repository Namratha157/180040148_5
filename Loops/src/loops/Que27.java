package loops;
import java.util.*;
public class Que27 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			int n[] = new int[t];
			for(int i=0;i<t;i++) {
				n[i]=sc.nextInt();
			}
			int sum = 0;
			back:
			for (int i = 0; i < n.length; i++) {
			    if (n[i] == 6) {
			        for (int j = i + 1; j < n.length; j++) {
			            if (n[j] == 7) {
			                i = j;
			                continue back;
			            }
			        }
			    }
			    sum += n[i];
			}
			System.out.println(sum);
		}

	}
}
