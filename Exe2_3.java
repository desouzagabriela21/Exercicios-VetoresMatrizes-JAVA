public class Exe2_3 {
public static void main(String [] args){

  int [][]original =  new int [4][4];
 

  for (int i=0; i<4; i++){
    for (int y = 0; y < 4; y++) {
    original[i][y] = (int)(Math.random() * 101);
    }
  }

  for (int i=0; i<4; i++){
   for (int y = 0; y < 4; y++) {
    System.out.print("\t"+original[i][y]);
   }
    System.out.println(" ");
  }


  System.out.println("Diagonal principal: ");
  for (int i=0; i<4; i++){
    for(int y=0; y<4; y++){
      if (i == y){
      System.out.print("\t"+original[i][y]);
       }
     }
   }

  System.out.println("\nDiagonal secundaria: ");
  for (int i=0; i<4; i++){
    int y = 4 - 1 - i;
    System.out.print("\t"+original[i][y]);
  }

  System.out.println("\nMatriz transposta: ");

  int[][]transposta = new int[4][4];

  for (int i=0; i < 4; i++){
    for (int y=0; y < 4; y++){
      transposta[y][i] = original[i][y];
    }
  }

  for (int i=0; i<4; i++){
    for(int y=0; y<4; y++){
     System.out.print("\t"+transposta[i][y]);
    }
    System.out.println(" ");
  }

}
}