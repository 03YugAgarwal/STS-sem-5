import java.util.*;

class AliceApple{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        // M apples, Each tree has K apples, N has no red apple, S has no green apple, W some red, E some Green.
        int m = sc.nextInt();
        int k = sc.nextInt();
        int n = sc.nextInt();
        int s = sc.nextInt();
        int w = sc.nextInt();
        int e = sc.nextInt();

        if(k*s >= m){
            System.out.println(m);
        }else if (m<= (k*s + w + e)){
            System.out.println(s*k + (m-s*k)*k);
        }else{
            System.out.println(-1);
        }

    }
}