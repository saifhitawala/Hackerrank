package constructive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NewYearChaos {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			StringTokenizer tk = new StringTokenizer(br.readLine());
			StringBuffer sb = new StringBuffer("");
			int tests = Integer.parseInt(tk.nextToken());
			while (tests-- > 0) {
				tk = new StringTokenizer(br.readLine());
				int n = Integer.parseInt(tk.nextToken());
				tk = new StringTokenizer(br.readLine());
				int bribes = 0, i = 0;
				for (i = 0; i < n; i++) {
					int temp = Integer.parseInt(tk.nextToken());
					if (temp - i - 1 > 2)
						break;
					if (temp - i - 1 > 0)
						bribes += (temp - i - 1);
					else if (temp - i - 1 < 0)
						bribes += (i + 1 - temp) / 2;
				}
				if (i < n)
					sb.append("Too chaotic\n");
				else
					sb.append(bribes + "\n");
			}
			System.out.println(sb);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
