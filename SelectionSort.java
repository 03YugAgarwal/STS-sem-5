import java.util.Scanner;

class SelectionSort{

    static void sort_arr(int arr[],int n){
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String ar[]){
        int arr[] = {10,9,8,7,6,5,4,3,2,1};
        int n = 10;
        sort_arr(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}