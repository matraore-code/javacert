package com.matraore;

import com.matraore.email.EmailValidator;

import java.awt.Point;
import java.awt.Color;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Level;

public class Main {

    // static  String bar = "hello";
   public static  String foo = "bar";

   private static int add(int n1, int n2) {
       int result = n2 + n1;
       return result;
   }

   private static void printBrand() {
       System.out.println("Mattraore");
   }

   private static double calculateRentalYield(double rentalIncome, double propertyPrice) {
       double annualRentalIncome = rentalIncome * 12;
       double rentalYield = (annualRentalIncome / propertyPrice) * 100;
       return rentalYield;

   }

   private static int getNegated(int n) {
       return n * -1;
   }


   private static boolean isSame(int i, int j) {
       if (i == j){
           return true;
       }
       else {
           return false;
       }
   }
    private static void getLager(int i, int j) {
        if (i > j){
            System.out.println("The first number is large");
        }
        else if (i < j){
            System.out.println("The second number is large");
        } else {
            System.out.println("The numbers are equal");
        }
    }

    private static void capitalize(String str) {
        char c = str.charAt(0);
        c = Character.toUpperCase(c);
        str = c + str.substring(1);
        System.out.println(str);

    }

    private static int getLength(String [] str) {
       int length = str.length;
       return length;
    }


    private static int getNumberOfWord(String sentence) {
       String[] str = sentence.split(" ");
       int l = getLength(str);
       return l;

    }

    private static void reverseString(String str) {
       for(int i = str.length()-1; i>=0; i--) {
           System.out.print(str.charAt(i));
       }
    }
    private static void findLongestString(String[] input) {
       if (input.length != 0) {
           int k=0;
           for (int i = 0; i < input.length-1; i++) {
               if(input[i].length() >= input[i+1].length() && k < input[i].length()) {
                   k = input[i].length();
               } else if(input[i].length() < input[i+1].length() && k < input[i+1].length()) {
                   k = input[i+1].length();
               }
           }
           for (int i = 0; i < input.length; i++) {
               if(input[i].length() == k) {
                   System.out.println(input[i]);
               }
           }

       } else {
           System.out.println("");
       }
    }


