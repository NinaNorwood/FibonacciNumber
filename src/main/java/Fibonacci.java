public class Fibonacci {

    public static void main(String[] args) {

        int x1 = 0;
        int x2 = 1;
        int x3;

        System.out.println(x1);
        System.out.println(x2);

        for(int i = 0; i<=10;i++){
            x3 = x1 + x2;
            System.out.println(x3);
            x1 = x2;
            x2 = x3;

        }

    }
}
