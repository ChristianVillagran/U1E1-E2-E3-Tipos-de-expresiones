package com.mycompany.u1e1.e2.e3.tipos.expresiones;

import java.util.Scanner;

public class ExpresionLogica {
    public ExpresionLogica(){
     Scanner leer=new Scanner(System.in);
        
        System.out.println("Expresion: [(p->q)^p]->q");
        System.out.println("Si desea negar marque 0");
        System.out.println("Si desea continuar marque 1");
        String elegir=leer.nextLine();
        String a []={"v","v","f","f"};
        String b []={"v","f","v","f"};
        String []c1=new String[4];
        String []c2=new String[4];
        String []c3=new String[4];
        String []c4=new String[4];
        
        if (elegir.charAt(0)=='0') {
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("v") && b[i].equals("f")) {
                c1[i]="f";
            }else{
                c1[i]="v";
            }
            }
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("v")&&c1[i].equals("v")) {
                c2[i]="v";
            }else{
                c2[i]="f";
            }
            }
        for (int i = 0; i < b.length; i++) {
            if ( b[i].equals("f")&&c2[i].equals("v") ) {
                c3[i]="v";
            }else{
                c3[i]="f";
            }
            }
        System.out.println("p  q   (p->q)  [(p->q)]^]    [(p->q)]^]->q");
            for (int i = 0; i <4; i++) {
            System.out.println(a[i]+"  "+b[i]+"     "+c1[i]+"         "+c2[i]+"               "+c3[i]);    
            }
            
            System.out.println("Es una Contradiccion");
            
        }else if(elegir.charAt(0)=='1'){
        
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("v") && b[i].equals("f")) {
                c1[i]="f";
            }else{
                c1[i]="v";
            }
            }

        
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("v")&&c1[i].equals("v")) {
                c2[i]="v";
            }else{
                c2[i]="f";
            }
            }
        
        for (int i = 0; i < b.length; i++) {
            if ( b[i].equals("f")&&c2[i].equals("v") ) {
                c3[i]="f";
            }else{
                c3[i]="v";
            }
            }   
            System.out.println("p  q   (p->q)  [(p->q)]^]    [(p->q)]^]->q");
            for (int i = 0; i <4; i++) {
            System.out.println(a[i]+"  "+b[i]+"     "+c1[i]+"         "+c2[i]+"               "+c3[i]);    
            }
            System.out.println("Es una Tautologia");
        
        }
}
}
