package prac;

public class LinearSeacrh {
	public static int ls(int[] arr,int t) {
	for(int i = 0;i<arr.length;i++) {
		if(arr[i]==t) {
			return 1;
		}
	}
		return -1;
	}
public static void main(String[] args) {
	int[] arr = {10,2,4,63,26,9};
	int t = 63;

int val = ls(arr,t);
if(val!= -1) {
	System.out.println("yes number is present");
}
else {
	System.out.println("Number is not present in arr");
}
}
}
