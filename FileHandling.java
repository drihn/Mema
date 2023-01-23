package gg;
//importing file Class
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Stringer {
   
	public static void main(String[] args) {
//inputing Scanner
     Scanner input = new Scanner(System.in);
     System.out.print("Enter a String to replace: ");

     String toReplace = input.nextLine();
     System.out.print("Enter the replacement string: ");
//Juwan, Limbo, Ai Joseph, Laure
     String replacement = input.nextLine();

     String newContent = "";
     boolean found = false;

        try {

            File myObj = new File("C:\\\\Users\\\\galvezaa\\\\Documents\\\\Gdrin.txt");

            Scanner fileInput = new Scanner(myObj);

            while (fileInput.hasNextLine()) {

                String line = fileInput.nextLine();

                if (line.contains(toReplace)) {

                   line = line.replace(toReplace, replacement);

                   found = true;
                }
                newContent += line + System.lineSeparator();
            }
            if (!found) {
                System.out.println("<Invalid text>");
                return;
            }
            FileWriter fileWriter = new FileWriter("C:\\Users\\galvezaa\\Documents\\Gdrin.txt");
            fileWriter.write(newContent);
            fileWriter.close();
          
            System.out.println("New word:");
            fileInput = new Scanner(myObj);
           
            while (fileInput.hasNextLine()) {
            String line = fileInput.nextLine();
            System.out.println(line);
            }
        } catch (IOException e) {

            System.out.println("Error: File not found.");

        }

    }

}
