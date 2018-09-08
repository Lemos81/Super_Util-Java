/*
Escreva um programa em Java que recebe um inteiro e diga se é par ou ímpar
Use o operador matemático % (resto da divisão ou módulo) e o teste condicional if.
 */
package Exemplos;
import java.util.Scanner;

/**
 *
 * @author Flávio
 */
public class Par_ou_Impar {
    
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        int num, result;
                
        System.out.print("Digite um número: ");
        num=entrada.nextInt();                      //Recebe o número digitado pelo usuário.
        
        result=num%2;                               //%2, O número vai sendo decrescido de duas em duas unidades, até que o resto seja 1 ou 0.
                                                    //EX: 5%2 == 5-2=3 ... 3-2=1 ou seja 5%2=1
       
        if (result==0){
            System.out.println("O número "+num+" é par!");
        }
        else{
            System.out.println("O número "+num+" é impar");
        }
    }    
}
