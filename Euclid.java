import java.util.Scanner;

class Euclid{

    static int gcd(int a,int b){
        if(a==0)
            return b;
        return gcd(b%a,a);
    }

    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(gcd(n1,n2));
    }
}