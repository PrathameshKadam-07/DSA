package Arrays;


public class SetMatrixZeroes {
	
	public void zeroMatrix(int[][] mar) {
		boolean[] row = new boolean[mar.length];
		boolean[] col = new boolean[mar[0].length];
		
//		MAP/MARK ZERO TRUE
		for(int i = 0;i<mar.length;i++) {
			for(int j = 0 ;j<mar[0].length;j++) {
				if(mar[i][j]==0) {
					row[i] = true;
					col[j] = true;
				}
			}
		}
		
//		PUT 0
		for(int i = 0;i<mar.length;i++) {
			for(int j = 0 ;j<mar[0].length;j++) {
				if(row[i] || col[j]) {
					mar[i][j] = 0;
				}
			}
		}
		
//		PRINT
		for(int i = 0;i<mar.length;i++) {
			System.out.print("[");
			for(int j = 0 ;j<mar[0].length;j++) {
				System.out.print(mar[i][j]+ " ");
			}
			System.out.print("]");
			System.out.println();
		}
	}
	
public static void main(String[] args) {
	int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
	SetMatrixZeroes sm = new SetMatrixZeroes();
	
	sm.zeroMatrix(matrix);
}
}
