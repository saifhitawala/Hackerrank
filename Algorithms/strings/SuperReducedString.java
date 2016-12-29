package strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SuperReducedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			StringBuilder s = new StringBuilder(br.readLine());
			boolean isDeleted = true;

			while (isDeleted && s.length() > 1) {
				isDeleted = false;
				StringBuilder newS = new StringBuilder("");
				for (int i = 0; i < s.length(); i++) {
					if (i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1))
						newS.append(s.charAt(i));
					else {
						isDeleted = true;
						i++;
					}
				}
				s = newS;
			}

			if (s.length() == 0)
				System.out.println("Empty String");
			else
				System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
