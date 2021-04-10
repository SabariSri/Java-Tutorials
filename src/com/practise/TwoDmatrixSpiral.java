package com.practise;

import java.util.LinkedList;
import java.util.List;

public class TwoDmatrixSpiral {
	static String s;

	// Function print matrix in spiral form
	   public static List<Integer> spiralPrint(int r2, int c2, int a[][]) {
		int i, r1 = 0, c1 = 0;
		/*
		 * k - starting row index m - ending row index l - starting column index n -
		 * ending column index i - iterator
		 */
		List<Integer> list = new LinkedList<Integer>();
		while (r1 < r2 && c1 < c2) {
			// Print the first row from the remaining rows
			for (i = c1; i < c2; ++i) {			
				 list.add(a[r1][i]);
			}
			r1++;
			// Print the last column from the remaining columns
			for (i = r1; i < r2; ++i) {
				list.add(a[i][c2 - 1]);
			}
			c2--;

			// Print the last row from the remaining rows */
			if (r1 < r2) {
				for (i = c2 - 1; i >= c1; --i) {
					list.add(a[r2 - 1][i]);
				}
				r2--;
			}
			// Print the first column from the remaining columns */
			if (c1 < c2) {
				for (i = r2 - 1; i >= r1; --i) {
					list.add(a[i][c1]);
				}
				c1++;
			}
		}
		return list;
	}

	// driver program
	public static void main(String[] args) {
		int R = 3;
		int C = 6;
		int a[][] = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 } };
		List<Integer> list = new LinkedList<Integer>();
		list = spiralPrint(R, C, a);
		for(int i:list) {
			if(s==null) {
				s= new String();
				System.out.print(i);
			}else {
				System.out.print(", " + i);
			}
		}
	}
}
