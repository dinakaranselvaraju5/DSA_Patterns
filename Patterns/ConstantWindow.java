package Patterns;

public class ConstantWindow {

    public  static  int ConstantWindoww(int[] arr, int k){

        int n = arr.length;
        int sum = 0;
        for(int i=0;i<k;i++){
            sum = sum + arr[i];
        }
        int Maxsum = sum;
       int l = 0;
       int r = k - 1;
        while(r < n - 1){
            sum = sum - arr[l];
            l++;
            r++;
            sum = sum + arr[r];
            Maxsum = Math.max(Maxsum,sum);
        }

        return Maxsum;
    }
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        int k = 2;

        int res = ConstantWindoww(arr, k);
        System.out.println(res);
    }
}