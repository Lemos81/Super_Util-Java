/*
Escreva um aplicativo Java que gere um número aleatório inteiro entre 1 e 10, 
e através de testes condicionais você tem que adivinhar que número é esse.
Qual a melhor técnica, a que adivinha em menos chances possíveis?
Para gerar um número aleatório na variável inteiro 'num_aleatorio', adicione no seu programa:

*  import java.util.Random;

Para gerar números aleatórios, crie um tipo Random 'randomGenerator':

*  Random randomGenerator = new Random();

E declare a variável para receber o número aleatório assim:

*  num_aleatorio = randomGenerator.nextInt(10) + 1;

*/
package Exemplos;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Flávio
 */
public class Numero_Aleatorio {
    
    public static void main(String[]args){
        
        Scanner entrada=new Scanner(System.in);
        Random randomGenerator=new Random();
        int numAleatorio = randomGenerator.nextInt(10)+1;       //Declarei a variavel para sortear um número de zero a dez.
        int numPalpite;
        
        System.out.print("Bem vindo ao jogo do sorteio!\nTente adivinhar qual o número sorteado entre 0 e 10.\n\nDigite o seu palpite:");
        numPalpite=entrada.nextInt();
        
        if (numPalpite>=0 && numPalpite<=10){
            if (numPalpite==numAleatorio){
                System.out.println("Parabéns! Você acertou!");
            }
            else if (numPalpite<numAleatorio){
                System.out.println("Seu palpite foi menor que o número sorteado!");
            }
            else{
                System.out.println("Seu palpite foi maior que o número sorteado!");
            }
            System.out.println("\nO número sorteado foi: "+numAleatorio);  
        }
        else{
            System.out.print("Dado inválido!\nDigite um número entre 0 e 10!");
        }    
    }
}