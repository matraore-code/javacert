import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
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


 */
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }


    }
}
