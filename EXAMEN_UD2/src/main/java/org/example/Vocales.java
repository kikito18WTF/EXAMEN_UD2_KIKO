package org.example;

import java.util.Scanner;

public class Vocales {

    static void main() {

        Scanner entrada = new Scanner(System .in);

        System.out. println("Introduce una frase..");

        String frase = entrada.nextLine();


        int cont_a =0;

        int cont_e =0;

        int cont_i =0;

        int cont_o =0;

        int cont_u =0;

        for (int i = 0; i <frase.length() ; i++) {


            frase = frase.toLowerCase();

            switch (frase.charAt(i)){


                case 'a':
                    cont_a++;
                    break;
                case  'e':
                    cont_e++;
                break;
                case 'i':
                    cont_i++;
                    break;
                case 'o':
                    cont_o++;
                    break;
                case 'u':
                    cont_u++;
                    break;

                default:

            }






        }

        System.out.println("Vocales totales: " + (cont_a+cont_e+cont_i+cont_o+cont_u));
        System.out.println("A: "+ cont_a);
        System.out.println("E: " + cont_e);
        System.out.println("I: "+ cont_i);
        System.out.println("O: "+ cont_o);
        System.out.println("U: "+ cont_u);


    }

}
