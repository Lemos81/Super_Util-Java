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
public class Variaveis_Numericas {
    
    public static void main(String[] args) {
        
        //Iremos mostrar como trabalhar com números inteiros e reais (decimais), 
        //além de fazer uma explicação sobre os tipos de dados (int, float e double, no caso).

        //O tipo 'int', por exemplo, armazena 32 bits, ou qualquer inteiro entre -2.147.483.648 e 2.147.483.647.
        //O tipo 'float', que armazena números decimais (quebrados, ou com vírgula) também armazenam 32 bits.
        //Já os 'long' armazenam 64 bits, assim como 'double' (que é um 'float' maior),
        //ou seja, qualquer número inteiro de -9.223.372.036.854.775.808L até 9.223.372.036.854.775.807L.
                
        /*  Dois detalhes importantes:
            1. Usamos vírgula em países da América não-inglesa e na Europa, mas para representar valores decimais, em computação, usamos o ponto '.' como separador, e não vírgula!
            2. Por padrão, o Java assume valores decimais como double. Pra especificar que é um 'float', coloque aquele 'f' ao final. Ou 'F'.
            Ao final do tipo 'long' coloque 'l' ou 'L'.*/
        
        
        int idade=21;           //declara a variavel "idade" e atribui o valor de "21".
        float valor=1.99f;      //declara a variavel "valor" e atribui o valor de "1.99".
        
        System.out.println("Idade: "+idade);
        System.out.println("Só possuo: R$ "+valor+" em minha carteira.");
        
    }    
}
