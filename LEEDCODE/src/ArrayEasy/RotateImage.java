package ArrayEasy;

public class RotateImage {
	public void rotate(int[][] matrix) {
		int n = matrix.length;

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		for (int j = 0; j < n; j++) {
			int left = 0;
			int right = n - 1;
			while (left < right) {
				int temp = matrix[j][left];
				matrix[j][left] = matrix[j][right];
				matrix[j][right] = temp;
				left++;
				right--;
			}

		}
	}

	public static void main(String[] args) {

	}
}
