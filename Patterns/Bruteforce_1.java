
/*

    find the maximum subarray sum not exceeding k


*/


package Patterns;

public class Bruteforce_1 {

    public  static  void Approach1(int[] arr, int k){
       // int[] res = new int[arr.length];
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum = 0 ;
            for(int j = i; j<arr.length;j++){
                sum = sum + arr[j];
                if(sum <= k){
                    maxSum = Math.max(maxSum, sum);
                }else if(sum > k){
                    break;
                }
            }
        }
        System.out.println(maxSum);

    }
    public static void main(String[] args) {
        int[] arr = {6,1,-9,11,8,9,17,23};
        int k = 47;
        Approach1(arr, k);
    }
}