class Box {
    int length;
    int width;
    int height;

    // Constructor
    Box(int length, int width, int height) {
        int standardLength = 10;
        int standardWidth = 12;
        int standardHeight = 8;

        // Adjust length
        if (length < standardLength) {
            System.out.println("Length too small (" + length + "), incrementing to " + standardLength);
            this.length = standardLength;
        } else if (length > standardLength) {
            System.out.println("Length too big (" + length + "), decrementing to " + standardLength);
            this.length = standardLength;
        } else {
            this.length = length;
        }

        // Adjust width
        if (width < standardWidth) {
            System.out.println("Width too small (" + width + "), incrementing to " + standardWidth);
            this.width = standardWidth;
        } else if (width > standardWidth) {
            System.out.println("Width too big (" + width + "), decrementing to " + standardWidth);
            this.width = standardWidth;
        } else {
            this.width = width;
        }

        // Adjust height
        if (height < standardHeight) {
            System.out.println("Height too small (" + height + "), incrementing to " + standardHeight);
            this.height = standardHeight;
        } else if (height > standardHeight) {
            System.out.println("Height too big (" + height + "), decrementing to " + standardHeight);
            this.height = standardHeight;
        } else {
            this.height = height;
        }
    }

    // display box dimensions
    void displayDimensions() {
        System.out.println("Box Dimensions -> Length: " + length + ", Width: " + width + ", Height: " + height);
    }
}

public class BoxMain {
    public static void main(String[] args) {

        Box box1 = new Box(9, 12, 10);
        Box box2 = new Box(10, 15, 6);
        Box box3 = new Box(10, 12, 8);

        System.out.println("\nFinal box dimensions:");
        box1.displayDimensions();
        box2.displayDimensions();
        box3.displayDimensions();
    }
}
