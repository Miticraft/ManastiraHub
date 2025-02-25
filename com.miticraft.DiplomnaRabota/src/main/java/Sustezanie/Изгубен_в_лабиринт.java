package Sustezanie;

import java.util.Scanner;

public class Изгубен_в_лабиринт {
	public static Scanner kb = new Scanner(System.in);
	public static int[] directionR = { -1, 1, 0, 0 };
	public static int[] directionC = { 0, 0, -1, 1 };

	public static boolean isSafe(char[][] a, boolean[][] visited, int n, int m, int row, int col) {
		return row >= 0 && col >= 0 && row < n && col < m && a[row][col] != '#' && !visited[row][col];
	}

	public static boolean solve(char[][] a, boolean[][] visited, int n, int m, int row, int col) {
		if (a[row][col] == 'E')
			return true;

		visited[row][col] = true; // Маркираме клетката като посетена

		for (int i = 0; i < 4; i++) {
			int nextR = row + directionR[i];
			int nextC = col + directionC[i];

			if (isSafe(a, visited, n, m, nextR, nextC)) {
				if (solve(a, visited, n, m, nextR, nextC)) {
					return true;
				}
			}
		}

		return false;
	}

	public static void main(String[] args) {
        int t = kb.nextInt();

        while (t-- > 0) {
            int n = kb.nextInt();
            int m = kb.nextInt();
            kb.nextLine();

            char[][] maze = new char[n][m];
            boolean[][] visited = new boolean[n][m];

            int startX = -1, startY = -1;

            for (int i = 0; i < n; i++) {
                String line = kb.nextLine();
                for (int j = 0; j < m; j++) {
                    maze[i][j] = line.charAt(j);
                    if (maze[i][j] == 'S') {
                        startX = i;
                        startY = j;
                    }
                }
            }
            if(solve(maze, visited, n, m, startX, startY)) {
            	System.out.println("Yes");
            }else {
            	System.out.println("No");
            }
        }
    }
}
