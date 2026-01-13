import java.util.Scanner;

// Reverse class
class Reverse {

    int number;   // one integer variable

    // Default constructor
    Reverse()
    {
        number = 0;
    }


    Reverse(int n)
    {
        number = n;
    }

    // Input function
    void getInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        number = sc.nextInt();
    }

    // Reverse function
    void doReverse()
    {
        int temp = number;
        int reversed = 0;

        while (temp != 0)
        {
            int digit = temp % 10;        // get last digit
            reversed = reversed * 10 + digit;
            temp = temp / 10;             // remove last digit
        }

        System.out.println("Reversed number: " + reversed);
    }
}


public class ReverseMain
{
    public static void main(String[] args)
    {

        // Create object of Reverse class
        Reverse r = new Reverse();

        // Use functions
        r.getInput();
        r.doReverse();
    }
}


