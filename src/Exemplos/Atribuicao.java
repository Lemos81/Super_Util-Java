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
public class Atribuicao {
    
    public static void main(String[] args){
        
        int a=1,b=2;
        
        System.out.println("Valor inicial de a: "+a);
        System.out.println("Valor inicial de b: "+b);
        System.out.println("Fazendo a+=b");
        a+=b;
        System.out.println("Agora a= "+a+"\n");
        
        System.out.println("Fazendo a-=b");
        a-=b;
        System.out.println("Agora a= "+a+"\n");
                
        System.out.println("Fazendo a*=b");
        a*=b;
        System.out.println("Agora a= "+a+"\n");
                
        System.out.println("Fazendo a+=2");
        a+=2;
        System.out.println("Agora a= "+a+"\n");

        System.out.println("Fazendo a/=b");
        a/=b;
        System.out.println("Agora a= "+a+"\n");
                
    }
}
