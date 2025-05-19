import java.util.*;
class SetBitRnotLeft{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = s.nextInt();
        int binary=0;
        int place=1;
        int temp = n;
        while(temp>0){
            int rem=temp%2;
            binary+=rem*place;
            place=place*10;
            temp=temp/2;  
        }
        int m = 1 << i;
        int x = ( binary& m);
        if (x != 0) {
            System.out.println("Set Bit");
        }
        else {
            System.out.println("Not Set Bit");
        }
    }
}