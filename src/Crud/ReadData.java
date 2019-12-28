package Crud;

import java.util.Scanner;

public class ReadData {
    public static int readDataNumber(){
        int data;
        Scanner Scan = new Scanner(System.in);
        data = Scan.nextInt();
        return data;      
    }
    public static String readDataString(){
        String data;
        Scanner Scan = new Scanner(System.in);
        data = Scan.nextLine();
        return data;      
    }
}
