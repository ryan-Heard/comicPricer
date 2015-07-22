/*import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;*/
import java.io.*;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException{
    Scanner scan = new Scanner(System.in);

    System.out.println("Hello World");
    System.out.println("Book title: ");
    String title = scan.nextLine();
    System.out.println("Issue Number: ");
    String issue = scan.nextLine();
    System.out.println("Grade: ");
    String grade = scan.nextLine();
    System.out.println(title +" "+issue+" "+grade);
  }

}
