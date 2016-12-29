package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EqualizeTheArray {
	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(tk.nextToken());
			int a[] = new int[101];
			tk = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				a[Integer.parseInt(tk.nextToken())]++;
			}
			int max = a[1];
			for (int i = 2; i < 101; i++) {
				if (a[i] > max)
					max = a[i];
			}
			System.out.println(n - max);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
