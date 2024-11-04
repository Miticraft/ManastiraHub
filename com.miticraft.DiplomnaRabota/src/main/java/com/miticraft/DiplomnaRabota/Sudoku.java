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
		int Zadacha[][] = 
			{{1,3,2,0,0,4,0,0,5},
			{0,0,8,0,0,0,7,3,0},
			{0,0,0,0,0,0,0,0,0},
			{0,0,7,3,0,0,5,0,0},
			{0,8,0,0,0,0,0,0,0},
			{0,0,0,0,0,6,0,4,2},
			{0,0,0,0,0,0,0,7,0},
			{0,4,0,6,2,0,0,0,1},
			{0,0,0,5,0,3,9,0,0}
				};
		
		
		Print(Zadacha);
		System.out.println();
		System.out.println();
		System.out.println();
		if (Solve(Zadacha, 0, 0)) {
			Print(Zadacha);
		}
	}

}
