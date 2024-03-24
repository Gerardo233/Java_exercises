import java.util.Scanner;
public  class Main {
    public void Menu(){
        System.out.println("1. Calcular area de un triangulo");
        System.out.println("2. Calcular el area de un rectangulo");
        System.out.println("3. Calcular el area de un circulo");
    }

    public  void AskShapeValues(Scanner input, Shape shape) {
        if(shape.getNumSides() == 2){
            shape.setRadio(0);
            System.out.println("Type the height: ");
            double height = input.nextInt();
            shape.setHeight(height);

            System.out.println("Type the length: ");
            double length = input.nextInt();
            shape.setLength(length);
        }else{
            System.out.println("Type the radio: ");
            double radio = input.nextInt();
            shape.setRadio(radio);
        }
    }

    public static void main(String[] args) {
    Main main = new Main();
    Triangle triangle_1 = new Triangle();
    Rectangle rectangle_1 = new Rectangle();
    Circle circle_1 = new Circle();

    Scanner input = new Scanner(System.in);
    boolean quit = false;
    double height;
    double length;
    double radio;

    do{
        main.Menu();
        int option = input.nextInt();
        switch (option){
            case 1:
                triangle_1.setNumSides(3);
               main.AskShapeValues(input, triangle_1);
                System.out.println("The area of the shape is: " + triangle_1.CalcArea(triangle_1.getHeight(), triangle_1.getLength()));
                break;

            case 2:
                rectangle_1.setNumSides(2);
                main.AskShapeValues(input, rectangle_1);
                System.out.println("The area of the shape is: " + rectangle_1.CalcArea(rectangle_1.getHeight(), rectangle_1.getLength()));
                break;

            case 3:
                circle_1.setNumSides(0);
                main.AskShapeValues(input, circle_1);
                System.out.println("The area of the shape is: " + circle_1.CalcArea(circle_1.getRadio()));
                break;

            case 4:
                quit = true;
                break;
        }
    }while (!quit);
    }
}