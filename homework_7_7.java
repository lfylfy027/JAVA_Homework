public class homework_7_7 {
    public static void countrandomnumber(int n) {
        int counts[] = new int[10];
        for (int i = 0; i < n; i++) {
            if (i % 25 == 0 && i != 0) {
                System.out.println();
            }
            int number = (int) (Math.random() * 10);
            System.out.print(number + " ");
            counts[number]++;
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println("数字" + i + "的个数为" + counts[i]);
        }
    }
    public static void main(String args[]){
        countrandomnumber(100);
    }
}
