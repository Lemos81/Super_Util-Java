/*
Programa em Java que calcula a média das notas de uma turma
Escreva um programa que pergunte ao usuário quantos alunos tem na sala dele.
Em seguida, através de um laço while, 
pede ao usuário para que entre com as notas de todos os alunos da sala, um por vez.
Por fim, o programa mostra a média aritmética da turma.
 */
package Exemplos;
import java.util.Scanner;

/**
 *
 * @author Flávio
 */
public class Media_Turma {
    
    public static void main(String[]args){
        
        Scanner entrada=new Scanner(System.in);
        int numAlunos;                            //Variável que será usada para obter o número de alunos que o usuário digitar.
        
        System.out.print("Quantos alunos esta turma possui? ");
        numAlunos=entrada.nextInt();                //Entrada do número de alunos.

// Laço condicional com a finalidade de armazenar os alunos e suas notas.         
        int idAluno=1,                              //Variável de identificação do aluno.
            aluno=0;                                //Variável de associação nota/aluno.
        float[] nota=new float[numAlunos];          //Variável - Criei um lista de nota de Alunos determinando o tamanho dele por meio do número de alunos digitado.
        
        while (aluno<nota.length){
            System.out.print("Digite a nota do "+idAluno+".º aluno da turma: ");
            nota[aluno]=entrada.nextFloat();        //entrada da nota de cada aluno.
            aluno++;                                //Conta até chegar ao número informado pelo usuário.
            idAluno++;                              //Indentifica da aluno númericamente, 1, 2, 3...
        }

// Laço condicional para calcular a média da turma. 
        aluno=0;
        float soma=0,                               //Variável que irá armazenar a soma das notas.
              media;                                //Variável que exibirá a média da turma.
        
        while (aluno<nota.length){
            soma+=nota[aluno];                      //Soma as notas digitadas pelo usuário.
            aluno++;                                //Interrompe quando atingir a quantidade de alunos.
        }

        media=soma/numAlunos;                       //Caucula a média.
        System.out.printf("A média da turma é de: %.2f\n",media);
    }
}
