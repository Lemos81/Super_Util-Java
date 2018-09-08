/*
Um Funcionário de uma empresa recebe anualmente, aumento salarial. Sabe-se que:
1. Esse Funcionário foi contratado em 2005 com salário inicial de R$ 1.000,00;
2. Em 2006 ele recebeu aumento de 1.5% sobre seu salario inicial;
3. A partir de 2007, os aumentos salarias sempre correspondem ao dobro do percentual do ano anterior.
Faça um algoritmo que determine o salário atual deste funcionário.
 */
package Exemplos;
import java.util.Calendar;

/**
 *
 * @author Flávio
 */
public class Reajuste_Salarial {
    
    public static void main(String[] args) {
       
        float SIni = 1000,		
              RA1 = (float) 1.5,
              RAnual,
              Reaj,
              SAtual;
        int   AnoIni = 2005,
              AnoAt,
              QtdA;
              
        RAnual = ((SIni/100)*RA1+SIni);                     //Salario Inicia com reajuste de 1.5% após primeiro ano.
        
        Reaj=(RA1*2);                                       //Reajuste duplica a partir do segundo ano.
        
        Calendar calendario = Calendar.getInstance();       
        AnoAt=calendario.get(Calendar.YEAR);                //Define o ano atual.
        QtdA= AnoAt - AnoIni;                               //Calcula a quantidade de anos desde o inicio até o presente.
        
        SAtual=(Reaj*=Reaj+RAnual)*QtdA;                    //Calcula o salario atual, sendo que o reajuste duplicou a cada ano.
        
         
//	System.out.println ("O salário em 2006 era de R$" + RAnual);
	System.out.println ("O salário em "+AnoAt+" é de R$" + SAtual);
        
    }    
}
