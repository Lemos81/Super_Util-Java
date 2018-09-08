/*
Receba o número de horas trabalhadas por uma pessoa e o valor do salário mínimo e mostre o salário a receber baseado nas seguintes regras:
1. A hora trabalhada equivale a 10% do salário mínimo informado;
2. O salário Bruto é dado pelo número de horas trabalhadas multiplicado pelo valor de cada hora;
3. O imposto pago é de 3%;
4. O salário a receber é equivalente ao salário bruto subtraído do imposto.
 */
package Exemplos;
import java.util.Scanner;

/**
 *
 * @author Flávio
 */
public class Venc_Salarial {
    
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner (System.in);
	float NHoras;				// Número de Horas trabalhadas.
	float VHoras;				// Valor da Hora Trabalhada.
	float VSal;				// Valor do Salário mínimo.
	float SalBr;				// Valor do Salário Bruto.
	float VImp;				// Valor do Imposto.
	float VSalRec;				// Valor do Salário à Receber.

	System.out.println ("Digite as horas trabalhadas:");
	NHoras = entrada.nextFloat ();		
	System.out.println ("Digite o valor do salário mínimo:");
	VSal = entrada.nextFloat ();      

	if ((NHoras !=0) && (VSal !=0)){
            
            VHoras = (VSal/100)*10;		// A Hora trabalhada equivale a 10% do salário mínimo.
            SalBr = (VHoras*NHoras);            // O Salario Bruto é igual ao valor das horas vezes o número de horas.
            VImp = (SalBr/100)*3;		// O valor do imposto é igual à 3% do salário bruto.
            VSalRec = (SalBr-VImp);		// O valor a receber é o salário bruto menos o valor do imposto.

            System.out.println("O salário a receber e de: R$" + VSalRec);
                
        }
	else {
            System.out.println("Digite o número de horas trabalhadas e o valor do salário minimo!");
        }
    }    
}
