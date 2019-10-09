package com.Lesson_1;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        // prompt to get the name of the student and then the different scores for all 10 subjects
        double totalScore = 0;
        int subjectCount = 1;

        Scanner input = new Scanner(System.in);

        while(subjectCount <= 10) {
            System.out.println("Enter score for Subject " + subjectCount);
            double answer = input.nextDouble();
            if(  answer > 0 && answer < 100) {
                totalScore += answer;
                System.out.println("hello " + totalScore);
                subjectCount++;
            }
        }
        double averageScore = totalScore / 10;
        System.out.println(averageScore);

        Student candidate1 = new Student("Obi", averageScore);


        System.out.println(  candidate1.getName() + "'s letter Grade is : " + candidate1.getLetterGrade());;

    }
}