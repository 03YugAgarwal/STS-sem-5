import java.util.Scanner;

class Hourglass{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int ans = 0;
        for(int i=0;i<n-2;i++){
            for(int j=0;j<m-2;j++){
                int temp = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                ans = Math.max(ans,temp);
            }
        }
        System.out.println(ans);

    }
}