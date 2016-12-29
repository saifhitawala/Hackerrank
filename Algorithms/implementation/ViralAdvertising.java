package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ViralAdvertising {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			int n = Integer.parseInt(br.readLine());

			int start = 5;
			long sum = 0;
			for (int i = 0; i < n; i++) {
				start /= 2;
				sum += start;
				start *= 3;
			}

			System.out.println(sum);
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
