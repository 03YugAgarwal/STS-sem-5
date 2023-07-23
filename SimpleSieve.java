import java.util.*;

class SimpleSieve{
    public static void main(String ar[]){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] bool = new boolean[n+1];
        for(int i=0;i<n;i++){
            bool[i] = true;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(bool[i]==true){
                for(int j=i*i;j<n;j+=i){
                    bool[j] = false;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(bool[i]==true){
                System.out.println(i);
            }
        }
    }
}