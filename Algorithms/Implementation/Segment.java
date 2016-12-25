package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Segment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			

			int x = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());

			StringTokenizer tk = new StringTokenizer(br.readLine());
			int a[] = new int[n];
			for(int i=0;i<n;i++){
				a[i] = Integer.parseInt(tk.nextToken());
			}

			int max = Integer.MIN_VALUE;
			for(int i=0;i<n-x+1;i++){
				int min = Integer.MAX_VALUE;
				for(int j=i;j<i+x;j++){
					if(min > a[j])
						min = a[j];
				}
				if(max < min){
					max = min;
				}
			}
			
			System.out.println(max);
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
