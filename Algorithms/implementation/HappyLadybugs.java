package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HappyLadybugs {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			StringBuilder sb = new StringBuilder("");
			int g = Integer.parseInt(br.readLine());
			while (g-- > 0) {
				int n = Integer.parseInt(br.readLine());
				String s = br.readLine();
				int a[] = new int[27];
				for (int i = 0; i < n; i++) {
					char ch = s.charAt(i);
					if (ch == '_')
						a[26]++;
					else
						a[ch - 'A']++;
				}
				boolean isPossible = true;
				if (a[26] == 0) {
					int happyladybugs = 0;
					for (int i = 0; i < n; i++) {
						char ch = s.charAt(i);
						if ((i > 0 && s.charAt(i - 1) == ch)
								|| (i < n - 1 && ch == s.charAt(i + 1))) {
							happyladybugs++;
						}
					}
					if (n != happyladybugs)
						isPossible = false;
				}
				if (isPossible) {
					for (int i = 0; i < 26; i++) {
						if (a[i] == 1)
							isPossible = false;
					}
				}
				if (isPossible)
					sb.append("YES\n");
				else
					sb.append("NO\n");
			}
			System.out.println(sb);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
