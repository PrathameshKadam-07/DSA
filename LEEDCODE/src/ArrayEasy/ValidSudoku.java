package ArrayEasy;

import java.util.HashSet;

public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < board.length; i++) {

			HashSet<Character> h = new HashSet<>();

			for (int j = 0; j < board[i].length; j++) {
				char c = board[i][j];
				if (c != '.') {
					if (h.contains(c)) {
						return false;
					}
					h.add(board[i][j]);
				}
			}
		}

		for (int j = 0; j < board[0].length; j++) {

			HashSet<Character> h = new HashSet<>();

			for (int i = 0; i < board.length; i++) {

				char c = board[i][j];

				if (c != '.') {
					if (h.contains(c)) {
						return false;
					}
					h.add(board[i][j]);
				}
			}
		}

		for (int boxrow = 0; boxrow < board.length; boxrow += 3) {
			for (int boxcol = 0; boxcol < board[0].length; boxcol += 3) {

				HashSet<Character> h = new HashSet<>();
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {

						char c = board[boxrow + i][boxcol + j];
						if (c != '.') {
							if (h.contains(c)) {
								return false;
							}
							h.add(board[boxrow + i][boxcol + j]);
						}
					}
				}
			}
		}

		return true;
	}

	public static void main(String[] args) {

	}
}
