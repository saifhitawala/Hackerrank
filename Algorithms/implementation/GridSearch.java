package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GridSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			StringBuilder sb = new StringBuilder("");

			int t = Integer.parseInt(br.readLine());

			while (t-- > 0) {
				String[] str = br.readLine().trim().split(" ");
				int R = Integer.parseInt(str[0]);
				int C = Integer.parseInt(str[1]);
				int G[][] = new int[R][C];
				for (int i = 0; i < R; i++) {
					str = br.readLine().trim().split("");
					for (int j = 0; j < C; j++) {
						G[i][j] = Integer.parseInt(str[j]);
					}
				}

				str = br.readLine().trim().split(" ");
				int r = Integer.parseInt(str[0]);
				int c = Integer.parseInt(str[1]);
				int p[][] = new int[r][c];
				for (int i = 0; i < r; i++) {
					str = br.readLine().trim().split("");
					for (int j = 0; j < c; j++) {
						p[i][j] = Integer.parseInt(str[j]);
					}
				}

				boolean occurs = false;
				outer: for (int i = 0; i <= R - r; i++) {
					for (int j = 0; j <= C - c; j++) {
						check: if (G[i][j] == p[0][0]) {
							boolean possible = true;
							for (int x = 0; x < r; x++) {
								for (int y = 0; y < c; y++) {
									if (p[x][y] != G[i + x][j + y]) {
										possible = false;
										break check;
									}
								}
							}
							if (possible) {
								occurs = true;
								break outer;
							}
						}
					}
				}

				if (occurs)
					sb.append("YES\n");
				else
					sb.append("NO\n");
			}

			System.out.println(sb);
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
