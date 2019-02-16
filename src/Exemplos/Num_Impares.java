/*
Escreva um aplicativo em Java que mostra todos os números ímpares de 1 até 100.
 */
package Exemplos;

/**
 *
 * @author Flávio
 */
public class Num_Impares {
    
    public static void main(String[]args){
        
        int n_ini=1,
            n_impar;
        
        while(n_ini<100){                      //Enquanto 'n_ini' for menor que 100, continue...
            
            n_ini++;                            //Incrementa de 1 em 1
            n_impar=n_ini%2;                    //Atribui à 'n_impar' o resultado do modulo de 'n_ini' dividido por 2
            if(n_impar!=0){                     //Se o modulo for igual a 1 então continua
                System.out.print(n_ini+" ");
                n_ini++;
            }
        }
    }    
}

//uma forma mais simples desde que o número inicial seja impar:

/*
        int n_ini=1;
        
        while(n_ini<=100){
            System.out.print(n_ini+" ");
            n_ini+=2;
        }

*/