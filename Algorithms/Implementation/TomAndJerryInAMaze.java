package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TomAndJerryInAMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			int row = Integer.parseInt(br.readLine());
			int col = Integer.parseInt(br.readLine());

			int maze[][] = new int[row][col];
			boolean mazeBool[][] = new boolean[row][col];
			for (int i = 0; i < row; i++) {
				StringTokenizer tk = new StringTokenizer(br.readLine());
				for (int j = 0; j < col; j++) {
					maze[i][j] = Integer.parseInt(tk.nextToken());
					mazeBool[i][j] = false;
				}
			}
			mazeBool[0][0] = true;
			
			int x = Integer.parseInt(br.readLine());
			int y = Integer.parseInt(br.readLine());

			boolean isPossible = true;
			int i = 0, j = 0, moves = 0;
//			while (true) {
//				if (i == x && j == y) {
//					isPossible = true;
//					break;
//				} else if (j + 1 < col
//						&& (maze[i][j + 1] == 2 || maze[i][j + 1] == 0)) {
//					moves++;
//					j++;
//				} else if (i + 1 < row
//						&& (maze[i + 1][j] == 2 || maze[i + 1][j] == 0)) {
//					moves++;
//					i++;
//				} else if (j - 1 > -1
//						&& (maze[i][j - 1] == 2 || maze[i][j - 1] == 0)) {
//					moves++;
//					j--;
//				} else if (i - 1 > -1
//						&& (maze[i - 1][j] == 2 || maze[i - 1][j] == 0)) {
//					moves++;
//					i++;
//				} else {
//					isPossible = false;
//					break;
//				}
//			}
			
			moves = getMoves(maze, mazeBool, x, y, i, j, moves);

			System.out.println(moves);
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static int getMoves(int[][] maze, boolean[][] mazeBool, int x, int y, int i, int j, int moves) {
		// TODO Auto-generated method stub
		if(i == x && j == y)
			return moves;
		if(j+1 < maze[i].length && (maze[i][j+1] == 2 || maze[i][j+1] == 0) && !mazeBool[i][j+1]){
			mazeBool[i][j+1] = true;
			if(i == x && j+1 == y)
				return moves+1;
			getMoves(maze, mazeBool, x, y, i, j+1, ++moves);
		}
		if(j-1 > 0 && (maze[i][j-1] == 2 || maze[i][j-1] == 0) && !mazeBool[i][j-1]){
			mazeBool[i][j-1] = true;
			if(i == x && j-1 == y)
				return moves+1;
			getMoves(maze, mazeBool, x, y, i, j-1, ++moves);
		}
		if(i+1 < maze.length && (maze[i+1][j] == 2 || maze[i+1][j] == 0) && !mazeBool[i+1][j]){
			mazeBool[i+1][j] = true;
			if(i+1 == x && j == y)
				return moves+1;
			getMoves(maze, mazeBool, x, y, i+1, j, ++moves);
		}
		if(i-1 > 0 && (maze[i-1][j] == 2 || maze[i-1][j] == 0) && !mazeBool[i-1][j]){
			mazeBool[i-1][j] = true;
			if(i-1 == x && j == y)
				return moves+1;
			getMoves(maze, mazeBool, x, y, i-1, j, ++moves);
		}
		return -1;
	}

}
