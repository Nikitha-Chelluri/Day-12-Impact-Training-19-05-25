import java.util.*;
class SetiSetBit{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = s.nextInt();
        System.out.println(n| (1 << i));
    }
}
