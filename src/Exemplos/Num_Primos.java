/*
Elabore um algoritmo para mostrar os números primos existentes em um intervalo.
1. O usuário deverá fornecer os valores inicial (inicia>0) e final (inicial<final) 
e os números primos existentes no intervalo ([inicial, final]) devem ser separados por um espaço em branco. 
Exemplo:
Entrada: 2 e 13
Saída: 2 3 5 7 11 13

Lembrando Números Primos:
Não pode ser par, exceto o 2.
Divisível por 1 e por ele próprio.
Tem que ser inteiro e positivo.
 */
package Exemplos;
import java.util.Scanner;

/**
 *
 * @author Flávio
 */
public class Num_Primos {
    
   
    public static void main(String[] args) {
       
        Scanner Escreve = new Scanner (System.in);
	int nIni,                
            nFin,
            i,j;
        boolean primo;
            
        System.out.println ("Digite um número para iniciarmos:");
	nIni = Escreve.nextInt ();	
	System.out.println ("Digite um número para finalizarmos:");
	nFin = Escreve.nextInt ();
        
        if(nIni<nFin){
            
            for (i = nIni; i < nFin; i++) {             //verificar se nIni é menor que nFin e implementa todos os número em 'i'.
                primo = true;                           //Considere todos os números primo.
                
                if (i<=1){                              //Se for menor ou igual a 1, não é primo.
                    primo=false;
                }
                for (j = 2; j <= i; j++) {              //Verifica a partir de 2, se é menor ou igua a 'i' e implementa a sequencia em 'j'.
                    if (((i % j) == 0) && (j != i)) {   //Verifica se a divisão de 'i' por 'j', se o resultado for igual a zero E 'j' diferente de 'i', não é primo.
                        primo = false;
                        break;
                    }
                }
                if (primo) {                            //Todas as verificações sendo verdadeiras, 
                    System.out.print(i+" ");            //então retorna os números primos do intervalo selecionado pelo usuário.
                } 
            }
        }
        else{
            System.out.println("\nO número inicial deve ser menor que o número final.");
        }
    }    
}