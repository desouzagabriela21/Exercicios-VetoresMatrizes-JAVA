
import java.util.Scanner;

public class Exe7 {
public static void main(String [] args){

    int[] valores = new int [6];
    int par = 0;
    int impar = 0; 
    int somaPar = 0;
    int somaImpar = 0;

    Scanner scanner = new Scanner(System.in);

    for (int i=0; i<6; i++){
    System.out.print("Informe o "+(i+1)+" valor: ");
    valores[i] = scanner.nextInt();
        
     if (valores[i] % 2 == 0){
        par++;
        somaPar = somaPar + valores[i];
     }
     else {
        impar++;
        somaImpar = somaImpar + valores[i];
     }
    }
    
    System.out.println("\nQuantidade de numeros pares: "+par);
    System.out.println("Soma dos numeros pares: "+somaPar);
    System.out.println("Quantidade de numeros impares: "+impar);  
    System.out.println("Soma dos numeros impares: "+somaImpar); 

}
}