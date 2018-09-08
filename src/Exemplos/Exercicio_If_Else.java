/*
Crie um programa que recebe uma nota ( pela classe Scanner) 
e checa se você passou direto, ficou de recuperação ou foi reprovado na matéria, e exiba tal mensagem:
A regra é a seguinte:
Nota 7 ou mais: passou direto
Entre 5 e 7: tem direito de fazer uma prova de recuperação
Abaixo de 5: reprovado direto.

Depois Refaça o mesmo problema.
Teste se a nota está entre 0.0 e 10.0.
Depois se foi reprovado direto, se sim, termina o programa. 
Se não, vai pra outro if pra saber se está de recuperação. Se estiver, termina.
Se não estiver de recuperação, vai pro else que diz que ele passou direto.
 */
package Exemplos;
import java.util.Scanner;

/**
 *
 * @author Flávio
 */
public class Exercicio_If_Else {
    
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        float nota;
        
        System.out.print("Digite sua nota final: ");
        nota=entrada.nextFloat();
        
        //Primeiro testa seo usuário digitou algo entre 0 e 10, caso contrário, retorna erro.
        if (nota<=10 && nota>=0){
            
/*          //Primeiro programa:
            
            if (nota>=7){                                           //aqui é verificado se passou direto.
                System.out.println("Parabéns! Você passou direto!");
            }
            else if (nota>5){                                       //aqui verifica se ficou de recuperação.
                System.out.println("Você tem direito de fazer uma prova de recuperação!");
            }
            else {                                                  //aqui retorna se foi reprovado.
                System.out.println("Você foi reprovado!");
            }
            
*/          //Segundo programa
            
            if (nota<=5){                                           //aqui verifica se foi reprovado.
                System.out.println("Você foi reprovado!");
            }
            else if (nota<7){                                       //aqui verifica se ficou de recuperação.
                System.out.println("Você tem direito de fazer uma prova de recuperação!");
            }
            else {                                                  //aqui retorna se foi aprovado.
                System.out.println("Parabéns! Você foi aprovado!");
            }
        }
        else {                                      //aqui retorna caso o usuário tenha digitado algo diferente do solicitado.
            System.out.println("Nota inválida!");
        }
    }    
}
