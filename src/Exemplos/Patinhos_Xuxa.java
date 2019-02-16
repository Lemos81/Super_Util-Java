/*
Programa em Java dos patinhos da Xuxa.

Xuxa, a rainha dos baixinhos, criou uma música que tem o segunte formato:
-> n patinhos foram passear; Além das montanhas; Para brincar;
A mamãe gritou: Quá, quá, quá, quá;
Mas só n-1 patinhos voltaram de lá.

Que se repete até nenhum patinho voltar de lá.
Ao final, todos os patinhos voltam:
->A mamãe patinha foi procurar; Além das montanhas; Na beira do mar;
A mamãe gritou: Quá, quá, quá, quá;
E os n patinhos voltaram de lá.

Crie um programa em Java que recebe um inteiro positivo do usuário e exibe a música inteira na tela, 
onde o inteiro recebido representa o número inicial n de patinhos que foram passear.
 */
package Exemplos;
import java.util.Scanner;

/**
 *
 * @author Flávio
 */
public class Patinhos_Xuxa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        int n_ini_patos=0,
            n_patos,
            n_minimo=1,
            n_max;
        
        System.out.print("Informe quantos patinhos foram passear: ");
        n_ini_patos=entrada.nextInt();
        n_max=n_ini_patos-1;                    //Declarei que o número maximo é igual ao inicial
        n_patos=n_ini_patos;
        
        if(n_ini_patos>0){                      //Tratamento de erro
            while(n_patos>=n_minimo){           //Enquanto n_patos for maior ou igual 1, executa a sequencia.
                System.out.printf("\n%d patinhos foram passear\nAlem das montanhas para brincar\n"
                        + "A mamãe gritou: Qua, qua, qua, qua!",n_patos);
                n_patos-=1;                     //n_patos=n_patos-1
                System.out.printf("\nMas só %d patinhos voltaram de lá.\n",n_patos);
            }
            while(n_patos<=n_max){              //Enquanto n_patos for menor que o n_max, executa a sequencia
                System.out.printf("\nA Mamãe patinha foi procurar\nAlem das montanhas na beira do mar\n"
                        + "A mamãe gritou: Qua, qua, qua, qua!",n_patos);
                n_patos+=1;                     //n_patos=n_patos+1
                System.out.printf("\nE %d patinhos voltaram de lá.\n",n_patos);
            }
        }
        else{
            System.out.println("Deve ser informado um número superior a 0!");
        }
    }
    
}
