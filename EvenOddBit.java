import java.util.*;
class EvenOddBit{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = n & 1;
        if (x == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}