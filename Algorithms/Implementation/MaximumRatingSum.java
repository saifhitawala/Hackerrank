package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumRatingSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			int n = Integer.parseInt(br.readLine());

			StringTokenizer tk = new StringTokenizer(br.readLine());
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(tk.nextToken());
			}

			long sum = 0, temp = 0, max = Long.MIN_VALUE;
			boolean allNegs = true;
			for (int i = 0; i < arr.length; i++) {
				if (max < arr[i])
					max = arr[i];
				if (arr[i] >= 0) {
					temp += arr[i];
					allNegs = false;
				}
				else
					temp = 0;
				if (temp > sum)
					sum = temp;
			}
			if (allNegs) {
				sum = max;
			}

			System.out.println(sum);
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
