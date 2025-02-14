package com.dam.ejercicios;

import java.awt.*;

public class Functions {
    /**
     * Create a program called Palindrome with a function called isPalindrome.
     * This function will take a string as a parameter and return a boolean
     * indicating if this string is a palindrome (this is, a string that can
     * be read the same backward as forward, ignoring upper or lower case,
     * and whitespaces).
     * Test this function from the main function with the texts Hannah,
     * Too hot to hoot and Java is the best language (this last text is NOT a palindrome)
     *
     * @param text
     * @return
     */

    public static boolean isPalindrome(String text) {
        String cadenaLimpia = text.replace(" ", "").toLowerCase();
        StringBuilder cadenaInvertida = new StringBuilder(cadenaLimpia);
        cadenaInvertida.reverse();

        if (!cadenaLimpia.equals(cadenaInvertida)) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Same as "isPalindrome" but with recursive calls
     *
     * @param text
     * @param izquierda
     * @param derecha
     * @return
     */
    public static boolean recursivePalindrome(String text, int izquierda, int derecha) {

        if (izquierda >= derecha) {
            return true;
        }
        if (text.charAt(izquierda) != text.charAt(derecha)) {
            return false;
        }
        return recursivePalindrome(text, izquierda + 1, derecha - 1);
    }

}
