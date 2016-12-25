package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hourrank14Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			int n = Integer.parseInt(br.readLine());
			
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int a[] = new int[n];
			for(int i=0;i<n;i++){
				a[i] = Integer.parseInt(tk.nextToken());
			}
			
			int swaps = 0;
			for(int i=0;i<n-1;i++){
				int minpos = i;
				for(int j=i+1;j<n;j++){
					if(a[j] < a[minpos])
						minpos = j;
				}
				if(minpos != i){
					int temp = a[minpos];
					a[minpos] = a[i];
					a[i] = temp;
					//System.out.println(a[i]+" "+a[minpos]);
					swaps++;
				}
			}

			System.out.println(swaps);
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
