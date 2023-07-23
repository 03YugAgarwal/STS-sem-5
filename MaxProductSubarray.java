import java.util.*;

class MaxProductSubarray{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int p=1;
        int s=1;
        int ans=0;
        for(int i=0;i<n;i++){
            if(p==0){
                p = 1;
            }
            if(s==0){
                s=1;
            }
            p *= arr[i];
            s *= arr[n-i-1];
            ans = Math.max(ans,Math.max(p,s));
        }
        System.out.println(ans);
        

    }
}