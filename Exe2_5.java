import java.util.Scanner;

public class Exe2_5 {
public static void main(String [] args){

Scanner scanner = new Scanner(System.in);

int[][] matriz  = new int [3][3];
int somaColuna = 0;
int somaLinha = 0;
int somaDiagonalPrincipal = 0;
int somaDiagonalSecundaria = 0;
int somaReferencia = 0;
boolean verifica = false;

  //Matriz
  for (int i=0; i<3; i++){
    for (int y = 0; y < 3; y++) {
    matriz[i][y] = (int)(Math.random()*31);
    }
  }
  for (int i=0; i<3; i++){
   for (int y = 0; y < 3; y++) {
    System.out.print("\t"+matriz[i][y]);
   }
    System.out.println(" ");
  }

/*for (int i=0; i<3; i++){
  for (int y = 0; y < 3; y++) {
   System.out.print("Linha "+(i+1)+", numero "+(y+1)+": ");
   matriz[i][y] = scanner.nextInt();
  }
}*/


somaReferencia = matriz[0][0]+matriz[0][1]+matriz[0][2];

for (int i=0; i<3; i++){
  for (int y = 0; y < 3; y++) {
   somaLinha += matriz[i][y];
  }

  if (somaReferencia != somaLinha){
    verifica = false;
    break;
  }
  else {
    verifica = true;
  }
  somaLinha = 0;
}

if (verifica = false){
  System.out.println("Nao e magico");
  System.exit(0);
}

for (int i = 0; i < 3; i++){  
 for (int y = 0; y < 3; y++){  
   somaColuna += matriz[i][y];
  }
  if (somaColuna != somaReferencia){
    System.out.println("Nao e magico");
    verifica = false;
  System.exit(0);
  }
  else {
    verifica = true;
  }
  somaColuna = 0;
}

if (verifica = false){
  System.out.println("Nao e magico");
  System.exit(0);}

for (int i=0; i<3; i++){
  for(int y=0; y<3; y++){
    if (i == y){
    somaDiagonalPrincipal += matriz[i][y];
  
     if (somaReferencia != somaDiagonalPrincipal){
     verifica = false;
     break;
     }
     else {
     verifica = true;
     }
     }
    }
 }

if (verifica = false){
  System.out.println("Nao e magico");
  System.exit(0);
}

for (int i=0; i<3; i++){
  int y = 3 - 1 - i;
  somaDiagonalSecundaria += matriz[i][y];
  if (somaReferencia != somaDiagonalSecundaria){
  verifica = false;
  break;
  }
  else {
  verifica = true;
  }
 }

if (verifica = false){
  System.out.println("Nao e magico");
  System.exit(0);
}
if (verifica = true){
  System.out.println("E magico");

}

}
}
