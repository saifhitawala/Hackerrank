package search;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class HackerlandRadioTransmitters {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(tk.nextToken());
			int k = Integer.parseInt(tk.nextToken());
			tk = new StringTokenizer(br.readLine());
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(tk.nextToken());
			}
			Arrays.sort(a);
			int minNumOfTransmitters = 0;
			int i = 0;
			while (i < n) {
				minNumOfTransmitters++;
				int loc = a[i] + k;
				while (i < n && a[i] <= loc)
					i++;
				loc = a[--i] + k;
				while (i < n && a[i] <= loc)
					i++;
			}
			System.out.println(minNumOfTransmitters);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
