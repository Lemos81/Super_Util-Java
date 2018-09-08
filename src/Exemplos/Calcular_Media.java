/*
Crie um programa que recebe suas três notas (colégio, faculdade) e calcule a média final.
 */
package Exemplos;
import java.util.Scanner;

/**
 *
 * @author Flávio
 */
public class Calcular_Media {
    
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        float n1,n2,n3,media;
        
        System.out.print("Digite sua primeira nota: ");
        n1=entrada.nextFloat();
        System.out.print("Digite sua segunda nota: ");
        n2=entrada.nextFloat();
        System.out.print("Digite sua terceira nota: ");
        n3=entrada.nextFloat();
        
        media=(n1+n2+n3)/3;
        
        System.out.printf("\nA média de suas notas é: %.2f\n",media);   //%.2f limita à 2 casas decimais após a vírgula
    }
}