    public static void main(String[] args) {
        //reverseString("ratcoM");
       // String[] input = {"bingo", "cia", "mo", "ami"};
        //findLongestString(input);

       /* String name = "Alex";
        name = "Jamila";
        System.out.println(name);

        */
        System.out.println(Gender.FEMALE);
        System.out.println(Gender.MALE);



  /*      String input = "   amig os cod e  ";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' '){
                int j = 1;
                if (input.charAt(i) == 'a'){
                    j++;
                    char a = input.charAt(i);
                    System.out.print(Character.toUpperCase(a));

                    continue;
                }
                System.out.print(input.charAt(i));
            }
        }

   */


       /*
        System.out.println(
                "Your rental yield is: " + calculateRentalYield(1300, 250000)
        );


        // System.out.println(getNegated(5));
        //System.out.println(isSame(10, 8));
        //getLager(4,6);
        //capitalize("mamadoumoctar");
        String[] a = {"a", "b", "c", "d"};
        System.out.println(getLength(a));




        String str = "The second number is larger and is positive";
        System.out.println("The sentence contains " + getNumberOfWord(str) + " words");

        */









        /*int result1 = add(10, 20);
        System.out.println(result1);
        printBrand();*/

       //String foo = "bar";
        //EmailValidator.main("maamadougmal@.com");



        /*
        Exercise 1 : Create a class called Compile.java with the following code
        package com.amigoscode;
            public class Exercise {
            public static void main(String[] args) {
            System.out.println("I can compile and run from the terminal. Hooray 🎉");
            }
           }
       Solution : Copy the line "System.out.println("I can compile and run from the terminal. Hooray 🎉");" then run on IntelliJ
        */

        /*
        Exercise 2 : Make sure when the following code runs it only prints I love cats. Don't delete the any code.
              package com.amigoscode;

                public class Exercise {
                public static void main(String[] args) {
                System.out.println("I love cats");
                System.out.println("I hate cats");
            }
            }
            Solution : copy the code below and then comment the second line with //
             System.out.println("I love cats");
            System.out.println("I hate cats");
        */
/*

        for(int i=0; i<=10; i++){
            System.out.println(i * 3);
        }
        System.out.println();


        for(int i=10; i>=0; i--){
            System.out.println(i * 3);
        }

 */
       /* String names[] = {"Hello", "hi" };
        System.out.println(Arrays.toString(names));

        }



        int numbers[] = new int[3];
        System.out.println(Arrays.toString(numbers));
        Arrays.fill(numbers, 4);
        System.out.println(Arrays.toString(numbers));
        numbers[1] = 17;
        System.out.println(Arrays.toString(numbers));

        */
/*
        String alphabet[] = {"a", "b", "c", "d"};
        System.out.println(Arrays.toString(alphabet));
        String clone[] = alphabet;
        clone[0] = "z";
        System.out.println(Arrays.toString(alphabet));
        System.out.println(Arrays.toString(clone));
        System.out.println();

        String copy[] = Arrays.copyOf(alphabet, 4);
        copy[2] = "e";
        System.out.println(Arrays.toString(alphabet));
        System.out.println(Arrays.toString(copy));



        String[] a = {"a", "b", "c", "d"};
        for (int i = 0; i < a.length; i++) {
           System.out.println(a[i]);
        }

        int numbers[] = new int[11];
        int j = 0;
        for (int i = 0; i <=10; i++) {
            j += i;
            numbers[i] = j;
        }
        System.out.println(Arrays.toString(numbers));

        int sum = 0;
        int numbers[] = {13,4,56,7,384};
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);




        String[] a = {"i", "sure", "do", "love", "bees"};
        String[] b = a;
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i].toUpperCase();
            //System.out.println(b[i]);
        }
        System.out.println(Arrays.toString(a));




        String[] a = {"i", "sure", "do", "love", "bees"};
        char b[] = new char[5];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i].charAt(0);
            b[i] = Character.toUpperCase(b[i]);
            a[i] = b[i] + a[i].substring(1);

        }
        System.out.println(Arrays.toString(a));




        String[] content = {"you", "are", "how", "hello"};
        for (int i = content.length - 1; i >= 0; i--) {

            System.out.print(content[i] + " ");
        }
        System.out.print("?");


        String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        double result = 0;
        String[] numbers = input.split(", ");
        for (int i = 0; i < numbers.length; i++) {
            result += Double.parseDouble(numbers[i]);
        }
        System.out.println(result);



        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }



        int i = 5;
        int j = 6;
        if (i == j) {
            System.out.println(" Les 2 nombres sont égaux");
        }
        if (i != j) {
            System.out.println(" Les 2 nombres ne sont pas égaux");
        }


        String i = "Hello";
        String j = "Hello";
        if (i == j) {
            System.out.println("Sont égaux");
        }
        if (i != j) {
            System.out.println(" ne sont pas égaux");
        }



        String str1 = new String("Hello");
        String str2 = new String("Hello");;
        if (str1.equals(str2)) {
            System.out.println("Sont égaux");
        }



        int i = 5;
        int j = 6;
        int k = 3;
        if (i > j  && i < k) {
            System.out.println("Condition met");
        } else {
            System.out.println("Condition not met");
        }




        int i = 5;
        int j = 6;
        int k = 3;
        if (i > j ||  i < k) {
            System.out.println("Condition met");
        } else {
            System.out.println("Condition not met");
        }



        char c = 'e';
        String str = "ehoooeééééeeee";
        for (int i = 0; i<str.length(); i++) {
            if (c == str.charAt(i)) {
                System.out.println("find :)");
            }
        }



        for (int i = 0; i<=20; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }



        Point point = new Point();
        Color color = new Color(0xAF2121);


        Date date = new Date();
        java.sql.Date date1 = new java.sql.Date(1);

 */

       // String name ="Moctar";





    }
}
