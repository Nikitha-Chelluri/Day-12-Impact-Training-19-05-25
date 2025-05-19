import java.util.*;
class Swap{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Before: ");
        int n = s.nextInt();
        int m = s.nextInt();
        n = n ^ m;
        m = m ^ n;
        n = n ^ m;
        System.out.println("After: ");
        System.out.println(n);
        System.out.println(m);
    }
}