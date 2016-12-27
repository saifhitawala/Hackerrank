package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ApendAndDelete {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			String s = br.readLine();
			String t = br.readLine();
			int k = Integer.parseInt(br.readLine());
			int diff = 0;
			for (int i = 0; i < (s.length() > t.length() ? t.length() : s
					.length()); i++) {
				if (s.charAt(i) != t.charAt(i)) {
					diff = s.length() + t.length() - 2 * i;
					break;
				}
			}
			if (diff == 0) {
				diff = Math.abs(s.length() - t.length());
			}
			if (diff <= k
					&& ((s.length() + t.length() < k) || (k - diff) % 2 == 0))
				System.out.println("Yes");
			else
				System.out.println("No");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
