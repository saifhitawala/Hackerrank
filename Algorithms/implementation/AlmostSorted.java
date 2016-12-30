package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AlmostSorted {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(tk.nextToken());
			tk = new StringTokenizer(br.readLine());
			int a[] = new int[n];
			a[0] = Integer.parseInt(tk.nextToken());
			int l = -1, r = -1;
			boolean isReversed = false, isSwapped = false;
			for (int i = 1; i < n; i++) {
				a[i] = Integer.parseInt(tk.nextToken());
				if (isReversed) {
					if (a[i] > a[i - 1]) {
						r = i - 1;
					}
					if (l == r || l == r - 1) {
						isReversed = false;
						isSwapped = true;
					}
				}
				if (isSwapped && a[i] < a[i - 1]) {
					r = i;
				}
				if (a[i] < a[i - 1] && !isReversed && !isSwapped) {
					isReversed = true;
					l = i - 1;
				}
			}
			if (isReversed && !isSwapped && r == -1) {
				r = n - 1;
			}
			if (isReversed && r == l + 1) {
				isReversed = false;
				isSwapped = true;
			}
			boolean isSorted = true;
			for (int i = 1; i < n; i++) {
				if (a[i] < a[i - 1]) {
					isSorted = false;
					break;
				}
			}
			if (isSorted)
				System.out.println("yes");
			else {
				if (l == -1 || r == -1)
					System.out.println("no");
				else {
					isSorted = true;
					if (isSwapped) {
						int temp = a[l];
						a[l] = a[r];
						a[r] = temp;
					} else if (isReversed) {
						int temp = a[l];
						a[l] = a[r];
						a[r] = temp;
						for (int i = 1; i < n; i++) {
							if (a[i] < a[i - 1]) {
								isSorted = false;
								break;
							}
						}
						if (!isSorted) {
							l++;
							r--;
							for (int incr = 0; incr <= (r - l) / 2; incr++) {
								temp = a[l + incr];
								a[l + incr] = a[r - incr];
								a[r - incr] = temp;
							}
							isSorted = true;
						} else {
							isSwapped = true;
							isReversed = false;
						}
					}
					for (int i = 1; i < n; i++) {
						if (a[i] < a[i - 1]) {
							isSorted = false;
							break;
						}
					}
					if (isSorted && isSwapped)
						System.out.println("yes\nswap " + (l + 1) + " "
								+ (r + 1));

					else if (isSorted && isReversed)
						System.out.println("yes\nreverse " + l + " " + (r + 2));

					else
						System.out.println("no");

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
