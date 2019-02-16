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
public class Increment {
    
    public static void main(String[]args){
        
        int a,b=1;
        
        System.out.println("b = "+b);
        System.out.println("a = b++");
        a=b++;
        System.out.println("a = "+a+" e b = "+b+"\n");
        
        System.out.println("b = "+b);
        System.out.println("a = ++b");
        a=++b;
        System.out.println("a = "+a+" e b = "+b+"\n");
                
    }    
}
