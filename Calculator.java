import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) throws IOException {
        //Create output file
        PrintWriter output = new PrintWriter(new FileWriter("output.txt", true));

        try{
            //Create variables to hold input values
            int a = 0;
            int b = 0;

            //Take input from user
            Scanner input = new Scanner(System.in);
            System.out.println("Enter first number: ");
            a = input.nextInt();
            System.out.println("Enter second number: ");
            b = input.nextInt();

            //Ask user which operation to perform
            System.out.println("Please enter operation + - / or *");
            Scanner op = new Scanner(System.in);
            String operation = op.next();

            if (operation.equals("+")){
                output.append(String.valueOf(a)).append(operation).append(String.valueOf(b)).append("=").append ( String.valueOf ( a + b ) );
            }
            if (operation.equals("-")){
                output.append(String.valueOf(a)).append(operation).append(String.valueOf(b)).append("=").append ( String.valueOf ( a - b ) );
            }
            if (operation.equals("/")){
                output.append(String.valueOf(a)).append(operation).append(String.valueOf(b)).append("=").append ( String.valueOf ( a / b ) );
            }
            if (operation.equals("*")){
                output.append(String.valueOf(a)).append(operation).append(String.valueOf(b)).append("=").append ( String.valueOf ( a * b ) );
            }
            //Write to output file
            output.println();
            System.out.println("Result written to output file!");
            output.close();
        }catch (Exception e){
            System.out.println("You have not entered a valid option");

        }
    }

}
