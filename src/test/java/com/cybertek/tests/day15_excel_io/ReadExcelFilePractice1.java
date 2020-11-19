package com.cybertek.tests.day15_excel_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadExcelFilePractice1 {

    public static void main(String[] args) throws FileNotFoundException {
        String path="check_list.txt";
        File file = new File(path);
        System.out.println(file.exists());


        Scanner scanner =new Scanner(file);

        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());

        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }


    }
}
