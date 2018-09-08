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
public class Variavel_Tipo_Char {
    
    public static void main(String[] args) {
        
//        char letra_J=74, letra_P=80;
        
//        System.out.printf("%c %c\n",letra_J,letra_P);
        
        //Agora de uma outra forma, vamos imprimir "Java Progressivo":
        
/*        int num_J=74;
        char letra_J=(char)num_J;
        char letra_P=80;
        char letra_i='i';
        
        System.out.printf("%c%c%c%c %c%c%c%c%c%c%c%c%c%c%c\n",letra_J,97,118,97,letra_P,'r',111,103,114,101,'s','s',letra_i,118,111);
*/
        //Agora vamos receber apenas um caractere do usuário:
        
        Scanner entrada=new Scanner(System.in);
        char caractere;
        
        System.out.print("Digite uma letra: ");
        caractere=entrada.nextLine().charAt(0);
        
        System.out.printf("\nA letra informada foi: %c\n",caractere);
                
    }    
}
