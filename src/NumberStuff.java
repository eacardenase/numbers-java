public class NumberStuff {
    public static void main(String[] args) {
        boolean myFlag = true; // 0 or 1
        byte myByte = 127; // -128 to 127
        short myShort = 32767; // 16 bits -32,768 to 32,767
        char myChar = 'ñ'; // 16 bits
        char myA = 'A';
        char biggerShort = 32768; // doubles the range of short because it only stores positive numbers
        int myInteger = 12; // 32 bits
        long myLong = 12897498; // 64 bits

        float myFloat = 3.141592f;
        double myDouble = 3.141592;

        float num1 = 2.15f;
        float num2 = 1.10f;

        byte anotherByte = 0x01 | 0x05 | 0x02; // hexadecimal
        int anotherInt = 0b01 | 0b10; // binary 3. | it's kind of binary addition

        System.out.println(anotherByte);

    }
}
