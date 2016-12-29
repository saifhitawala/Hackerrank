package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ArrayGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			int n = Integer.parseInt(br.readLine());

			StringTokenizer tk = new StringTokenizer(br.readLine());
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(tk.nextToken());
			}

			long moves = 0;
			Arrays.sort(a);
			while (a[0] != a[n - 1]) {
				for (int i = 0; i < n - 1; i++) {
					a[i]++;
				}
				moves++;
				Arrays.sort(a);
			}

			System.out.println(moves);
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
