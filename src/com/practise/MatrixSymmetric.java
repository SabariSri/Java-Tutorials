package com.practise;

public class MatrixSymmetric {
	static int MAX = 100;

	// Returns true if mat[N][N]
	// is symmetric, else false
	static boolean isSymmetric(int mat[][], int N) {
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				if (mat[i][j] != mat[j][i])
					return false;
		return true;
	}

	public static void main(String[] args) {
		int mat[][] = { { 1, 3, 5 }, { 3, 2, 4 }, { 5, 4, 8 } };
		int n = mat.length;
		System.out.println("Size of the given Matrix is " + n);
		if (isSymmetric(mat, n))
			System.out.println("And yes, its a Symmetric Matrix");
		else
			System.out.println("And No, its not a Symmetric Matrix");
	}
}
