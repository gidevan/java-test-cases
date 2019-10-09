package org.vsanyc;

public class Main {

    public static void main(String[] args) {
        testStringUnicodeReverse();
    }

    /**
     * Reverse unicode string Й (unicode combining)
     */
    public static void testStringUnicodeReverse() {
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
    
    private static String reverse(String s) {
        System.out.println();
        System.out.println("Reverse test");
        System.out.println("input string:" + s);
        String reverseString = new StringBuilder(s).reverse().toString();
        System.out.println("reversed string:" + reverseString);
        return reverseString;
    }
}
