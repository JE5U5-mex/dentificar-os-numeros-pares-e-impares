//Faça um algoritmo que lê um número e verificar se ele é par ou é ímpar.
package estudar;

import java.util.Scanner;

/**
 *
 * @author andrey josè nogueira
 */
public class Estudar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
    int x;
    x = teclado.nextInt();
    if( x %2==0) {
        System.out.println("mumero par");
    }
    else {
        System.out.println("mumero impar");
    }
    }
    
}
