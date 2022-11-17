import java.util.Scanner;

/**
 * Chagas, Baruque & Baruque (2010): atividade prática 6 (pág. 100)
 * 
 * @author Hermes Feitoza Barros 
 * @version 12/11/2022
 */

public class MaiorDezNumeros
{
   public static void main(String[] args){
       int[] arrayDez = new int[10];
       int i;
       for(i=0; i<10; i++){
           Scanner scan = new Scanner(System.in);
           int num = scan.nextInt();
           arrayDez[i] = num;
       }
       int maiorNumero=0;
       for(i=0; i<10; i++){
           System.out.println(arrayDez[i]);
           if(i>=1 && arrayDez[i] > arrayDez[maiorNumero]){
               maiorNumero=i;
           }
       }
       System.out.println("Maior numero: " + arrayDez[maiorNumero]);
    }
}
