
import java.util.Scanner;

public class Exe2_4 {
public static void main(String [] args){

  String[][] matriz  = new String [4][4];


  for (int i=0; i<4; i++){
    for (int y = 0; y < 4; y++) {
    matriz[i][y] = "*";
    }
  }

  System.out.println("Figura A");

  //Matriz
  for (int i=0; i<4; i++){
   for (int y = 0; y < 4; y++) {
    System.out.print("\t"+matriz[i][y]);
   }
    System.out.println(" ");
  }

  System.out.println("Figura B");

  //Bordas
  for (int i=0; i<4; i++){
   for (int y = 0; y < 4; y++) {
    if(i==0 || i == 3 || y==0 || y==3)
    System.out.print("\t"+matriz[i][y]);
    else{
    System.out.print("\t");
    }
   }
    System.out.println(" ");
  }

  System.out.println("Figura C");

  //triangulo inferior
  for (int i=0; i<4; i++){
   for (int y = 0; y <= i; y++) {
    System.out.print("\t"+matriz[i][y]);
   }
    System.out.println(" ");
  }

}
}