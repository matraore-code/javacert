package com.matraore.email;

public class EmailValidator {
    public static void main(String args) {
        int j = 0;
        for(int i= 0; i < args.length(); i++) {
            if (args.charAt(i) == '@') {
                j += 1;
            }
        }
        if (j <= 0) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}
