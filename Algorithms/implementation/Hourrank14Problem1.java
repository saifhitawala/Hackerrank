package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hourrank14Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			StringTokenizer tk = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(tk.nextToken());
			int j = Integer.parseInt(tk.nextToken());
			int k = Integer.parseInt(tk.nextToken());

			int count = 0;
			for (int iter = i; iter <= j; iter++) {
				if (Math.abs(iter - reversed(iter)) % k == 0)
					count++;
			}

			System.out.println(count);
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static int reversed(int temp) {
		// TODO Auto-generated method stub
		int rev = 0;
		while (temp > 0) {
			rev = rev * 10 + (temp % 10);
			temp /= 10;
		}
		return rev;
	}

}
