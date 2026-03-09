package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class mergesort {
	public static void merge(Vector<Integer> arr,int str,int mid,int end) {
		Vector<Integer> temp = new Vector<Integer>();
 
		int left = str;
		int right = mid+1;
		
		while(left<=mid && right<=end) {
			if(arr.get(left) <= arr.get(right)) {
				temp.add(arr.get(left));
				left++;
			}
			
			else if(arr.get(left) > arr.get(right)) {
				temp.add(arr.get(right));
				right++;
			}}
			
			while(left<=mid) {
				temp.add(arr.get(left));
				left++;
			}
			
			while(right<=end) {
				temp.add(arr.get(right));
				right++;
			}
		for(int i = str;i<=end;i++) {
			arr.set(i, temp.get(i-str));
		}
	}
	
	public static void sort(Vector<Integer> arr,int str,int end) {
		if(str>=end) {
			return;
		}
		int mid = str+(end-str)/2;
		
		sort(arr,str,mid);
		sort(arr,mid+1,end);
		merge(arr,str,mid,end);
	}
	
public static void main(String[] args) {
	Vector<Integer> arr= new Vector<Integer>();
	arr.add(10);
	arr.add(19);
	arr.add(1);
	arr.add(6);
	arr.add(15);
	arr.add(5);
	arr.add(8);
	
	int str = 0;
	int end = arr.size()-1;
 	sort(arr,str,end);
	System.out.println(arr);
}
}
