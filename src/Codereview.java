import java.util.*;

public class Codereview {
    //Number 2
    static void calculateRectAreaLeft(int a, int b) {
        int area = a * b;
        System.out.println("The area of the rectangle on the left side will be calculated here(Area =  " + a + "m * " + b + "m)");
        System.out.println("The area of the rectangle is " + area + "m²");
        System.out.println();
    }

    //Number 3
    static void calculateRectArea(double width, double height) {
        double area = width * height;
        System.out.println("The area of a rectangle will be calculated here(Area = "  + width + "cm * " + height + "cm)");
        System.out.println("The area of the rectangle is " + area / 100 + "m²");
        System.out.println();
    }

    //Number 4
    static void calculateSquareArea(int width) {
        int area = width * width;
        System.out.println("The area of a square will be calculated here(Area = " + width + "m * " + width + "m)");
        System.out.println("The area of the square is " + area + "m²");
        System.out.println();
    }
    static void calculateSquarePerimeter(int width) {
        int perimeter = width * 4;
        System.out.println("The perimeter of a square will be calculated here(Perimeter = " + width + "m * 4 sides)");
        System.out.println("The perimeter of the square is " + perimeter + "m².");
        System.out.println();
    }

    //Bonus 2
    static void bonus2Calculation(int width, int height) {
        int area = width * height;
        System.out.println("The area of the rectangle with " + width + "m width and " + height + "m height is " + area + "m²");
    }

        public static void main(String[] args) {
        //Number 2
        System.out.println("Task 2");
        calculateRectAreaLeft(5,2);


        //Number 3
        System.out.println("Task 3");
        calculateRectArea(20,30);
        calculateRectArea(40,50);


        //Number 4
        System.out.println("Task 4");
        calculateSquareArea(4);
        calculateSquarePerimeter(4);


        //Number 5
        //I called the methods from the previous tasks here with different numbers and 3 of each. I hope i understood that right.
        System.out.println("Task 5");
        calculateRectArea(70,40);
        calculateRectArea(60,50);
        calculateRectArea(83,46);


        calculateSquareArea(8);
        calculateSquareArea(12);
        calculateSquareArea(63);


        calculateSquarePerimeter(7);
        calculateSquarePerimeter(42);
        calculateSquarePerimeter(720);


        //Bonus 1
        //testData first dim width, 2nd dim height. All in all width and height data of 7 rectangles.
        System.out.println("Bonus Task 1");
        int[][] testData = {
                {
                        7,
                        50,
                        60,
                        70,
                        80,
                        66,
                        1367
                },
                {
                        5,
                        30,
                        40,
                        50,
                        60,
                        43,
                        720
                }
        };

        for (int i = 0; i < testData.length - 1; i++) {
            for (int j = 0; j < testData[i].length; j++){

                int width = testData[i][j];
                int height = testData[i+1][j];

                int area = width * height;

                System.out.println("The area of the rectangle with " + width + "m width and " + height + "m height is " + area + "m²");
            }
        }
        System.out.println();


        //Bonus 2
        //Not sure if i understood the task right ¯\_("_")_/¯
        System.out.println("Bonus Task 2");
        System.out.println("The area of a rectangle with your specifications will be calculated here");

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the width of your rectangle(m): ");
        int widthScanner = in.nextInt();

        System.out.print("Enter the height of your rectangle(m): ");
        int heightScanner = in.nextInt();

        bonus2Calculation(widthScanner, heightScanner);


    }
}
