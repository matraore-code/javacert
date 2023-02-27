package com.matraore;

import java.time.*;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

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

    private static int calculateAge(LocalDate date) {
        // hint: subtract todays date[year] - date[year]

        int birthYear = date.getYear();
        int currentYear = LocalDate.now().getYear();

        System.out.println(currentYear - birthYear);
        return -1;
    }


    private static void isPrime(int number) {
       int j = 0;
       for (int i = 1; i <= number; i++) {
           if ( number % i == 0) {
               j+=1;
           }
       }
       if (j == 2) {
           System.out.println("This number is prime");
       } else {
           System.out.println("This number is not prime");
       }
    }
    public static void main(String[] args) {
        System.out.println("***** Joke Generator*****");
        String number;
        String[] jokes = {
                "q. Why did the child component have such great self-esteem? a. Because its parent kept giving it `props`!",
                "q. How do you comfort a JavaScript bug? a. You console it.",
                "q. Why do C# and Java developers keep breaking their keyboards? a. Because they use a strongly typed language!",
                "q. Why do C# and Java developers keep breaking their keyboards? a. Because they use a strongly typed language!",
                "q. Why did the functional component feel lost? a. Because it didn't know what `state` it was in!",
                "q. Why was the JavaScript developer sad? a. Because he didn't Node how to Express himself!",
                "q. Why did the developer go broke? a. Because he used up all his cache!",
                "q. Why did the React Higher Order Component give up? a. Because it sur-rendered to the prop-aganda!",
                "When a JavaScript date has gone bad, \"Don't call me, I'll callback you. I promise!",
                "q. Why did the react class component feel relieved? a. Because it was now off the hook."
        };
        do {
            System.out.println();
            System.out.println("Want to hear a joke? Yes/No");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextLine();
            if (number.equals("no")) {
                break;
            }
            Random random = new Random();
            int randomNumber = random.nextInt(9);
            System.out.println(jokes[randomNumber]);

        } while (number.equals("yes"));





/*

        System.out.println("***** Prime Number Checker *****");
        System.out.println();
        System.out.println("Type a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        isPrime(number);






       LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getDayOfYear());
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalTime hour = LocalTime.now();
        System.out.println(hour.getHour());

        LocalDateTime badDay = LocalDateTime.of(
                2005,
                Month.APRIL,
                28,
                10,
                42,
                54
        );
        System.out.println(badDay);

        System.out.println(ZonedDateTime.now());



        LocalDate birthDay = LocalDate.of(
                1996,
                Month.NOVEMBER,
                29
        );
        System.out.println(birthDay);
        System.out.println(birthDay.plusDays(100));
        calculateAge(birthDay);



        System.out.println("Hello! What is your name?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Hello " + input);

 */


        //reverseString("ratcoM");
        // String[] input = {"bingo", "cia", "mo", "ami"};
        //findLongestString(input);

       /* String name = "Alex";
        name = "Jamila";
        System.out.println(name);


        System.out.println(Gender.FEMALE);
        System.out.println(Gender.MALE);

        */
       /* for (Gender gender : Gender.values()) {
            System.out.println(gender.name().toLowerCase());
        }

        */




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
