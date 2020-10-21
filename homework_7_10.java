import java.util.Scanner;

public class homework_7_10 {
    public static int indexofSmallestElement(int[] array){
        int len=array.length;
        int ans=-1;
        if(len==0)return ans;
        ans=0;
        int min=array[0];
        for(int i=1;i<len;i++){
            if(array[i]<min){
                min=array[i];
                ans=i;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        System.out.println("输入十个数");
        Scanner in=new Scanner(System.in);
        int []array=new int[10];
        for(int i=0;i<10;i++){
            array[i]=in.nextInt();
        }
        System.out.println(indexofSmallestElement(array));
    }
}
