package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TaumAndBday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			StringBuilder sb = new StringBuilder("");

			int t = Integer.parseInt(br.readLine());
			while (t-- > 0) {

				StringTokenizer tk = new StringTokenizer(br.readLine());
				long b = Integer.parseInt(tk.nextToken());
				long w = Integer.parseInt(tk.nextToken());
				tk = new StringTokenizer(br.readLine());
				long x = Integer.parseInt(tk.nextToken());
				long y = Integer.parseInt(tk.nextToken());
				long z = Integer.parseInt(tk.nextToken());

				long cost = 0;
				if (x + z < y)
					cost += x * b + (x + z) * w;
				else if (y + z < x)
					cost += (y + z) * b + y * w;
				else
					cost += x * b + y * w;

				sb.append(cost + "\n");
			}

			System.out.println(sb);
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
