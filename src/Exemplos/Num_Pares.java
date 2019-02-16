/*
Escreva um aplicativo em Java mostra todos os números pares de 1 até 100.
*/
package Exemplos;

/**
 *
 * @author Flávio
 */
public class Num_Pares {
    
    public static void main(String[]args){
        
        int n_ini=1,
            n_par;
        
        while(n_ini<=100){                      //Enquanto 'n_ini' for menor ou igual à 100, continue...
            
            n_ini++;                            //Incrementa de 1 em 1
            n_par=n_ini%2;                      //Atribui à 'n_par' o resultado do modulo de 'n_ini' dividido por 2 
            if(n_par==0){                       //Se o modulo for igual a zero então continua
                System.out.print(n_ini+" ");
                n_ini++;                        //n_ini=n_ini+n+ini
            }
        }
    }
}
//uma forma mais simples desde que o número inicial seja par:

/*
        int n_ini=2;
        
        while(n_ini<=100){
            System.out.print(n_ini+" ");
            n_ini+=2;
        }

*/