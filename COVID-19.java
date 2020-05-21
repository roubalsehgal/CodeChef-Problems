// Problem Link: https://www.codechef.com/problems/COVID19

import java.util.Scanner;
class Codechef {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System. in );
		int t = sc.nextInt();
		int n;
		int[] arr;
		while (t != 0) {
			n = sc.nextInt();
			arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			int[] diff = new int[n];
			diff[0] = 0;
			for (int j = 1; j < n; j++) {
				diff[j] = arr[j] - arr[j - 1];
			}

			int cnt = 1;
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;

			for (int k = 1; k < n; k++) {
				if (diff[k] <= 2) {
					cnt++;
				} else {
					min = Math.min(cnt, min);
					max = Math.max(cnt, max);
					cnt = 1;
				}
			}
			min = Math.min(cnt, min);
			max = Math.max(cnt, max);

			System.out.println(min + " " + max);
			t--;
		}
	}
}