
/**
 * Chagas, Baruque & Baruque (2010): atividade prática 4 (pág. 97)
 * 
 * @author Hermes Feitoza Barros 
 * @version 12/11/2022
 */

public class ArraysErro
{
   public static void main(String[] args){
       int[] arrayCem = new int[100];
       int i;
       for(i=1; i<=100; i++){
           arrayCem[i] = i;
           System.out.println(arrayCem[i]);
       }
   }
}
