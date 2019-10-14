package org.vsanyc;

public class Main {

    public static void main(String[] args) {
        testStringUnicodeReverse();
        String res1 = testFinally("11");
        System.out.println("Result testFinally:" + res1);
        String res2 = testFinally("ss");
        System.out.println("Result testFinally(): " + res2);
    }

    /**
     * Reverse unicode string Й (unicode combining)
     */
    private static void testStringUnicodeReverse() {
        System.out.println();
        System.out.println("=============Test unicode string reverse==============");
        reverse("asdfg");
        reverse("asdfgЁыва");
        reverse("asdfgЁыва\uD83D\uDE00fffg");
        reverse("afgЁыва\uD83D\uDE00fffg \u0415\u0308 wer");

        System.out.println("---------------------------------------------");
        String s = "\u0415\u0308";
        String r = reverse(s);
        assertReverse(s, r);

        s = "\u0308\u0415";
        r = reverse(s);
        assertReverse(s, r);

        s = "\u0438\u0306";
        r = reverse(s);
        assertReverse(s, r);

        s = "Ё";
        r = reverse(s);
        assertReverse(s, r);

        s = "\u0438\u0308";
        r = reverse(s);
        assertReverse(s, r);

        s = "\u0308\u0415\u0308\u0308";
        r = reverse(s);
        assertReverse(s, r);

    }

    private static void assertReverse(String input, String reverseString) {
        System.out.println("Assert reverse.");
        System.out.println(" Input string: " + input);
        System.out.println("reversed  string: " + reverseString);
        System.out.println("Equals result: " + input.equals(reverseString));
    }

    private static String testFinally(String value) {
        System.out.println();
        System.out.println("==================Test Finally========================");
        try {
            return "Parsed value is : " + Integer.valueOf(value);
        } catch (Exception e) {
            System.out.println("Exception");
            System.out.println(e);
            return "Error parsing value: " + value;
        } finally {
            System.out.println("Finally block. Input value is: " + value);
        }
    }
    
    private static String reverse(String s) {
        System.out.println();
        System.out.println("Reverse test");
        System.out.println("input string:" + s);
        String reverseString = new StringBuilder(s).reverse().toString();
        System.out.println("reversed string:" + reverseString);
        return reverseString;
    }
}
