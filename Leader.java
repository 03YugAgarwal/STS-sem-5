// This code is self-made and not provided by ethnus team. Time complexity of this code is more than theirs;
import java.util.Scanner;

class Leader{
    public static void main(String ar[]){
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        int arr[] = {10,2,3,8,5,4,6,1};
        int n = 8;
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        System.out.println("Leaders");
        int i=0, j=n-1;
        while(i<n){
            if(arr[i]>arr[j]){
                j--;
            }else if (arr[i]<arr[j]){
                i++;
            }else if(arr[i]==arr[j]){
                System.out.println(arr[i]);
                j=n-1;
                i++;
            }
        }
    }
}