/*
Programa em Java que mostra os números pares e ímpares 
Escreva um aplicativo em Java que recebe inteiro 
e mostra os números pares e ímpares (separados), de 1 até esse inteiro.
 */
package Exemplos;
import java.util.Scanner;

/**
 *
 * @author Flávio
 */
public class Num_Pares_Impares {
    
    public static void main(String[]args){
        
        Scanner entrada=new Scanner(System.in);
        int n_limite,
            par=0,
            impar=0,
            num;
        
        System.out.print("Determine um número limite para exibir a sequencia:");
        n_limite=entrada.nextInt();

        System.out.print("\nNúmeros Pares: \n");        
        while(par<n_limite){                                //Enquanto 'par' for menor que 'limite', dar sequência
            
            par++;                                          //Incrementa de 1 em 1
            num=par%2;                                      //Atribui à 'num' o valor do modulo de 'par' dividido por 2
            if(num==0){                                     //Se o modulo for igual a zero, dar sequência.
                System.out.print(par+" ");     
            }
        }

        System.out.print("\n\nNúmeros Impares: \n");        
        while(impar<n_limite){                              //Enquanto 'impar' for menor que 'limite', dar sequência
            
            impar++;                                        //Incrementa de 1 em 1
            num=impar%2;                                    //Atribui à 'num' o valor do modulo de 'impar' dividido por 2
            if(num!=0){                                     //Se o modulo for igual a zero, dar sequência.
                System.out.print(impar+" ");     
            }
        }
    }    
}
