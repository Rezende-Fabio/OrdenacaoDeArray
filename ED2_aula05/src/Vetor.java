import javax.swing.JOptionPane;

public class Vetor {
    private int vet [];

    Vetor(){
        int qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor: "));
        vet = new int[qtde];
    }

    public void preencheVetor(){
        for (int i = 0; i < vet.length; i++){
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+ (i+1) +" número"));
        }
    }

    public void imprimirVetor(){
        for (int i = 0; i < vet.length; i++){
            System.out.println(" " + vet[i]);
        }
    }

    public int[] getVet() {
        return vet;
    }

    

}