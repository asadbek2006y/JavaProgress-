public class printf {
    public static void main(String[] args) {
        
        // printf = an optional method to control, format, and display text to the console window
        //          two arguments = format  string + (object/variable/value)
        //          % [flags] [precision] [width] [conversion-character]

        // System.out.printf("This is the format string %d", 123);
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        // System.out.printf("%b", myBoolean);
        // System.out.printf("%c", myChar);
        // System.out.printf("%s", myString);
        // System.out.printf("%d", myInt);
        // System.out.printf("%f", myDouble);

        // [WIDTH]
        // minimum number of characters to be written as output
        // System.out.printf("Hello %-10s", myString);

        // [Precision]
        // sets number of digits of precesion when outputting floating-point values
        // System.out.printf("You have this much money %.2f", myDouble);

        // [Flags]
        // adds an effect to output  based on the flag  added to format specifier 
        // - : left-justify 
        // + : output a plus ( + ) or ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded 
        // , : comma grouping  separator if numbers > 1000
    }
}
