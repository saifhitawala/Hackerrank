package constructive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FlippingTheMatrix {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			StringBuilder sb = new StringBuilder("");
			int q = Integer.parseInt(br.readLine());
			while (q-- > 0) {
				int n = Integer.parseInt(br.readLine());
				int a[][] = new int[2 * n][2 * n];
				for (int i = 0; i < 2 * n; i++) {
					StringTokenizer tk = new StringTokenizer(br.readLine());
					for (int j = 0; j < 2 * n; j++) {
						a[i][j] = Integer.parseInt(tk.nextToken());
					}
				}
				int sum = 0;
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						sum += getMax(i, j, a, n);
					}
				}
				sb.append(sum + "\n");
			}
			System.out.println(sb);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static int getMax(int x, int y, int[][] a, int n) {
		// TODO Auto-generated method stub
		int max = a[x][y];
		if (a[x][(2 * n) - 1 - y] > max)
			max = a[x][(2 * n) - 1 - y];
		if (a[(2 * n) - 1 - x][y] > max)
			max = a[(2 * n) - 1 - x][y];
		if (a[(2 * n) - 1 - x][(2 * n) - 1 - y] > max)
			max = a[(2 * n) - 1 - x][(2 * n) - 1 - y];
		return max;
	}
}
