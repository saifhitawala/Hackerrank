package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChocolateFeast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			StringBuilder sb = new StringBuilder("");

			int t = Integer.parseInt(br.readLine());

			while (t-- > 0) {
				StringTokenizer tk = new StringTokenizer(br.readLine());
				int n = Integer.parseInt(tk.nextToken());
				int c = Integer.parseInt(tk.nextToken());
				int m = Integer.parseInt(tk.nextToken());
				int sweets = n / c;
				int wrappers = sweets;
				while (wrappers >= m) {
					sweets += wrappers / m;
					wrappers = wrappers / m + wrappers % m;
				}
				sb.append(sweets + "\n");
			}

			System.out.println(sb);
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
