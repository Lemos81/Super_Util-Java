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
public class Exercicios_Print {
    
    public static void main(String[] args) {
        
        //Exercícios de Saída Simples.
        FrasenaTela();          //Exercício 1.
        Etiqueta();             //Exercício 2.
        Frases_Assassinas();    //Exercício 3.
        Mensagem();             //Exercício 4.
        Ao_Mestre();            //Exercício 5.
        Quadrado();             //Exercício 6.
        Tabela_de_Notas();      //Exercício 7.
        LetraGrande();          //Exercício 8.
        Menu();                 //Exercício 9.
        Pinheiro();             //Exercício 10.
                
    }
    
    //As seguintes questões foram extraídas do material '300 ideias para Programar', de Virgílio Vasconcelos Vilela 10 questões pra você resolver, sobre saída.
    //Use print, println, printf...use a criatividade.
        
    //1. FrasenaTela - Implemente um programa que escreve na tela a frase "O primeiro programa a gente nunca esquece!".
        
    public static void FrasenaTela(){
            
        System.out.println("O primeiro programa a gente nunca esquece!\n");
    
    }
        
    //2. Etiqueta - Elabore um programa que escreve seu nome completo na primeira linha, seu endereço na segunda, e o CEP e telefone na terceira.
        
    public static void Etiqueta(){
            
        System.out.print("Flávio de Lemos Santos\n");
        System.out.print("Praia Grande - São Paulo - Brasil\n");
        System.out.println("Cep: 11.704-090 - Telefone: (13) 99138-3646\n");
        
    }
        
    //3. Frases_Assassinas - Faça um programa que mostre na tela algumas frases assassinas, que são aquelas que fazem com muitas idéias sejam perdidas antes que amadureçam ou seja aprofundadas.
    /*Eis alguns exemplos (bole também os seus):
        "Isto não vai dar certo"
        "Você nunca vai conseguir"
        "Você vai se estrepar"
        "Não vai dar em nada"
        "Está tudo errado!"*/
        
    public static void Frases_Assassinas(){
        
        System.out.print("Você não é capaz!\n");
        System.out.print("Isto não está correto!\n");
        System.out.println("Faça novamente pois este não serve.\n");
        
    }
        
    //4. Mensagem - Escreva uma mensagem para uma pessoa de que goste. Implemente um programa que imprima essa mensagem.
        
    public static void Mensagem(){
        
        System.out.println("Sinto sua falta!\n");
        
    }
        
    //5. Ao_Mestre - Escreva um bilhete ao seu professor, informando seus objetivos nesta disciplina e o que espera dela e do professor. Implemente um programa que mostra seu bilhete na tela.
        
    public static void Ao_Mestre(){
            
        System.out.print("Recordar e obter novos conhecimentos sobre a linguagem java.\n");
        System.out.println("Aprimorar meu conhecimento desta linguagem de programação.\n");
        
    }
        
    //6. Quadrado - Escrever um programa que mostre a seguinte figura no alto da tela:
        /*
                XXXXX
                X   X
                X   X
                X   X
                XXXXX
        */
        
    public static void Quadrado(){
        
        System.out.println("XXXXX");
        System.out.println("X   X");
        System.out.println("X   X");
        System.out.println("X   X");
        System.out.println("XXXXX\n");       
        
    }
        
    //7. Tabela_de_notas - Escreva um programa que produza a seguinte saída na tela:
        /*  ALUNO(A)          NOTA
            =========         =====
            ALINE              9.0  
            MÁRIO              DEZ
            SÉRGIO             4.5    
            SHIRLEY            7.0*/
        
    public static void Tabela_de_Notas(){
            
        System.out.println("ALUNO(A)        NOTA");
        System.out.println("========        =====");
        System.out.println("ALINE            9.0");
        System.out.println("MÁRIO           10.0");
        System.out.println("SÉRGIO           4.5");
        System.out.println("SHIRLEY          7.0\n");
        
    }
        
    //8. LetraGrande - Elabore um programa para produzir na tela a letra J, de Java Progressivo, usando a própria. 
    /*   Se fosse ‘L’, seria assim:
                L
                L
                L
                LLLLL   */
        
    public static void LetraGrande(){
        
        System.out.println("JJJJJJJ");
        System.out.println("    J");
        System.out.println("    J");
        System.out.println("J   J");
        System.out.println("JJJJJ\n");
        
    }
        
    //9. Menu - Elabore um programa que mostre o seguinte menu na tela:
    /*Cadastro de Clientes
        0 - Fim
        1 - Inclui
        2 - Altera
        3 - Exclui
        4 - Consulta
        Opção: */
    
    public static void Menu(){
        
        System.out.println("Cadastro de Clientes\n");
        System.out.println("0 - Fim");
        System.out.println("1 - Incluir");
        System.out.println("2 - Altera");
        System.out.println("3 - Exclui");
        System.out.println("4 - Consulta");
        System.out.println("Opção:\n");
        
    }
               
    //10. Pinheiro - Implemente um programa que desenhe um "pinheiro" na tela, similar ao abaixo.
    /* Enriqueça o desenho com outros caracteres, simulando enfeites.
                   X
                  XXX
                 XXXXX
                XXXXXXX
               XXXXXXXXX
              XXXXXXXXXXX
             XXXXXXXXXXXXX
            XXXXXXXXXXXXXXX
                   XX
                   XX
                  XXXX      */
        
    public static void Pinheiro(){
        
        System.out.println("        A");
        System.out.println("       XXX");
        System.out.println("      XXXXX");
        System.out.println("     XXXXXXX");
        System.out.println("    XXXXXXXXX");
        System.out.println("   XXXXXcXXXXX");
        System.out.println("  XXXjXXXXXXkXX");
        System.out.println(" XXXXXXXXXXXXXXX");
        System.out.println("        XX");
        System.out.println("        XX");
        System.out.println("       XXXX\n");
    
    }    
}
