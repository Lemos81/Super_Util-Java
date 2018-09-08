/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos;
import java.util.Scanner;
/**
 *
 * @author Flávio
 */
public class Operacoes_Print {
    
    public static void main(String[] args) {
        
//        Scanner entrada=new Scanner(System.in);
//        float n1,n2;
        
//        System.out.print("Digite o primeiro número: ");
//        n1=entrada.nextInt();
        
//        System.out.print("Digite o segundo número: ");
//        n2=entrada.nextInt();
    
        //no caso de print ou println.          //Exemplo com variável do tipo int.
    /*
        System.out.println("\n"+n1+" + "+n2+" = "+(n1+n2));
        System.out.println(n1+" - "+n2+" = "+(n1-n2));
        System.out.println(n1+" * "+n2+" = "+(n1*n2));
    */
        
        //no caso de printf (recomendado para números fracionados ou não).   //Exemplo com variável do tipo int.
    /*    
        System.out.printf("\n%d+%d=%d\n",n1,n2,n1+n2);
        System.out.printf("%d-%d=%d\n",n1,n2,n1-n2);
        System.out.printf("%d*%d=%d\n",n1,n2,n1*n2);
    */    
        /*Em caso de variaveis float, use %f.
        e se quiser estipular a quantidade de dígitos após a vírgula,
        coloque "." e o número desejado entre o "%" e o "f". 
        
        Neste caso: */
    /*    
        System.out.printf("\n%.2f+%.2f=%.2f\n",n1,n2,n1+n2);
        System.out.printf("%.2f-%.2f=%.2f\n",n1,n2,n1-n2);
        System.out.printf("%.2f*%.2f=%.2f\n",n1,n2,n1*n2);
        System.out.printf("%.2f/%.2f=%.2f\n",n1,n2,n1/n2);
    */
    
        /*No caso de divisão de variaveis do tipo int, veja que o java retorna um número inteiro.
          Já como float, exibe o número fracionado.
          Veja:     */
        
    //    float n1=5,n2=2;    
    //    System.out.println(n1/n2);
    
        //Testando o mod "%".
        
        System.out.println(2009%19);
        
    }    
}
