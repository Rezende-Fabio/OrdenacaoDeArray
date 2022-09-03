public class Main {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor();

        vetor.preencheVetor();
        vetor.imprimirVetor();
        System.out.println("Ordenado\n");

        Ordenacoes ss = new Ordenacoes();
        
        ss.selectionSort(vetor.getVet());

        vetor.imprimirVetor();
    }
}
