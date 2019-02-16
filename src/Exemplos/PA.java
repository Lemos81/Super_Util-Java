/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos;

/**
 *
 * @author Flávio
 */
public class PA {       //Progressão Aritmética.
    
    public static void main(String[]args){
        
        int inicial=1,
            razao=3,
            an=inicial,
            valor_max=20;
        
        System.out.printf("Elementos da PA, de valor inicial %d e razão %d, menores que %d\n",inicial,razao,valor_max);
        
        while(an<=valor_max){
            System.out.print(an+" ");
            an+=razao;          //an=an+razao;
        }
        
    }
}
