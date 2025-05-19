import java.util.*;
class ClearithBit{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = s.nextInt();
        int m = 1 << i;
        int x = (n &~ m);
        System.out.println(x);
    }
}