/*
Achando o maior número:
Achar o maior, menor, média e organizar números ou sequências 
são os algoritmos mais importantes e estudados em Computação. 
Em Java não poderia ser diferente.

Escreva um programa em Java que solicita 10 números ao usuário, através de um laço while, 
e ao final mostre qual destes números é o maior.
 */
package Exemplos;
import java.util.Scanner;

/**
 *
 * @author Flávio
 */
public class Achar_Maior {
    
    public static void main(String[]args){
        
        Scanner entrada=new Scanner(System.in);
        float maior,                                    //Variável que armazenará o número maior.
              num;                                      //Variável que armazenará os números digitados.
        int count=2;                                    //Variável que contará até o limite estiulado, a partir do segundo número.
        
        System.out.print("Informe o 1.º número: ");
        num=entrada.nextFloat();                        //Recebe o primeiro número pelo usuário.
        maior=num;                                      //Por não haver outros números ele é o maior.
        
        while(count<=10){                                           
            System.out.print("Digite o "+count+".º número: ");      
            num=entrada.nextFloat();                    //Recebe os demais números.
            
            if(num>maior){                              //Compara se o número digitado é maior que o armazenado em 'maior'.
                maior=num;                              //Em caso positivo, substitui o número armazenado pelo maior.
            }
            count++;                                    //Incremento do contador.
        }
        System.out.println("O número maior é "+maior);
    }
}
// Um outro modo de fazer este mesmo programa:
/*
        int count=1;                                    //Variável que contará até o limite estipulado, a partir do primeiro número.

        while(count<=10){
            System.out.print("Digite o "+count+".º número: ");
            
            if(count==1){                               //Se for o primeiro número digitado, logicamente é o maior então
                maior=entrada.nextFloat();              //armazena o número na variavel 'maior'.
            }
            else{
                num=entrada.nextFloat();                //Caso seja do segundo número em diante, armazena na variável 'num'.
                if(num>maior){                          //Compara se 'num' é maior que 'maior'. 
                    maior=num;                          //Caso positivo, atribui o valor de 'num' à 'maior'.
                }
            }
            count++;                                    //Incrementa o contator.
        }
*/