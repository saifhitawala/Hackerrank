package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			StringBuilder sb = new StringBuilder("");

			String str = br.readLine().trim();
			int rows = (int) Math.ceil(Math.sqrt(str.length()));
			int cols = (int) Math.floor(Math.sqrt(str.length()));
			if (rows * cols < str.length())
				cols++;
			char a[][] = new char[rows][cols];
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					if (j * rows + i < str.length()) {
						a[i][j] = str.charAt(j * rows + i);
						sb.append(a[i][j]);
					}
				}
				sb.append(" ");
			}

			System.out.println(sb);
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
