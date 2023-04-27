public class WrapperClasses {
    public static void main(String[] args) {
//        int num1 = 7;
//        Integer num1B = Integer.valueOf(num1);
//        Integer num1B = num1; // auto-boxing
//        Double myDouble = Double.valueOf(2343.12);
//        Float myFloat = Float.valueOf(23.23f);
//        Byte myByte = Byte.valueOf("23");

//        storeData(num1B);

        int age = Integer.parseInt(args[0]);
        double amount = Double.parseDouble("345.12");
        boolean myBoolean = Boolean.parseBoolean("false");

        System.out.println(myBoolean);
        System.out.printf("You will be %d years old in 10 years.%n", age);
    }

    /**
     * Takes in any type of data and stores it somewhere generically
     */
    public static void storeData(Object obj) {
        // do something with the object
    }
}
