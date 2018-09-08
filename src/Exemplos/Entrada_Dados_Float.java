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
public class Entrada_Dados_Float {
    
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        float preco;
        
        System.out.println("Quanto custa algo em uma loja de R$ 1,99?");
        preco=entrada.nextFloat();                                          //Armazena a informação digitada na variável "preco".
        
        System.out.printf("Hã? Custa R$ "+preco+"?\n");
        
    }    
}
