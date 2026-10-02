import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {
     Scanner in = new Scanner(System.in);
     double celsius = 0.0;
     double fahrenheit = 0.0;
     String trash = "";
     boolean validInput = false;
     do
     {
        System.out.print("Enter a temperature in Celsius: ");
        if(in.hasNextDouble())
      {
        celsius = in.nextDouble();
        in.nextLine(); // Clear the buffer
        validInput = true;
      }
      else
      {
        trash = in.nextLine(); // Read the Input as a String
        System.out.println("You said the temperature was: " + trash);
        System.out.println("Invalid input. Please enter a valid number.");
      }

     } while (!validInput);
     // Process
     fahrenheit = (celsius * 9/5) + 32;
     System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
    }
}
