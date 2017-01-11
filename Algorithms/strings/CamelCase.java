package strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CamelCase {
	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			String s = br.readLine();
			int numOfWords = 1;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) >= 65 && s.charAt(i) <= 90)
					numOfWords++;
			}
			System.out.println(numOfWords);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
