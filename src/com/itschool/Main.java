package com.itschool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Pupil pupil = new Pupil("Pupil");

        System.out.println(pupil.getFio());
/*
        Scanner scanner = new Scanner(System.in);
        int numberOfPupils = scanner.nextInt();

        ClassRoom classRoom = new ClassRoom(numberOfPupils);
        for (Pupil p: classRoom.getPupils())
            System.out.println(p.getFio());
*/
        String [] names = {"QQQ", "WWW", "EEE", "RRR", "TTT"};
        ClassRoom class1 = new ClassRoom(names);
        for (Pupil p: class1.getPupils()) {
            System.out.println(p.getFio());
            p.Study();
            p.Read();
            p.Write();
            p.Relax();
        }
        System.out.println("\n----------------------------------------\n");
        byte [] marks = {4, 8, 12, 21, 0};
        ClassRoom class2 = new ClassRoom(marks);
        for (Pupil p: class2.getPupils()) {
            System.out.println(p.getFio());
            p.Study();
        }

        System.out.println("\n----------------------------------------\n");
        ClassRoom class3 = new ClassRoom(names, marks);
        for (Pupil p: class3.getPupils()) {
            System.out.println(p.getFio());
            p.Study();
            p.Relax();
        }
    }
}
