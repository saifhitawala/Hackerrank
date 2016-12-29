package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class ExtraLongFactorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			int n = Integer.parseInt(br.readLine());

			BigInteger fact = new BigInteger("1");
			for (int i = n; i > 1; i--) {
				fact = fact.multiply(BigInteger.valueOf(i));
			}

			System.out.println(fact);
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
