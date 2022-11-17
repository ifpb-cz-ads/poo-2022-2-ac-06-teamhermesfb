
/**
 * Chagas, Baruque & Baruque (2010): atividade prática 2 (pág. 93)
 * 
 * @author Hermes Feitoza Barros 
 * @version 12/11/2022
 */

public class ArraysAteCem
{
   public static void main(String[] args){
       int[] arrayCem = new int[100];
       int i, num=1;
       for(i=0; i<100; i++){
           arrayCem[i] = num++;
           System.out.println(arrayCem[i]);
       }
   }
}
