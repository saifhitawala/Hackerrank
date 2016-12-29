package search;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class HackerlandRadioTransmitters {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(tk.nextToken());
			int k = Integer.parseInt(tk.nextToken());
			int a[] = new int[100001];
			tk = new StringTokenizer(br.readLine());
			ArrayList<Integer> al = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				int temp = Integer.parseInt(tk.nextToken());
				if (a[temp] == 0) {
					a[temp]++;
					al.add(temp);
				}
			}
			Arrays.sort(a);
			int minNumOfTransmitters = 0, temp = k, jumps = 0;
			for (int i = 0; i < al.size() - 1; i++) {
				temp -= al.get(i + 1) - al.get(i);
				if (temp == 0) {
					temp = k;
					if(jumps == 2){
						minNumOfTransmitters++;
						jumps = 0;
					}
					jumps++;
				}
				else if(temp < 0){
					temp = k;
					minNumOfTransmitters++;
					jumps = 0;
				}
				if(i == al.size()-2)
					temp -= al.get(i+1)-al.get(i);
				System.out.println("num: "+al.get(i)+" temp: "+temp+" jumps: "+jumps+" trans: "+minNumOfTransmitters);
			}
			if (temp == 0) {
				jumps++;
				if(jumps == 1){
					minNumOfTransmitters++;
				}
			}
			else if(temp < 0){
				minNumOfTransmitters++;
			}
			System.out.println(minNumOfTransmitters);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
