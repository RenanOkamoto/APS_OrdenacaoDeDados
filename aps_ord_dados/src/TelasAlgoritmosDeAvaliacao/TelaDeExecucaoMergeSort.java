package TelasAlgoritmosDeAvaliacao;

import AlgoritOrd.OrdenacaoMergeSort;
import GeraArray.GerarVetoresAleatorios;
import javax.swing.JOptionPane;

public class TelaDeExecucaoMergeSort extends TelaPadraoDeExecucao {

    public TelaDeExecucaoMergeSort() {
        super("Algortimo de Ordenacao Merge Sort");
    }

    public void run() {

        try {
            int arrayDesordenado[] = gerarArray();

            OrdenacaoMergeSort ordenar = new OrdenacaoMergeSort(arrayDesordenado, areaParaImpressaoDoSistemaDeImpressaoDoAlgoritmoDeOrdenacao, Integer.parseInt(getTempoDelay().getValue().toString()));
            ordenar.ordenar();

        } catch (NumberFormatException er) {
            JOptionPane.showMessageDialog(null, "Reinicie a janela e digite um numero valido");
        }

    }
}
