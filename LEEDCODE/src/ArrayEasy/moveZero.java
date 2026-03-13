package ArrayEasy;

public class moveZero {
    public void moveZeroes(int[] nums) {
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
                for(int j = i;j<nums.length-1;j++){
                    if(nums[j]<nums[j+1]){
                        int temp = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = temp;
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
		
	}
}
