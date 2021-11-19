package TelasAlgoritmosDeAvaliacao;

import AlgoritOrd.OrdenacaoQuickSort;
import GeraArray.GerarVetoresAleatorios;
import javax.swing.JOptionPane;

public class TelaDeExecucaoQuickSort  extends TelaPadraoDeExecucao {

    public TelaDeExecucaoQuickSort(){
        super("Algoritmo de ordenacao Quick Sort");
    }

    public void run() {
         try {

            int arrayOrdenavel[] = gerarArray();

            Thread executar = new OrdenacaoQuickSort(arrayOrdenavel, areaParaImpressaoDoSistemaDeImpressaoDoAlgoritmoDeOrdenacao, Integer.parseInt(getTempoDelay().getValue().toString()));
            executar.start();

        } catch (NumberFormatException er) {
            JOptionPane.showMessageDialog(null, "Reinicie a janela e digite um numero valido");
        }
    }

}
