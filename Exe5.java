import java.util.Scanner;

public class Exe5 {
public static void main(String [] args){

    Scanner scanner = new Scanner(System.in);

    double[] notas = new double [15];
    double soma = 0;
    double media = 0; 

    for (int y = 0; y < 15; y++) {
     System.out.print("Digite a nota " + (y + 1) + ": ");
     notas[y] = scanner.nextDouble();
     soma += notas[y];
    }

    media = soma / 15;
    System.out.print("Media: "+media);
}
}