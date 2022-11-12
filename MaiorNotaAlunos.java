import java.util.Random;

/**
 * Carvalho & Teixeira (2011): questão 3 (pág. 34)
 * 
 * @author Hermes Feitoza Barros 
 * @version 12/11/2022
 */

public class MaiorNotasAlunos
{
   public static void main(String[] args){
       int[] notasAlunos = new int[10];
       int i, somaNotas=0, media;
       Random random = new Random();
       
       for(i=0; i<10; i++){
           int numero = random.nextInt(100);
           notasAlunos[i] = numero;
           //System.out.println(notasAlunos[i]);
           somaNotas = somaNotas+notasAlunos[i];
       }
       media = somaNotas/10;
       //System.out.println(somaNotas);
       System.out.println("Média das notas: "+ media);
       
       int acimaMedia=0, abaixoMedia=0;
       for(i=0; i<10; i++){
           if(notasAlunos[i] >= media){
               acimaMedia++;
           } else {
               abaixoMedia++;
           }
       }
       System.out.println("------------------\nNotas acima da Média: "+ acimaMedia);
       System.out.println("------------------\nNotas abaixo da Média: "+ abaixoMedia);
    }
}
