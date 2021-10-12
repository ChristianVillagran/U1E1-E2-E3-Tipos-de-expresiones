package com.mycompany.u1e1.e2.e3.tipos.expresiones;

import java.util.Scanner;

public class TiposDeExpresiones {


    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        boolean continuar=true;
        int opcion;
        while(continuar){
            System.out.println("");
            System.out.println("1.- Expresión aritmetica");
            System.out.println("2.- Expresión lógica");
            System.out.println("3.- Expresión lógica V2");
            System.out.println("4.- Salir");
            opcion=leer.nextInt();
            switch(opcion){
                case 1:
                    ExpresionAritmetica x=new ExpresionAritmetica();
                    break;
                case 2:
                    ExpresionLogica x1=new ExpresionLogica();
                    break;
                case 3:
                    ExpresionLogicaV2 x2=new ExpresionLogicaV2();
                    break;
                case 4:
                    continuar=false;
                    break;
                default:
                    System.out.println("Elija una opcion valida");
                    break;
    }
    
}
    }
}