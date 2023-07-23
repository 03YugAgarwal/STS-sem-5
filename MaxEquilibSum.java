import java.util.Scanner;

class MaxEquilibSum{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);

        int arr[] = {-2,5,3,3,2,6,-4,2};
        int n = arr.length;

        int pre[] = new int[n];
        int suf[] = new int[n];
        int ans = -100;

        pre[0] = arr[0];
        for(int i=1;i<n;i++){
            pre[i] = pre[i-1] + arr[i];
        }
        suf[n-1] = arr[n-1];
        if(suf[n-1] == pre[n-1]){
            ans = Math.max(ans,pre[n-1]);
        }
        for(int i=n-2;i>=0;i--){
            suf[i] = suf[i+1] + arr[i];
            if(suf[i]==pre[i]){
                ans = Math.max(ans,pre[n-1]);
            }
        }

        System.out.println(ans);

    }
}