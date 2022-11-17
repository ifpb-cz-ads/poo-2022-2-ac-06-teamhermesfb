
/**
 * Chagas, Baruque & Baruque (2010): atividade prática 3 (pág. 93)
 * 
 * @author Hermes Feitoza Barros 
 * @version 12/11/2022
 */

public class ArraysCemLenght
{
   public static void main(String[] args){
       int[] arrayCem = new int[100];
       int i;
       for(i=0; i<arrayCem.length; i++){
           arrayCem[i] = i;
           System.out.println(arrayCem[i]);
       }
   }
}
