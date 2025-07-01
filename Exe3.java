
public class Exe3 {
public static void main(String [] args){

    int[] vetor = new int[10];
    int maior = 0;

    for (int i=0; i<10; i++){
        int numeroRandomico = (int) (Math.random() * 100);

        vetor[i] = numeroRandomico;
        System.out.print(+vetor[i]+"|");
    }

      int menor = vetor[0];

    for (int y=0; y<10; y++){

        if (vetor[y] > maior){
           maior = vetor[y];
        }
        if (vetor[y] < menor) {
            menor =  vetor[y];;
        }

}
        System.out.println("\nMaior numero: "+maior);
        System.out.println("Menor numero: "+menor);

}
}