package Ex2;

import java.util.Random;

public class Main {
	
	public static int [][] escalonamento = new int [20][2];

	public static void main(String[] args) {
		Random r = new Random();
		for (int i = 0; i < 20; i++) {
			escalonamento [i][0] = (r.nextInt(116)+4)*10;
			escalonamento [i][1] = i;
		}
		
		bubbleSort(escalonamento);
		
		ShowArray(escalonamento);
		
		for (int i = 0; i < 20; i++) {
			Process process = new Process(escalonamento[i][1],escalonamento[i][0]);	
			process.run();
		}
	}
	   private static void ShowArray(int[][] esc) {
		   for (int i = 0; i < 2; i++) {
			   for (int j = 0; j < 20; j++) {
				   System.out.print("|"+esc[j][i]+"| ");
			   }
			   System.out.println();
		   }
	}
	private static void bubbleSort(int vetor[][]){
           boolean troca = true;
           int aux;
           while (troca) {
               troca = false;
               for (int i = 0; i < vetor.length - 1; i++) {
                   if (vetor[i] [0]> vetor[i + 1][0]) {
                       
                	   aux = vetor[i][0];
                       vetor[i][0] = vetor[i + 1][0];
                       vetor[i + 1][0] = aux;
                       
                       aux = vetor[i][1];
                       vetor[i][1] = vetor[i + 1][1];
                       vetor[i + 1][1] = aux;
                       
                       troca = true;
                   }
               }
           }
	   }
}
   


