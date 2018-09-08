/*
Faça um programa que receba três inteiros e diga qual deles é o maior e qual o menor. 
Consegue criar mais de uma solução?
 */
package Exemplos;
import java.util.Scanner;

/**
 *
 * @author Flávio
 */
public class Maior_Menor_Int {
    
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        int n1,n2,n3;
        
        System.out.print("Digite o primeiro número: ");
        n1=entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        n2=entrada.nextInt();
        System.out.print("Digite o terceiro número: ");
        n3=entrada.nextInt();
        
        if (n1!=n2 && n1!=n3 && n2!=n3){
            if(n1>n2 && n1>n3 && n2>n3){
                System.out.println(n1+" é o maior, e "+n3+" é o menor.");
            }
            else if (n1>n2 && n1>n3 && n3>n2){
                System.out.println(n1+" é o maior, e "+n2+" é o menor.");
            }
            else if (n2>n1 && n2>n3 && n1>n3){
                System.out.println(n2+" é o maior, e "+n3+" é o menor.");
            }
            else if (n2>n1 && n2>n3 && n3>n1){
                System.out.println(n2+" é o maior, e "+n1+" é o menor.");
            }
            else if (n3>n1 && n3>n2 && n1>n2){
                System.out.println(n3+" é o maior, e "+n2+" é o menor.");
            }
            else{           //(n3>n1 && n3>n2 && n2>n1)
                System.out.println(n3+" é o maior, e "+n1+" é o menor.");
            }
        }
        else{
            System.out.println("Os números são iguais!");
        }
    }    
}
