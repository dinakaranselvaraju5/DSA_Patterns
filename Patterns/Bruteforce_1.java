
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

    public static  void BetterApproach1(int[] arr , int k){

        int l = 0;
        int r = 0;
        int Maxsum = 0;
        int sum = 0;
        int n = arr.length;

        while(r < n - 1){
            sum = sum + arr[r];
            while(sum > k){
                sum = sum - arr[l];
                l++;
            }
            if(sum <= k){
                Maxsum = Math.max(Maxsum, sum);
            }
            r++;

        }
    }

    public static void main(String[] args) {
        int[] arr = {2,5,1,10,10};
        int k = 14;
        Approach1(arr, k);
        BetterApproach1(arr, k);
    }
}