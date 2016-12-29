package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BiggerIsGreater {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			StringBuilder output = new StringBuilder("");
			int t = Integer.parseInt(br.readLine());
			while (t-- > 0) {
				String input = br.readLine();
				boolean isPossible = false;
				int a[] = new int[26];
				a[input.charAt(input.length() - 1) - 'a']++;
				int max = input.charAt(input.length() - 1) - 'a';
				int idx = max;
				for (int i = input.length() - 2; i >= 0; i--) {
					a[input.charAt(i) - 'a']++;
					if (input.charAt(i) - 'a' < max) {
						isPossible = true;
						idx = input.charAt(i) - 'a';
						input = input.substring(0, i);
						break;
					} else {
						max = input.charAt(i) - 'a';
					}
				}
				if (isPossible) {
					for (int i = idx + 1; i < 26; i++) {
						if (a[i] > 0) {
							a[i] -= 1;
							input += (char) (i + 'a');
							break;
						}
					}
					StringBuilder sb = new StringBuilder(input);
					for (int i = 0; i < 26; i++) {
						while (a[i] > 0) {
							sb.append((char) (i + 'a'));
							a[i]--;
						}
					}
					output.append(sb + "\n");
				} else {
					output.append("no answer\n");
				}
			}
			System.out.println(output);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
