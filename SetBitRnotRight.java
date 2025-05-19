import java.util.*;
class SetBitRnotRight{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = s.nextInt();
        int binary=0;
        int place=1;
        int temp=n;
        while(temp>0){
            int rem=temp%2;
            binary+=rem*place;
            place=place*10;
            temp=temp/2;
        }
        int m = binary >> i;
        int x = m & 1;
        if (x != 0) {
            System.out.println("Set Bit");
        }
        else {
            System.out.println("Not Set Bit");
        }
    }
}