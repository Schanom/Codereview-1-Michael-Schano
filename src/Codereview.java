public class Codereview {
    static void calculateRectAreaLeft(int a, int b) {
        int area = a * b;
        System.out.println("The area of the rectangle is " + area + "m².");
        System.out.println();
    }
    static void calculateRectArea(double width, double height) {
        double area = width * height;
        System.out.println("The area of the rectangle is " + area / 100 + "m².");
        System.out.println();
    }
    static void calculateSquareArea(int width) {
        int area = width * width;
        System.out.println("The area of the square is " + area + "m².");
        System.out.println();
    }
    static void calculateSquarePerimeter(int width) {
        int perimeter = width * 4;
        System.out.println("The perimeter of the square is " + perimeter + "m².");
        System.out.println();
    }

    public static void main(String[] args) {
        //Number 2
        System.out.println("The area of the rectangle on the left side will be calculated here(Area =  5m * 2m)");
        calculateRectAreaLeft(5,2);

        //Number 3
        System.out.println("The area of a rectangle will be calculated here(Area =  20cm * 30cm)");
        calculateRectArea(20,30);

        System.out.println("The area of a rectangle will be calculated here(Area =  40cm * 50cm)");
        calculateRectArea(40,50);

        //Number 4
        System.out.println("The area of the right square will be calculated here(Area =  4m * 4m)");
        calculateSquareArea(4);

        System.out.println("The perimeter of the right square will be calculated here(Perimeter =  4m * 4)");
        calculateSquarePerimeter(4);

        //Number 5
        //I called the methods from the previous tasks here with different numbers and 3 of each. I hope i understood that right.
        System.out.println("The area of a rectangle will be calculated here(Area =  70cm * 40cm)");
        calculateRectArea(70,40);

        System.out.println("The area of a rectangle will be calculated here(Area =  60cm * 50cm)");
        calculateRectArea(60,50);

        System.out.println("The area of a rectangle will be calculated here(Area =  83cm * 46cm)");
        calculateRectArea(83,46);


        System.out.println("The area of a square will be calculated here(Area =  8m * 8m)");
        calculateSquareArea(8);

        System.out.println("The area of a square will be calculated here(Area =  12m * 12m)");
        calculateSquareArea(12);

        System.out.println("The area of a square will be calculated here(Area =  63m * 63m)");
        calculateSquareArea(63);


        System.out.println("The perimeter of a square will be calculated here(Perimeter =  7m * 4)");
        calculateSquarePerimeter(7);

        System.out.println("The perimeter of a square will be calculated here(Perimeter =  42m * 4)");
        calculateSquarePerimeter(42);

        System.out.println("The perimeter of a square will be calculated here(Perimeter =  720m * 4)");
        calculateSquarePerimeter(720);





    }
}
