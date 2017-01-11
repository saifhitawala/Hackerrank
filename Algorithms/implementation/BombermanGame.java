package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BombermanGame {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			StringTokenizer tk = new StringTokenizer(br.readLine());
			StringBuffer sb = new StringBuffer("");
			int rows = Integer.parseInt(tk.nextToken());
			int cols = Integer.parseInt(tk.nextToken());
			int seconds = Integer.parseInt(tk.nextToken());
			boolean bombs[][] = new boolean[rows][cols];
			for (int i = 0; i < rows; i++) {
				String temp = br.readLine();
				for (int j = 0; j < cols; j++) {
					char c = temp.charAt(j);
					if (c == 'O')
						bombs[i][j] = true;
				}
			}
			if (seconds % 2 == 0) {
				for (int i = 0; i < rows; i++) {
					for (int j = 0; j < cols; j++)
						sb.append("O");
					sb.append("\n");
				}
			} else if ((seconds / 2) % 2 == 0) {
				for (int i = 0; i < rows; i++) {
					for (int j = 0; j < cols; j++) {
						if (bombs[i][j] == true)
							sb.append("O");
						else
							sb.append(".");
					}
					sb.append("\n");
				}
			} else {
				for (int i = 0; i < rows; i++) {
					for (int j = 0; j < cols; j++) {
						if (bombs[i][j]
								|| ((i - 1) >= 0 && bombs[i - 1][j])
								|| ((i + 1) < rows && bombs[i + 1][j])
								|| ((j - 1) >= 0 && bombs[i][j - 1])
								|| ((j + 1) < cols && bombs[i][j + 1]))
							sb.append(".");
						else if (!bombs[i][j]
								&& ((i - 1) >= 0 && !bombs[i - 1][j])
								&& ((i + 1) < rows && !bombs[i + 1][j])
								&& ((j - 1) >= 0 && !bombs[i][j - 1])
								&& ((j + 1) < cols && !bombs[i][j + 1]))
							sb.append(".");
						else
							sb.append("O");
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
