class Main{
    public static void main(String[] args) {
        
        // The boolean data type has two possible values, either true or false.
        // Default value: false.
        boolean flags  = true;
        System.out.println(flags);

        // The byte data type can have values from -128 to 127 (8-bit signed two's complement integer).
        // Default value: 0.
        byte range = 124;
        System.out.println(range);

        // The short data type in Java can have values from -32768 to 32767 (16-bit signed two's complement integer).
        //Default value: 0.
        short temperature = -200;
        System.out.println(temperature);

        // The int data type can have values from -231 to 231-1 (32-bit signed two's complement integer).
        //Default value: 0.
        int val = 2;
        System.out.println(val);
    
        // The long data type can have values from -263 to 263-1 (64-bit signed two's complement integer).
        // Also use l or L in last 
        //Default value: 0.
        long value = -42332200000l;
        System.out.println(value);

        // The float data type is a single-precision 32-bit floating-point
        // Also use f of F in last
        // Default value: 0.0(0.0f)
        float num = 4f;
        System.out.println(num);

        // The double data type is a double-precision 64-bit floating-point.
        //Default value: 0.0 (0.0d)
        double number = -42.3;
        System.out.println(number);

        // The char is a 16-bit Unicode character.
        // The minimum value of the char data type is '\u0000' (0) and the maximum value of the is '\uffff'.
        // Default value: '\u0000'
        char a = '\u0051'; // Unicode of Q
        System.out.println(a); // print --> Q

        char letter1 = '9';
        System.out.println(letter1);  // prints 9
        char letter2 = 65;
        System.out.println(letter2);  // prints A
        // A is printed to the output. It is because Java treats characters as integral types and the ASCII value of A is 65

        // Strings in Java are not primitive types. Instead, they are objects. For example
        String str = "Hello";
        System.out.println(str);
    }
}