package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AppleAndOrange {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			StringTokenizer tk = new StringTokenizer(br.readLine());
			long s = Long.parseLong(tk.nextToken());
			long t = Long.parseLong(tk.nextToken());
			tk = new StringTokenizer(br.readLine());
			long a = Long.parseLong(tk.nextToken());
			long b = Long.parseLong(tk.nextToken());
			tk = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(tk.nextToken());
			int n = Integer.parseInt(tk.nextToken());
			tk = new StringTokenizer(br.readLine());
			int numOfApplesOnHouse = 0;
			for (int i = 0; i < m; i++) {
				Long temp = Long.parseLong(tk.nextToken());
				if (temp + a >= s && temp + a <= t)
					numOfApplesOnHouse++;
			}
			tk = new StringTokenizer(br.readLine());
			int numOfOrangesOnHouse = 0;
			for (int i = 0; i < n; i++) {
				Long temp = Long.parseLong(tk.nextToken());
				if (temp + b >= s && temp + b <= t)
					numOfOrangesOnHouse++;
			}
			System.out.println(numOfApplesOnHouse);
			System.out.println(numOfOrangesOnHouse);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
