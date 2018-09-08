/*
Faça um programa para uma loja de tintas. 
O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. 
Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados 
e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
Informe ao usuário a quantidade de latas de tinta a serem compradas e o preço total.
 */
package Exemplos;
import java.util.Scanner;

/**
 *
 * @author Flávio
 */
public class Calculo_Pintura {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        float NMet,			// Número da Metragem digitada pelo usuário.
              Consumo,			
              NLat,			// Número de lata que serão necessárias.
              VLat = 80,		// Valor de cada lata.
              QtdLat,			// Quantidade de latas.
              VTot;			// Valor total a ser pago.
	
	System.out.println ("Digite a metragem a ser pintada:");
	NMet = leitor.nextFloat();
                
        Consumo = (NMet/3);		// 1 litro equivale a 3 metros quadrados. O consumo de litros é calculado pela metragem a ser pintada dividido por 3.
	QtdLat = (Consumo/18);		// A lata equivale a 18 litros, então o consumo de tinta será calculado pelo "Consumo" dividido por 18.
	
	if (QtdLat <= 1) {              // Se "QtdLat" for menor ou igual à 1.
            NLat = 1;                   // então "NLat" é igual à 1.
	} 				
	else {                          // agora se "QtdLat" for maior que 1.
            NLat = (QtdLat*1);          // então "NLat" será igual ao valor de "QtdLat" vezes 1.
	}				
		
	VTot = (VLat*NLat);		// O valor total a ser pago será o  resultade de "VLat" vezes "NLat".

	if (NLat <= 1){	
            System.out.printf("Para pintar %.2f metros quadrados, você precisará de %.2f lata de tinta de 18 litros, e o valor total de seu pedido é de: R$ %.2f\n",NMet,NLat,VTot);
	}
        else {	
            System.out.printf("Para pintar %.2f metros quadrados, você precisará de %.2f latas de tinta de 18 litros, e o valor total de seu pedido é de: R$ %.2f\n",NMet,NLat,VTot);
        }
    }    
}
