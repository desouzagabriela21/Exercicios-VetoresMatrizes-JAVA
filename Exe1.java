import java.util.Scanner;

public class Exe1{
public static void main(String [] args){

    Scanner scanner = new Scanner(System.in);

    int [] valores = new int [6];

   for (int i=0; i<6; i++){
        System.out.print("Informe o "+(i+1)+" valor: ");
        valores[i] = scanner.nextInt();
    }
    for (int i=0; i<6; i++){
        System.out.print("Valor "+(i+1)+": "+valores[i]+" \n");
    }

    }
}