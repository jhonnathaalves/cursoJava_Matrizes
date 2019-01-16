package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int [][] mat = new int [n][k];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Digite um numero: ");
		int a = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				if (a == mat[i][j]) {
					System.out.println("Position: " + i + ", " + j);
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (j < mat[i].length -1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}

				}
			}
		}

		sc.close();

	}

}
