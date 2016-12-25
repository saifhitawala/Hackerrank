package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MiniMaxSum {
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer tk = new StringTokenizer(br.readLine());
			StringBuilder sb = new StringBuilder("");
			int n = 5; //Number of integers passed
			int a[] = new int[n];
			for(int i=0;i<a.length;i++){
				a[i] = Integer.parseInt(tk.nextToken());
			}
			Arrays.sort(a);
			long min = 0, max = 0;
			for(int i=0;i<n-1;i++){ //Since, sum is 1 less than number of integers passed
				min += a[i];
			}
			for(int i=1;i<n;i++){
				max += a[i];
			}
			sb.append(min+" "+max);
			System.out.println(sb);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
