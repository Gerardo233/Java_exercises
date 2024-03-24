package Poligonos;

import Areas.Triangle;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner input = new Scanner(System.in);



    public static void main(String[] args) {
        AskData();
    }

    public static void AskData() {
        int opcion;
        char respuesta;
        boolean quit = false;


        do {
            System.out.println("Digite el tipo de poligono: ");
            System.out.println("1. Calcular area de triangulo");
            System.out.println("2. Calcular area de rectangulo");
            System.out.println("3. Imprimir informacion");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    FillTria();

                    break;

                case 2:
                    FillRecta();
                    break;

                case 3:
                    PrintPolis(poligono);
                    break;
            }

            System.out.println("Continuar con otro figura: ");
            respuesta = input.next().charAt(0);
            if (respuesta != 's' && respuesta != 'S') {
                quit = true;
            }
        } while (!quit);


    }
    static void FillTria(){
        double altura, base;
        System.out.println("Altura: ");
        altura = input.nextDouble();
        System.out.println("Base: ");
        base = input.nextDouble();

        Tria triangulo = new Tria(3);
        triangulo.setBase(base);
        triangulo.setHeight(altura);
        System.out.println("El area es: " + triangulo.CalcArea());

        poligono.add(triangulo);
    }

    static void FillRecta(){
        double altura, base;
        System.out.println("Altura: ");
        altura = input.nextDouble();
        System.out.println("Base: ");
        base = input.nextDouble();

        Recta recta = new Recta(2);
        recta.setBase(base);
        recta.setHeight(altura);
        System.out.println("El area es: " + recta.CalcArea());
        poligono.add(recta);
    }

    static void PrintPolis(ArrayList<Poligono> polis){
        for (int i = 0; i < polis.size() ; i++) {
            System.out.println("El numero de lados del poligono " + (i+1) + " es: " + polis.get(i).getNumSides());

        }
    }


}
