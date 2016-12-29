package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CavityMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			StringBuilder sb = new StringBuilder("");

			int n = Integer.parseInt(br.readLine());

			int a[][] = new int[n][n];
			char copy[][] = new char[n][n];
			for (int i = 0; i < n; i++) {
				String[] str = br.readLine().split("");
				for (int j = 0; j < n; j++) {
					a[i][j] = Integer.parseInt(str[j]);
					copy[i][j] = (char) a[i][j];
				}
			}

			for (int i = 1; i < n - 1; i++) {
				for (int j = 1; j < n - 1; j++) {
					if (a[i][j] > a[i - 1][j] && a[i][j] > a[i][j - 1]
							&& a[i][j] > a[i + 1][j] && a[i][j] > a[i][j + 1])
						copy[i][j] = 'X';
				}
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if(copy[i][j] == 'X')
						sb.append(copy[i][j]);
					else
						sb.append(a[i][j]);
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
