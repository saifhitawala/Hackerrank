package fbhackercup;

import java.util.Arrays;
import java.util.Scanner;

public class LazyLoading {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer("");
		int tests = sc.nextInt();
		for (int t = 0; t < tests; t++) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			int start = 0, end = n - 1, trips = 0;
			for (int i = start, j = end; i < j; j--) {
				if (a[j] >= 50) {
					trips++;
					continue;
				}
				int k = 50 / a[j];
				i += k;
				trips++;
			}
			if (n == 1)
				trips++;
			sb.append("Case #" + (t + 1) + ": " + trips + "\n");
		}
		System.out.println(sb);
		sc.close();
	}
}
