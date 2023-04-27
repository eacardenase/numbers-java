import java.security.SecureRandom;
import java.util.Random;

public class MathStuff {
    public static void main(String[] args) {
//        System.out.println(3 + 5);
//        System.out.println(10 - 7);
//        System.out.println(7 - 10);
//        System.out.println(7 * 4);
//        System.out.println(8 / 4);
//        System.out.println(7 / 4); // parsed to integer
//        System.out.println(7f / 4); // 1.75
//        System.out.println((double) 7 / 4); // type casting

//        double num1 = 7;
//        float num2 = 4;
//
//        System.out.println(num1 / num2);

//        System.out.println(3d * 5); // d makes an int a double

//        System.out.println(2 + 3 * 5); // 17
//        System.out.println((2 + 3) * 5); // 25

//        System.out.println(10 % 2);

//        int x = 1;
//        x += 1;
//        x -= 1;
//        x *= 1;
//        x /= 1;
//
//        System.out.println(x);
//        System.out.println(++x);
//        System.out.println(x++);

//        System.out.println(Math.abs(-10));
//        System.out.println(Math.ceil(4.6));
//        System.out.println(Math.floor(4.6));
//        System.out.println(Math.round(4.6));
//        System.out.println(Math.round(4.4));

//        int num1 = 4;
//        int num2 = 7;

//        System.out.println(Math.min(num1, num2));
//        System.out.println(Math.max(num1, num2));
//        System.out.println(Math.pow(num1, num2)); // returns a double

//        System.out.println(Math.random());
//        System.out.println(Math.random() * 10);
//        System.out.println((int) Math.floor(Math.random() * 100));
//        System.out.println((int) (Math.random() * 100));

//        System.out.println(Math.sqrt(9));
//
//        System.out.println(Math.PI);
//        System.out.println(Math.E);

//        Random random = new Random(); // supports a seed as input
//
//        System.out.println(random.nextInt(10));
//        System.out.println(random.nextInt(10));
//        System.out.println(random.nextInt(10));
//        System.out.println(random.nextInt(10));

        SecureRandom random = new SecureRandom();

        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));
    }
}
