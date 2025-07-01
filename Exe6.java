import java.util.Scanner;

public class Exe6 {
public static void main(String [] args){

    Scanner scanner = new Scanner(System.in);

    int[] A = new int [10];
    int[] B = new int [10];
    int[] C = new int [10];

    /*for (int y = 0; y < 10; y++) {
    System.out.print("Digite o valor " + (y + 1) + " para o vetor A: ");
     A[y] = scanner.nextInt();
    }

    for (int y = 0; y < 10; y++) {
    System.out.print("Digite o valor " + (y + 1) + " para o vetor B: ");
    B[y] = scanner.nextInt();
    }*/
    
    for (int i =0; i < 10; i++){
        A[i] = (int)(Math.random() * 101);
        B[i] = (int)(Math.random() * 101);
        C[i] = A[i] - B[i];
    }

    System.out.println("A\t\tB\t\tC");
    for (int i = 0; i < 10; i++) {
    System.out.println(A[i]+"\t\t"+B[i]+"\t\t"+C[i]);
    }

}
}