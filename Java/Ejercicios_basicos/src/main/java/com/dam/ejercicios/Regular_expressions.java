package com.dam.ejercicios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//x 	‘x’ character
//\t 	Tabulation
//\n 	New line
//[abc] 	Character ‘a’, ‘b’ or ‘c’
//[^abc] 	Anything but characters ‘a’, ‘b’ or ‘c’
//[a-zA-Z] 	Range from ‘a’ to ‘z’ or from ‘A’ to ‘Z’
//. 	Any character
//^ 	Beginning of line (there’s nothing before)
//$ 	End of line (there’s nothing after)
//\d 	Digit from 0 to 9
//\D 	Anything but a digit
//\s 	Spacing char (white space, tab, new line…)
//\S 	Anything but a spacing char
//\w 	Alphanumeric char (letters, digits and underscore)
//\W 	Anything but an alphanumeric char
//(one|two) 	Text ‘one’ or text ‘two’
public class Regular_expressions {
    /**
     * Create a project called CarIDCheck that asks the user to enter a cad id,
     * and checks if it's made of 4 digits followed by 3 uppercase letters.
     * We are not going to check if these letters are vowels or not,
     * we just check if they are uppercase.
     */
    public static void CarIDCheck(String text){

    }

    /**
     * Create a program called EmailChecker that asks the user to enter an e-mail and checks if it's valid. We
     * will consider that a valid e-mail will be made of alphanumeric characters (at least one), followed by a
     * @ , one or more alphanumeric characters, a dot and one or more alphanumeric characters. So
     * myEmail@one.com is a valid e-mail, but myOtherMail@aaa is not.
     */
    public static void EmailChecker(){
        String text = "myEmail@gmail.net";
        Pattern p = Pattern.compile("^\\w+@(gmail|hotmail|outlook)\\.(com|es|net)$");
        Matcher m = p.matcher(text);
        if (m.find())
        {
            System.out.println("The email is correct");
        }
        else
        {
            System.out.println("The email is not correct");
        }
    }
}
