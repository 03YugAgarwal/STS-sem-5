import java.util.*;

class RemainderTheorm{

    static int remainder(int num[], int rem[],int n){
        int x = 1;
        while(true){
            int j;
            for(j=0;j<n;j++){
                if(x%num[j]!=rem[j])
                    break;
            }
            if(j==n){
                return x;
            }
            x++;
        }
    }

    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];
        int m[] = new int[n];
        
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            m[i] = sc.nextInt();
        }

        System.out.println(remainder(a,m,n));

    }
}