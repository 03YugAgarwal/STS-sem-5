import java.util.*;

class SwapNibble{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = ((n&0xF0) >> 4) | ((n&0x0F) << 4);
        System.out.println(a);
    }
}