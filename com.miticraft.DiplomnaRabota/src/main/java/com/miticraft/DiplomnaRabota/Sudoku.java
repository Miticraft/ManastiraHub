package com.miticraft.DiplomnaRabota;
import java.util.*;
public class Sudoku {
public static int N = 9;
public static void Print(int[][] Zadacha) {

	for (int i = 0; i < N; i++) {
		for (int j = 0; j < N; j++) {
			System.out.print(Zadacha[i][j]+" , ");
			if (j==2||j==5||j==8) {
				System.out.print("| ");
			}
		}
		if (i ==2||i==5||i==8) {
			System.out.println();
			for (int j = 0; j < N; j++) {
				System.out.print("_____");
			}
		}
		System.out.println();
	}
}
public static boolean isSafe(int a[][], int rows, int cols, int num) {
	for (int i = 0; i < N; i++) {
		if (a[rows][i] == num) {
			return false;
		}
	}for (int i = 0; i < N; i++) {
		if (a[i][cols] == num) {
			return false;
		}
	}
	int startRow = rows - rows%3;
	int startCol = cols - cols%3;
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			if(a[i+startRow][j+startCol] == num) {
				return false;
			}
		}
	}
	return true;
}
public static boolean Solve(int a[][], int rows, int cols) {
	if(rows == N-1 && cols == N-1) {
		return true;
	}
	if(cols == N) {
		cols = 0;
		rows++;
	}
	if(a[rows][cols] != 0) {
		return Solve(a, rows, cols+1);
	}
	for (int i = 1; i< 10; i++) {
		if (isSafe(a, rows, cols, i)) {
			a[rows][cols] = i;
			if (Solve(a, rows, cols+1)) {
				return true;
			}
			a[rows][cols] = 0;
		}
	}
	return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Zadacha[][] = new int[N][N];
		Zadacha[0][0] = 5;
		Zadacha[0][1] = 3;
		Zadacha[0][4] = 7;
		Zadacha[1][0] = 6;
		Zadacha[1][3] = 1;
		Zadacha[1][4] = 9;
		Zadacha[1][5] = 5;
		Zadacha[2][1] = 9;
		Zadacha[2][2] = 8;
		Zadacha[2][7] = 6;
		Zadacha[3][0] = 8;
		Zadacha[3][4] = 6;
		Zadacha[3][8] = 3;
		Zadacha[4][0] = 4;
		Zadacha[4][3] = 8;
		Zadacha[4][5] = 3;
		Zadacha[4][8] = 1;
		Zadacha[5][0] = 7;
		Zadacha[5][4] = 2;
		Zadacha[5][8] = 6;
		Zadacha[6][1] = 6;
		Zadacha[6][6] = 2;
		Zadacha[6][7] = 8;
		Zadacha[7][3] = 4;
		Zadacha[7][4] = 1;
		Zadacha[7][5] = 9;
		Zadacha[7][8] = 5;
		Zadacha[8][4] = 8;
		Zadacha[8][7] = 7;
		Zadacha[8][8] = 9;
		Print(Zadacha);
		System.out.println();
		System.out.println();
		System.out.println();
		if (Solve(Zadacha, 0, 0)) {
			Print(Zadacha);
		}
	}

}
