package com.Lesson_1;

public class StudentTest {
    public static void main(String[] args) {
        Student candidate1 = new Student("Obi", 39);
        Student candidate2 = new Student("Tobi", 60);

        System.out.println(  candidate1.getName() + "'s letter Grade is : " + candidate1.getLetterGrade());;
        System.out.println(candidate2.getLetterGrade());

    }
}
