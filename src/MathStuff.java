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

//        SecureRandom random = new SecureRandom();
//
//        System.out.println(random.nextInt(10));
//        System.out.println(random.nextInt(10));
//        System.out.println(random.nextInt(10));

//        System.out.println(calculateAreaOfCircle(3));

//        double pathVelocity = calculatePathVelocity(0.8, 3);
//        double accel = calculateCentripetalAccel(pathVelocity, 0.8);
//
//        System.out.println(pathVelocity);
//        System.out.println(accel);
//        System.out.println(calculateCentripetalForce(0.2, accel));
        System.out.println(calculateCentripetalForce(0.2, 0.8, 3));
    }

    /**
     * This method calculates the area of a circle
     * It uses the formula: A = PI * r^2
     * @param radius
     * @return double
     */
    public static double calculateAreaOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    private static double calculatePathVelocity(double radius, double period) {
        double circumference = 2 * Math.PI * radius;

        return circumference / period;
    }

    private static double calculateCentripetalAccel(double pathVel, double radius) {
        return Math.pow(pathVel, 2) / radius;
    }

    private static double calculateCentripetalForce(double mass, double acc) {
        return mass * acc;
    }

    public static double calculateCentripetalForce(double mass, double radius, double period) {
        double pathVelocity = calculatePathVelocity(radius, period);
        double accel = calculateCentripetalAccel(pathVelocity, radius);
        double centripetalForce = calculateCentripetalForce(mass, accel);

        return centripetalForce;
    }
}
