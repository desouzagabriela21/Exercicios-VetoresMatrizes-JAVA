
public class Exe2 {
public static void main(String [] args){

    int[] vetor = new int [10];
    int par = 0;
    int impar = 0; 

    for (int i=0; i<10; i++){
        int numeroRandomico = (int) (Math.random() * 100);
        vetor[i] = numeroRandomico;
        System.out.print(+vetor[i]+"|");
        if (vetor[i] % 2 == 0){
           par++;
        }
        else {
            impar++;
        }
    }
        System.out.println("\nQuantidade de numeros pares: "+par);
        System.out.println("Quantidade de numeros impares: "+impar);


    }
}