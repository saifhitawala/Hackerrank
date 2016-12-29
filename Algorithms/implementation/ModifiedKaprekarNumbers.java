package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ModifiedKaprekarNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			StringBuilder sb = new StringBuilder("");

			int p = Integer.parseInt(br.readLine());
			int q = Integer.parseInt(br.readLine());
			int count = 0;

			if (p <= 1 && q >= 1) {
				sb.append("1 ");
				count++;
			}
			for (int i = p; i <= q; i++) {
				long square = (long) i * (long) i;
				String sq = Long.toString(square);
				String r = sq.substring(sq.length() / 2, sq.length());
				String l = sq.substring(0, sq.length() / 2);
				if (l.length() > 0 && r.length() > 0
						&& Integer.parseInt(l) + Integer.parseInt(r) == i) {
					sb.append(i + " ");
					count++;
				}
			}

			if (count > 0)
				System.out.println(sb);
			else
				System.out.println("INVALID RANGE");
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
