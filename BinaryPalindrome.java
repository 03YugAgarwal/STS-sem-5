import java.util.*;

class BinaryPalindrome{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String bin = Integer.toBinaryString(n);
        
        int j = bin.length()-1;
        int i = 0;
        int flag = 1;
        while(i<j){
            if(bin.charAt(i) != bin.charAt(j)){
                flag = 0;

            }
            i++;
            j--;
        }
        System.out.println(flag);
    }
}