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
public class Entrada_Dados_Int {
    
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        int idade;
        int ano_atual;
        int ano_nasc;
        
        System.out.println("Digite sua idade: ");
        idade=entrada.nextInt();                        //Armazena a informação digitada na variável "idade".
        
        Calendar calendario=Calendar.getInstance();     //Cria o objeto "calendario".
        ano_atual=calendario.get(Calendar.YEAR);        //O "calendario" chama o ano atua do computador ou servidor e armazena na variável "ano_atual".
        
        ano_nasc=ano_atual-idade;                       //Realiza o calculo para determinar o ano em que o usuário nasceu.
        
        System.out.printf("Você nasceu em: "+ano_nasc+" \n");
        
    }
    
    /* tudo isso agora, de uma forma resumida:
        
    public static void main(String[] args){
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Digite sua idade: ");
        Calendar calendario=Calendar.getInstance();
        
        System.out.printf("Você nasceu em: "+(caendario.get(Calendar.YEAR)-entrada.nextInt())+" \n");
        
    }   */    
}
