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
public class Maior_Menor_Comparativo {
    
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        float n1,n2;
        
        System.out.print("Digite o primeiro número: ");
        n1=entrada.nextFloat();
        
        System.out.print("Digite o segundo número: ");
        n2=entrada.nextFloat();
        
        //fazer cmparações numéricas e retornar se é verdadeiro ou falso (%s).
        
        System.out.printf("\n%.2f>%.2f->%s\n",n1,n2,n1>n2);
        System.out.printf("%.2f>=%.2f->%s\n",n1,n2,n1>=n2);
        System.out.printf("%.2f<%.2f->%s\n",n1,n2,n1<n2);
        System.out.printf("%.2f<=%.2f->%s\n",n1,n2,n1<=n2);
        System.out.printf("%.2f==%.2f->%s\n",n1,n2,n1==n2);
        System.out.printf("%.2f!=%.2f->%s\n",n1,n2,n1!=n2);
        
        //outro modo de fazer seria:
        
//        System.out.printf(n1+" é maior que "+n2+"? %s\n",n1>n2);
    }    
}
