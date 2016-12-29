package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BeautifulDaysAtTheMovies {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			StringTokenizer tk = new StringTokenizer(br.readLine());
			long i = Long.parseLong(tk.nextToken());
			long j = Long.parseLong(tk.nextToken());
			long k = Long.parseLong(tk.nextToken());
			int count = 0;
			for (long iter = i; iter <= j; iter++) {
				if (Math.abs(iter - reversed(iter)) % k == 0)
					count++;
			}
			System.out.println(count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static long reversed(long iter) {
		// TODO Auto-generated method stub
		long reverse = 0;
		while (iter > 0) {
			reverse = (long) (iter % 10 + reverse * 10);
			iter /= 10;
		}
		return reverse;
	}
}
