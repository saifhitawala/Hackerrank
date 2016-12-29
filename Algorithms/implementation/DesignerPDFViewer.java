package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DesignerPDFViewer {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int alphabetSize = 26; // Number of letters in alphabet
			int letterHeight[] = new int[alphabetSize];
			for (int i = 0; i < letterHeight.length; i++) {
				letterHeight[i] = Integer.parseInt(tk.nextToken());
			}
			String word = br.readLine();
			int areaOfSelectedWord = word.length();
			int maxHeightOfWord = 0;
			for (int i = 0; i < word.length(); i++) {
				if (letterHeight[word.charAt(i) - 97] > maxHeightOfWord)
					maxHeightOfWord = letterHeight[word.charAt(i) - 97];
			}
			areaOfSelectedWord *= maxHeightOfWord;
			System.out.println(areaOfSelectedWord);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
