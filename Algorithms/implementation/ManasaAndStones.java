package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ManasaAndStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			StringBuilder sb = new StringBuilder("");

			int t = Integer.parseInt(br.readLine());

			while (t-- > 0) {
				int n = Integer.parseInt(br.readLine());
				int a = Integer.parseInt(br.readLine());
				int b = Integer.parseInt(br.readLine());
				int max = Math.max(a, b);
				int min = Math.min(a, b);
				if (n == 1)
					sb.append("0 ");
				else {
					if (a == b) {
						sb.append((n - 1) * a + " ");
					} else {
						for (int i = 0; i < n; i++) {
							int ans = i * max + (n - i - 1) * min;
							sb.append(ans + " ");
						}
					}
				}
				sb.append("\n");
			}

			System.out.println(sb);
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
