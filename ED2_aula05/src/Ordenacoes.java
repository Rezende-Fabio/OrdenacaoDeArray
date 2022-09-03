public class Ordenacoes {
    private int posiMenor;
    private int aux;

    public void selectionSort(int vet[]){
        for (int i=0; i < vet.length; i++) {
            posiMenor = i;
            for (int j=i; j < vet.length; j++) {
                if (vet[j] <= vet[posiMenor]){
                    posiMenor = j;
                } 
            }

            aux = vet[i];
            vet[i] = vet[posiMenor];
            vet[posiMenor] = aux;
            
        }
    }

    public void bubbleSort(int vet[]){
        for (int i = 0 ; i < vet.length; i++){
            for (int j = 0 ; j < vet.length - 1; j++){
                if (vet[j] > vet[j + 1]){
                    int aux = vet[j + 1];
                    vet[j + 1] = vet[j];
                    vet[j] = aux;
                }
            }
        }
    }

}
