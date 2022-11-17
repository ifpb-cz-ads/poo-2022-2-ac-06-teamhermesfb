
/**
 * Chagas, Baruque & Baruque (2010): atividade prática 5 (pág. 100)
 * 
 * @author Hermes Feitoza Barros 
 * @version 12/11/2022
 */

public class DiasSemanaWDWF
{
   public static void main(String[] args){
       String dias[] = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta","Sábado", "Domingo"};
       System.out.println("\n-------------\nWhile:\n");
       int numDias=0;
       while(numDias<7){
           System.out.println(dias[numDias]);
           numDias++;
       }
       
       numDias=0;
       System.out.println("\n-------------\nDo while:\n");
       do {
           System.out.println(dias[numDias]);
           numDias++;
       } while(numDias<7);
       
       System.out.println("\n-------------\nFor:\n");
       for(numDias=0; numDias<7; numDias++){
           System.out.println(dias[numDias]);
       }
   }
}
