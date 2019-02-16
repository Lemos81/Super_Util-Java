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
public class PG {           //Progressão Geométrica
    
    public static void main(String[]args){
        
        int inicial=1,
            quociente=2,
            gn=inicial,
            valor_max=32;
        
        System.out.printf("Elementos da PG, de valor inicial %d e quociente %d, menores que %d\n",inicial,quociente,valor_max);
        while(gn<=valor_max){
            System.out.print(gn+" ");
            gn*=quociente;              //gn=gn*quociente;
        }
        
    }
}
