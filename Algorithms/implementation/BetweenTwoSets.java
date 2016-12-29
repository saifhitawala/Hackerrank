package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BetweenTwoSets {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(tk.nextToken());
			int m = Integer.parseInt(tk.nextToken());
			int a[] = new int[n];
			tk = new StringTokenizer(br.readLine());
			for (int i = 0; i < a.length; i++) {
				a[i] = Integer.parseInt(tk.nextToken());
			}
			int b[] = new int[m];
			tk = new StringTokenizer(br.readLine());
			for (int i = 0; i < b.length; i++) {
				b[i] = Integer.parseInt(tk.nextToken());
			}
			Arrays.sort(a);
			Arrays.sort(b);
			int betweens = 0;
			int min = a[0], max = b[m - 1];
			for (int i = min; i <= max; i++) {
				if (hasFactors(i, a) && isFactor(i, b)) {
					betweens++;
				}
			}
			System.out.println(betweens);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static boolean isFactor(int num, int[] b) {
		// TODO Auto-generated method stub
		for (int i = 0; i < b.length; i++) {
			if (b[i] % num != 0)
				return false;
		}
		return true;
	}

	private static boolean hasFactors(int num, int[] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			if (num % a[i] != 0)
				return false;
		}
		return true;
	}
}
