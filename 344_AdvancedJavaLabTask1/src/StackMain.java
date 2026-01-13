class Stack
{
    int maxSize;
    int[] stackArray;
    int top;

    // Constructor to initialize stack
    Stack(int size)
    {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // stack is empty initially
    }

    // Push
    void push(int value)
    {
        if(top >= maxSize - 1)
        {
            System.out.println("Stack Overflow! Cannot push " + value);
        }
        else
        {
            top++;
            stackArray[top] = value;
            System.out.println(value + " pushed to stack.");
        }
    }

    // Pop
    int pop()
    {
        if(top < 0)
        {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1; // error value
        }
        else
        {
            int value = stackArray[top];
            top--;
            return value;
        }
    }

    // Display stack contents
    void display()
    {
        if(top < 0)
        {
            System.out.println("Stack is empty.");
        }
        else
        {
            System.out.print("Stack elements (top to bottom): ");
            for(int i = top; i >= 0; i--)
            {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
}

public class StackMain
{
    public static void main(String[] args)
    {
        Stack stack = new Stack(5); // stack of size 5

        // Pushing
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Display stack
        stack.display();

        // Pop elements
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Display stack after pop
        stack.display();

        // Push more elements
        stack.push(50);
        stack.push(60);
        stack.push(70); // overflow

        // Final stack display
        stack.display();
    }
}
