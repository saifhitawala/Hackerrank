package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACMICPCTeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			StringTokenizer tk = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(tk.nextToken());
			int m = Integer.parseInt(tk.nextToken());

			int a[][] = new int[n][m];
			for (int i = 0; i < n; i++) {
				String[] str = br.readLine().split("");
				for (int j = 0; j < m; j++) {
					a[i][j] = Integer.parseInt(str[j]);
				}
			}

			int max = 0, teams = 0;
			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					int temp = 0;
					for (int k = 0; k < m; k++) {
						if (a[i][k] > 0 || a[j][k] > 0)
							temp++;
					}
					if (temp > max) {
						max = temp;
						teams = 1;
					} else if (temp == max) {
						teams++;
					}
				}
			}

			System.out.println(max);
			System.out.println(teams);
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
