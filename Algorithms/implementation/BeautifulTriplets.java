package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BeautifulTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			StringTokenizer tk = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(tk.nextToken());
			int d = Integer.parseInt(tk.nextToken());

			int a[] = new int[n];
			boolean flags[] = new boolean[20001];
			tk = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(tk.nextToken());
				flags[a[i]] = true;
			}

			int triplets = 0;
			for (int i = 0; i < n; i++) {
				if (flags[a[i] + d] && flags[a[i] + (2 * d)]) {
					triplets++;
				}
			}

			System.out.println(triplets);
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
