/*
Achando os dois maiores números

Escreva um programa em Java que solicita 10 números ao usuário, através de um laço while, 
e ao final mostre os dois maiores números digitados pelo usuário.
 */
package Exemplos;
import java.util.Scanner;

/**
 *
 * @author Flávio
 */
public class Achar_2_Maiores {
    
    public static void main(String[]args){
        
        Scanner entrada=new Scanner(System.in);
        float maior1=0,                             //Variável que armazenará o maior número.
              maior2=0,                             //Variável que armazenará o segundo maior número.
              num;                                  //Variável que armazenará os números digitados.
        int count=1;                                //Variável contador.
        
        while(count<=10){
            System.out.print("Digite o "+count+".º número: ");
            
            if(count==1){                           //Caso seja o primeiro número digitado, pela lógica será o maior.
                maior1=entrada.nextFloat();         //Então será armazenado em 'maior1'.
            }
            else{
                num=entrada.nextFloat();            //Caso não seja o primeiro número digitado, será armazenado em 'num' para comparação.
                
                if(num>maior1){                     //Caso 'num' seja maior que 'maior1'.
                    maior2=maior1;                  //Atribui o valor de 'maior1' à 'maior2'.
                    maior1=num;                     //Atribui o valor de 'num' à 'maior1'.
                }
                else if(num>maior2 && num<maior1){  //COnforme for inserindo os demais números, fará o comparativo.
                        maior2=num;                 // Sendo 'num' menor que 'maior1' e maior que 'maior2', atribui o valor de 'num' à 'maior2'.
                }
            }
            count++;                                //contará até o limite informado (neste caso, no primeiro while).
        }
        System.out.printf("O núemro maior é %.2f e o segundo maior número é %.2f\n",maior1,maior2);
    }
    
}
