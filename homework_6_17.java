import java.util.Random;
import java.util.Scanner;

public class homework_6_17 {
    public static void printMatrix(int n){
        if(n<1)return;
        Random rand=new Random();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int num= rand.nextInt(2);
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int number=in.nextInt();
        printMatrix(number);
        in.close();
    }
}
