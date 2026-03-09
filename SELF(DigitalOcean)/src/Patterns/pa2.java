package Patterns;

import java.util.Iterator;

public class pa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r = 5;
		
		for(int i = 0;i<5;i++) {
			for(int j = 1;j<r-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
