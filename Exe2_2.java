
import java.util.Scanner;

public class Exe2_2 {
public static void main(String [] args){

    int[][]matriz = new int [3][5];
    int[] todosValores = new int [15];
    int impar = 0; 
    int par = 0; 
    int valorRepetido = 0; 
    int z = 0;

    Scanner scanner = new Scanner(System.in);

    for (int i=0; i<3; i++){
     for (int y = 0; y < 5; y++) {
     matriz[i][y] = (int)(Math.random() * 101);
     todosValores[z] = matriz[i][y];
     z++;
     if (matriz[i][y] % 2 == 0){
        par++;
     }
      else {
        impar++;
      }      
     }
   }

    for (int i=0; i<3; i++){
     for (int y = 0; y < 5; y++) {
    System.out.print("\t"+matriz[i][y]);
     }
    System.out.printf(" \n");
    }
   
    for (int i = 0; i < 15; i++){
     for (int y = i + 1; y < 15; y++){
      if (todosValores[i] == todosValores[y]){
       valorRepetido++;
      }
     }
    }

    if (valorRepetido > 0){
    System.out.println("Existem valores repetidos");
    }
    else{
    System.out.println("Nao existem valores repetidos");
    }

    System.out.println("Quantidade de numeros impares: "+impar);
    System.out.println("Quantidade de numeros pares: "+par);

}
}
