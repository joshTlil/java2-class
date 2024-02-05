package lesson3;

import java.io.*;
import java.util.Scanner;

public class J203_5 {
    public static  void main(String[] args) {
     try{
         BufferedReader reader = new BufferedReader(new FileReader("E:\\javaCoding\\Java2(reloaded)\\J201_21\\src\\lesson3\\Germany_Brazil.txt"));
         BufferedWriter writer = new BufferedWriter(new FileWriter("J203_Joshua1234.txt"));

         String line;
         writer.write("Joshua");
         writer.newLine();
         while((line = reader.readLine()) != null){
           line = line.replaceAll("\\bGermany\\b", "Brazil");
           line = line.replaceAll("\\ba\\b", "the");
            writer.write(line);
            writer.newLine();
         }
         System.out.println("File Created");
         System.out.println("File now closing");
         reader.close();
         writer.close();

     }catch (FileNotFoundException ex){
         System.out.println("An error occured");
     }catch (IOException ex){
         System.out.println("Null read");
     }
    }
}
