
import java.util.Scanner;

public class Exe2_1{
public static void main(String [] args){

    int[][]valores = new int [5][5];
    int somaImpar = 0;
    int somaLinhas = 0; 
    int somaColuna = 0; 

    Scanner scanner = new Scanner(System.in);

    for (int i=0; i<5; i++){
      System.out.print("Linha: "+(i+1)+": ");
     for (int y = 0; y < 5; y++) {
     valores[i][y] = (int)(Math.random() * 11);
     somaLinhas += valores[i][y];
      if (valores[i][y] % 2 != 0 ){
      somaImpar += valores[i][y];
      }
     System.out.print(valores[i][y]+"|");
     }
      System.out.println("\nSoma da linha "+(i+1)+": "+somaLinhas);
      somaLinhas = 0;
    }

    for (int y = 0; y < 5; y++){ 
    System.out.print("Soma da coluna "+(y+1)+": ");
     for (int i=0; i<5; i++){ 
     somaColuna += valores[i][y];
     }
     System.out.println(somaColuna);
     somaColuna = 0;

    }

    System.out.println("Soma de todos os numeros impares: "+somaImpar);



}
}


     