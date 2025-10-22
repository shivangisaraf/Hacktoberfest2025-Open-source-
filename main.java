// Java program to convert Hexadecimal 
// to Decimal Number

// Importing input output classes
import java.io.*;

// Main class
class Geeks
{

    // Method
    // To convert hexadecimal to decimal
    static int hexaToDec(String n)
    {
        // Storing the length of the
        int l = n.length();

        // Initializing base value to 1, i.e 16^0
        int base = 1;

        // Initially declaring and initializing
        // decimal value to zero
        int dec_val = 0;

        // Extracting characters as
        // digits from last character

        for (int i = l - 1; i >= 0; i--) {

            // Condition check
            // Case 1
            // If character lies in '0'-'9', converting
            // it to integral 0-9 by subtracting 48 from
            // ASCII value
            if (n.charAt(i) >= '0'
                && n.charAt(i) <= '9') {
                dec_val += (n.charAt(i) - 48) * base;

                // Incrementing base by power
                base = base * 16;
            }

            // Case 2
            // if case 1 is bypassed

            // Now, if character lies in 'A'-'F' ,
            // converting it to integral 10 - 15 by
            // subtracting 55 from ASCII value
            else if (n.charAt(i) >= 'A'
                     && n.charAt(i) <= 'F') {
                dec_val += (n.charAt(i) - 55) * base;

                // Incrementing base by power
                base = base * 16;
            }
        }

        // Returning the decimal value
        return dec_val;
    }

    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        // Custom input hexadecimal number to be
        // converted into decimal number
        String n = "1A";

        // Calling the above method to convert and
        // alongside printing the hexadecimal number
        System.out.println(hexaToDec(n));
    }
}
