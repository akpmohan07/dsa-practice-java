package com.mohanverse.dev.striver.basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputOutput {

    /**
     * Java I/O Quick Revision
     *
     * Scanner Basics: - Scanner sc = new Scanner(System.in); - sc.next() :
     * reads next word/token - sc.nextLine() : reads full line (up to '\n') -
     * sc.nextInt() : reads integer (does NOT consume '\n')
     *
     * Key Points: - After nextInt()/next(), call sc.nextLine() if you want to
     * read the next full line. - nextInt() waits for input until a valid
     * integer is typed. - nextLine() reads everything including spaces until
     * newline.
     *
     * Multiple/Unknown Inputs: - Fixed number: use for-loop - Unknown number:
     * while(sc.hasNextInt()) / while(sc.hasNextLine()) - EOF signals end of
     * input: Ctrl+D (Mac/Linux), Ctrl+Z + Enter (Windows) - Sentinel value
     * (like "END") can also indicate end of input.
     *
     * Buffer Notes: - nextInt()/next() leave newline in buffer - nextLine()
     * consumes newline - Use hasNext(), hasNextInt(), hasNextLine() to check
     * input availability
     *
     * Interview Tips: - Always handle leftover newline - BufferedReader is
     * faster for large inputs - Practice unknown-length input scenarios
     */
    public static void main(String[] args) throws Exception {

        // 1. Learning
        // printing the formmated output
        int age = 15;
        String name = "mohan";
        System.out.printf("%s is %d years old\n", name, age);

        System.out.println("Enter an Number:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.printf("Number is %d\n", num1);

        System.out.println("Enter an String:");
        String s1 = sc.next();
        System.out.printf("String is %s\n", s1);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an String:");
        // String s2 = br.readLine();
        // System.out.printf("String is %s\n", s2);

        String s3;

        while((s3 = br.readLine()) != null) {
            // unbale to break this in VScode
            System.out.printf("String is %s\n", s3);
        }
        /* 
        1. Read 3 integers and print their sum.
        2. Read a line of text and print it in uppercase.
         */
        System.out.printf("Enter 3 Numbers:");

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += sc.nextInt();
        }

        System.out.printf("Sum: %d", sum);

        // Consuming leftover nextline
        sc.nextLine();

        String s4;

        s4 = sc.nextLine();
        System.out.printf("Uppercase: %s", s4.toUpperCase());

    }
}
