import java.util.Scanner;
public class TaffyTester
{
    public static void main(String[] args)
    {

        // Your code starts here
        int temp = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Starting Taffy Timer...");
        while(temp < 270) {
            System.out.println("Enter the temperature: ");
            temp = input.nextInt();
            if(temp < 270) System.out.println("The mixture isn't ready yet.");
        }
        System.out.println("Your taffy is ready for the next step!");
    }
}