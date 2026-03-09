package String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class binarysearch {
	
	public static boolean search(int key,int[] arr) {
		int mid = (arr.length-1)/2;
			if(key < arr[mid]) {
			for(int i = 0;i<mid;i++) {
			if(key == arr[i]) {
			return true;
			}
			}
			return false;
			}
		
			else if(key > arr[mid]) {
			for(int i = mid;i<arr.length-1;i++) {
			if(key == arr[i]) {
			return true;
			}
			}
			return false;}
		
			else if(key == arr[mid]) {
				return true;
			}
			else {
				return false;
			}
	
		}
	
public static void main(String[] args) {
int arr[] = {29,13,56,3,2,6,7,8,13};
Arrays.sort(arr);
System.out.println(Arrays.toString(arr));
int key = 15;

if(search(key,arr)) {
	System.out.println("element is present");
}
else{
	System.out.println("Element is not present");
};

}
}
