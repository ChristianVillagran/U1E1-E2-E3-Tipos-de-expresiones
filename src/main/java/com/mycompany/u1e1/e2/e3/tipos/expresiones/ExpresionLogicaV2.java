package com.mycompany.u1e1.e2.e3.tipos.expresiones;

import java.util.Scanner;

public class ExpresionLogicaV2 {
    public ExpresionLogicaV2(){
    Scanner leer=new Scanner(System.in);
boolean validar = false;
String expresion;
String caracteres= "";
String Numeros="";
String cadena="";
int n_caracteres=0;
int n_numeros=0;
int n_cadena=0;
        System.out.println("Ingrese expresión");
        expresion=leer.nextLine();
        String expres[]=expresion.split(" ");
        for (int i = 0; i <expres.length; i++) {
            validar=expres[i].matches("[+-]?\\d*(\\.\\d+)?");
            if (validar==true) {
                n_numeros++;
                Numeros+=" "+expres[i];
            }
           if(validar== false){
                if(expres[i].length()==1){
                n_caracteres++;
                caracteres+=" "+expres[i];  
            }else{
                    cadena+=" "+expres[i];
                    n_cadena++;}
                }
        }
        System.out.println("Cantidad numeros: "+n_numeros+" numeros: "+Numeros);
        System.out.println("Cantidad cadenas: "+n_cadena+" cadenas: "+cadena);
        System.out.println("Cantidad caracteres: "+n_caracteres+" caracteres: "+caracteres);
}
}