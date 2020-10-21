import java.util.Scanner;

public class homework_8_2 {
    public static double sumMajorDiagonal(double[][] m){
        int n=m.length;
        double sum=0;
        for(int i=0;i<n;i++){
            sum+=m[i][i];
        }
        return sum;
    }
    public static void main(String args[]){
        int n;
        while(true) {
            System.out.println("输入矩阵维数");
            Scanner in = new Scanner(System.in);
            n=in.nextInt();
            if(n<1){
                System.out.println("输入数据有误，请重新输入");
                continue;
            }
            break;
        }
        double [][] m=new double[n][n];
        System.out.println("输入矩阵元素，共"+n*n+"个");
        Scanner in = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                m[i][j]=in.nextDouble();
            }
        }
        System.out.println("Sum of the elements in the major diagonol is "+sumMajorDiagonal(m));
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(m[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
