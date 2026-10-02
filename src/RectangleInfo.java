import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double width = 0.0;
        double height = 0.0;
        double area = 0.0;
        double perimeter = 0.0;
        double diagonal = 0.0;

        do
        {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble())
            {
                width = in.nextDouble();
                if (width <= 0)
                {
                    System.out.println("Invalid input. Please enter a positive number for the width.");
                }
                else
                {
                    System.out.println("The width of the rectangle is: " + width);
                }
            }
            else
            {
                System.out.println("Invalid input. Please enter a valid number for the width.");
                in.nextLine(); // Clear the invalid input
            }
        }
        while (width <= 0);

        do
        {
            System.out.print("Enter the height of the rectangle: ");
            if (in.hasNextDouble())
            {
                height = in.nextDouble();
                if (height <= 0)
                {
                    System.out.println("Invalid input. Please enter a positive number for the height.");
                }
                else
                {
                    System.out.println("The height of the rectangle is: " + height);
                }
            }
            else
            {
                System.out.println("Invalid input. Please enter a valid number for the height.");
                in.nextLine(); // Clear the invalid input
            }
        }
        while (height <= 0);

        area = width * height;
        perimeter = 2 * (width + height);
        diagonal = Math.sqrt(width * width + height * height);

        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The length of the diagonal of the rectangle is: " + diagonal);
    }
}

