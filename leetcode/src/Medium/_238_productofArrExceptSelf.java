package Medium;

import java.util.Arrays;

public class _238_productofArrExceptSelf {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(productExceptSelf(new int[] {1,2,3,4})));
	}
	
	public static int[] productExceptSelf(int[] nums) {
        int num = 1;
        for(int i=0;i<nums.length;i++) {
            num*=nums[i];
        }

        int[] arr = new int[nums.length];

        for(int j=0;j<nums.length;j++) {
            int n = nums[j];
            int binaryToDec = Integer.parseInt(Integer.toString(n>>1));
            System.out.println(binaryToDec);
            if(n%2==0) {
                arr[j] = num>>binaryToDec;
            } 
            else {
                arr[j] = num<<binaryToDec;
            }
        } 

        System.out.println(Arrays.toString(arr));
        return arr;
    }
}

