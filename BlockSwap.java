import java.util.*;

class BlockSwap{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int temp[] = new int[k];
        for(int i=0;i<k;i++){
            temp[i] = arr[i];
        }
        for(int i=0;i<n-k;i++){
            arr[i] = arr[i+k];
        }
        for(int i=0;i<k;i++){
            arr[i+n-k] = temp[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

    }
}