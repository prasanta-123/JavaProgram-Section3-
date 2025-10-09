package com.jspider.collection.list.fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Mainclass {
    final static  String FolderName="java class";
    public static void createFolder(){
        File f1=new File("D:\\"+FolderName);
        f1.mkdir();//create a new folder...
        System.out.println("file is created... sucessfully");
    }

    public static void createFile(String fileName){

        File f1=new File("D:\\"+FolderName+"\\"+fileName);

        try{

            f1.createNewFile();//create a file inside the given folder..
            System.out.println("file is created...");
        }
        catch (IOException e){
            System.out.println("error while creating the file....");

        }

    }
    public static void deleteFile(String fileName){
        File f1= new File("D:\\"+FolderName+"\\"+fileName);
        f1.delete();//creates a new file in given path
        System.out.println("file deleted...");



    }

    public static void  writeDateToFile(String Data,String fileName){
       // File f1 =new File("D:\\"+FolderName+"\\"+fileName);
        try {
            FileWriter fw=new FileWriter("D:\\"+FolderName+"\\"+fileName);
            fw.write(Data);//
            fw.flush();
            System.out.println("data is written into to given file.....");

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void readFileData(String fileName){
        try {

            File f1 =new File("D:\\"+FolderName+"\\"+fileName);
            int size = (int) f1.length();// find the no. of chars in file
            FileReader fr = new FileReader(f1);// create file reader

            char[] data = new char[size];//array to store all chars of file

            fr.read(data);//read one char at a time from file and store to array

            String stringData =  String.valueOf(data);// convert char array to String

            System.out.println(stringData);



        }
        catch (IOException  e){

        }


    }



    public static void main(String[] args) {

        //createFolder();
        // createFile("Demo.txt");
        // writeDateToFile("this is a java class","Demo.txt");
        //readFileData("Demo.txt");
        deleteFile("Demo.txt");



    }
}

