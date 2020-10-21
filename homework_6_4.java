import java.util.Scanner;

public class homework_6_4 {
    public static void reverse(int number){
        int tmp=0;
        while(number!=0){
            tmp=tmp*10+number%10;
            number/=10;
        }
        System.out.println(tmp);
    }

    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int number=in.nextInt();
        reverse(number);
    }
}
