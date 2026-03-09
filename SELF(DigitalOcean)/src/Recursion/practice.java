package prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
int[] arr = {2,4,5,7,8,9};
int sum = 11;

for(int i = 0;i<arr.length;i++) {
	for(int j =i+1;j<arr.length;j++) {
		if(arr[i]+arr[j] == sum) {
			System.out.println("("+arr[i]+", "+arr[j]+")");
		}
	}
}
	}
	}
