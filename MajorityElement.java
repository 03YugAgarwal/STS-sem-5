// Solution is not by ethnus but by me. Time complexity might be different
import java.util.Scanner;

class MajorityElement{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int max = -100;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            max = Math.max(max,arr[i]);
        }
        int temp[] = new int[max+1];
        for(int i=0;i<max;i++){
            temp[i] = 0;
        }

        for(int i=0;i<n;i++){
            temp[arr[i]]++;
        }
        int t = 0;
        int ele = 0;
        for(int i=0;i<max;i++){
            t = Math.max(t,temp[i]);
        }
        for(int i=0;i<max;i++){
            if(t==temp[i]){
                ele = arr[i];
            }
        }
        System.out.println(ele);

    }
}