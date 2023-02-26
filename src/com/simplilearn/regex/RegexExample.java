package com.simplilearn.regex;

import java.util.regex.Pattern;

public class RegexExample {

    public static void main(String[] args) {

        //Pattern.matches("[alphanumeric]{length}",value));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{4}", "john"));

        //Pattern.matches("[alpha]{length}",value));
        System.out.println(Pattern.matches("[a-zA-Z]{5}", "john6"));

        //Pattern.matches("[alpha]{length}",value));
        System.out.println(Pattern.matches("[a-zA-Z]{4}", "john"));

        //Pattern.matches("[alpha]{no length}",value));
        System.out.println(Pattern.matches("[a-zA-Z]", "john"));

        //Pattern.matches("[alpha]{can be repeated}",value));
        System.out.println(Pattern.matches("[abc]+", "ab"));

        //Pattern.matches("[alpha]{only 1 char}",value));
        System.out.println(Pattern.matches("[abc]", "ab"));

        //Pattern.matches("only 2 chars. second char is 's'",value));
        System.out.println(Pattern.matches(".s", "as"));

        //digits
        //Pattern.matches("1 digit", value));
        System.out.println(Pattern.matches("\\d", "12"));

        //Pattern.matches("1 digit", value));
        System.out.println(Pattern.matches("\\d", "1"));

        //Pattern.matches("1 letter", value));
        System.out.println(Pattern.matches("\\D", "m"));

        //other pattens - passwords
        //Pattern.matches("1 digit", value));
        //first digit be either 7 or 8 or 9  - for length of 1
        //then followed by any 0-9 digits - for length of 9
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "7123456789"));

        //other pattens - email
        //Pattern.matches("1 digit", value));
        //first digit be either 7 or 8 or 9  - for length of 1
        //then followed by any 0-9 digits - for length of 9
        System.out.println(Pattern.matches("^(.+)@(.+)$", "test@test.com"));
    }
}
