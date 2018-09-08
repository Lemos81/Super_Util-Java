/*
Crie um programa que receba a altura e o peso do usuário, 
e diga seu IMC (Índice de Massa Corporal), dado pela fórmula:
IMC = peso(em quilos) / altura² (em metros)
 */
package Exemplos;
import java.util.Scanner;

/**
 *
 * @author Flávio
 */
public class Indice_Massa_Corporal {
    
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        float peso,altura,imc;
        
        System.out.print("Digite seu peso: ");
        peso=entrada.nextFloat();                   //recebe a informação do peso digitada pelo usuário.
        
        System.out.print("Digite sua altura: ");
        altura=entrada.nextFloat();                 //recebe a informação da altura digitada elo usuário.
        
        imc=peso/(altura*altura);                   //Calculo do IMC.
        
        System.out.printf("\nO seu índice de massa corporal é de: %.3f\n",imc);
        
    }    
}
