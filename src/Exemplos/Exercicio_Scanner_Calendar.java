/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Flávio
 */
public class Exercicio_Scanner_Calendar {
    
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        int Ano_Nasc;
        int Ano_Atual;
        int idade;
        
        System.out.println("Digite o ano de seu nascimento: ");
        Ano_Nasc=entrada.nextInt();                             //Recebe a informação digitada e armazena na variável "Ano_Nasc".
        
        Calendar calendario=Calendar.getInstance();
        Ano_Atual=calendario.get(Calendar.YEAR);                //Recebe a informação do ano atual que está no computador/servidor e armazena na variavel "Ano_Atual".
        
        idade=Ano_Atual-Ano_Nasc;                               //Realiza o cálculo para definir a idade do usuário e armazena na variável "idade".
        
        System.out.printf("Sua idade é: "+idade+" anos\n");
        
    }
    /*  Tudo isso resumido:
    
    public static void main(String[] args){
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Digite o ano de seu nascimento: ");
        Calendar calendario=Calendar.getInstance();
    
        System.out.printf("Sua idade é: "+(calendario.get(Calendar.YEAR)-entrada.nextInt())+" anos\n");
    
    }   */    
}
