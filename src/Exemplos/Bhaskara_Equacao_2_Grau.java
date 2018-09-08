/*
Crie um programa, em Java, que receba os coeficientes de uma equação do 2o grau e retorne suas raízes.
Uma equação do segundo grau é uma equação onde:
ax² + bx + c = 0 , com 'a' diferente de 0
delta=b²-4ac  (Raiz quadrada de delta: sqrtdelta=(float)Math.sqrt(delta);

Passo 1:
A primeira parte do programa recebe os três coeficientes da equação, 
que são 'a', 'b' e 'c' e serão representados pelo tipo float.

Passo 2:
Uma equação do 2o grau só é válida se 'a' for diferente de 0, 
então, se for igual a 0 o programa deverá terminar.
Ou seja, nosso programa irá acontece dentro do 'if' que checa que 'a' é diferente de 0.

Passo 3:
Determinando o valor de delta: delta = b² - 4ac
Determinando a raiz quadrada de delta: sqrtdelta = (float)Math.sqrt(delta);

Onde sqrt significa 'square root', ou raiz quadrada, em inglês.
Em Java, calculamos a raiz quadrada do número x com o método: Math.sqrt(x);
Esse método retorna um tipo 'double'. 
Como usamos float em nossos coeficientes, usamos o cast '(float)' para transformar o double em float.

Passo 4:
Se delta for maior ou igual a zero, as raízes são dadas por:
raiz1 = (-b + sqrtdelta) / 2a
raiz2 = (-b - sqrtdelta) / 2a

Passo 5:
Se delta for menor que zero, suas raízes serão complexas e as raízes serão da forma:
raiz1 = (-b + i.sqrt(-delta) )/2a
raiz2 = (-b - i.sqrt(-delta) )/2a

Formatei a saída da seguinte forma, para ficar mais legível, que é a mesma coisa das equações anteriores:
raiz1 = (-b)/2a + i.sqrt(-delta)/2a
raiz2 = (-b)/2a - i.sqrt(-delta)/2a
 */
package Exemplos;
import java.util.Scanner;

/**
 *
 * @author Flávio
 */
public class Bhaskara_Equacao_2_Grau {
    
    public static void main(String[] args){
        
        Scanner entrada=new Scanner(System.in);
        float a,b,c,                //Coeficientes.
              delta,                //Delta.
              sqrtdelta,            //Raiz quadrada de delta.
              raiz1,raiz2;          //Raizes.
        
        //Recebendo coeficientes do usuário.
        System.out.print("Equação de 2.º Grau: ax²+bx+cx=0\n");
        System.out.print("Entre com o valor de a: ");           //Passo 1.
        a=entrada.nextFloat();
        System.out.print("Entre com o valor de b: ");
        b=entrada.nextFloat();
        System.out.print("Entre com o valor de c: ");
        c=entrada.nextFloat();
        
        if (a!=0){                                  //Passo 2. Verificar se "a" é diferente de zero.
            delta=(b*b)-(4*a*c);                    //Passo 3. Calcula a raiz quadrade de delta.
            sqrtdelta=(float)Math.sqrt(delta);      //transforma 'double' em 'float'.
            
            if (delta>=0){                          //Passo 4. Se a raiz de delta for maior que 0, as raízes são reais.
                raiz1=((-1)*b+sqrtdelta)/(2*a);
                raiz2=((-1)*b+sqrtdelta)/(2*a);
                System.out.printf("\nRaizes: %.2f e %.2f",raiz1,raiz2);
            }
            else {                                  //Passo 5.  se delta for menor que 0, as raízes serão complexas.
                delta=-delta;
                sqrtdelta=(float)Math.sqrt(delta);
                System.out.printf("\nRaiz 1: %.2f+i.%.2f\n",(-b)/(2*a),(sqrtdelta)/(2*a));
                System.out.printf("Raiz 2: %.2f+i.%.2f\n",(-b)/(2*a),(sqrtdelta)/(2*a));
            }
        }
        else{                                       //Passo 2. Caso 'a' seja igual a zero.
            System.out.print("Coeficiente 'a' inválido. Não é uma equação de 2.º grau");
        }
    }
}
