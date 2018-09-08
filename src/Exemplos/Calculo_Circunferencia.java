/*
Escreva um programa que receba o raio de uma circunferência 
e mostre o diâmetro, comprimento e área desta.
 */
package Exemplos;
import java.util.Scanner;

/**
 *
 * @author Flávio
 */
public class Calculo_Circunferencia {
    
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        double raio,diametro,comprimento,area;
        
        //pedir ao usuário o valor do 'raio' da circunferência.
        System.out.print("Digite o raio da circunferência: ");
        raio=entrada.nextDouble();
        
        if(raio>0){                        //Se raio diferente de zero, prossiga.
            diametro=raio*2;                
            comprimento=diametro*3.14;
            area=3.14*(raio*raio);
            
            System.out.println("Esta circunferência possui: ");
            System.out.println("Diamentro: "+diametro);
            System.out.println("Comprimento: "+comprimento);
            System.out.println("Área: "+area);
        }
        else{
            System.out.print("Valor de raio invalido!");
        }
    }
    
}
