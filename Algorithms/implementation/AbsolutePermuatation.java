package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AbsolutePermuatation {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			StringBuffer sb = new StringBuffer("");
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int t = Integer.parseInt(tk.nextToken());
			while (t-- > 0) {
				tk = new StringTokenizer(br.readLine());
				int n = Integer.parseInt(tk.nextToken());
				int k = Integer.parseInt(tk.nextToken());
				boolean used[] = new boolean[n + 1];
				int ans[] = new int[n];
				int i = 0;
				for (i = 1; i < n + 1; i++) {
					if (i - k >= 1 && !used[i - k]) {
						used[i - k] = true;
						ans[i - 1] = i - k;
					} else if (i + k <= n && !used[i + k]) {
						used[i + k] = true;
						ans[i - 1] = i + k;
					} else
						break;
				}
				if (i < n + 1)
					sb.append("-1\n");
				else {
					for (i = 0; i < n; i++) {
						sb.append(ans[i] + " ");
					}
					sb.append("\n");
				}
			}
			System.out.println(sb);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
