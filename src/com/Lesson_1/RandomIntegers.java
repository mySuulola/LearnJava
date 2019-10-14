package com.Lesson_1;

import java.security.SecureRandom;

public class RandomIntegers {
    public static void main(String[] args)
    {
        SecureRandom randomNumber = new SecureRandom();
        System.out.println(randomNumber.nextInt(2));

//        for(int i = 1; i <= 20; i++)
//        {
//            int face = 1 + randomNumber.nextInt(6);
//
//            System.out.printf("%d ", face);
//
//            if (i % 5 == 0) {
//                System.out.println();
//            }
//
//        }

    }
}
