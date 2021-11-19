package TelasAlgoritmosDeAvaliacao;

import AlgoritOrd.OrdenacaoSelectionSortTipo1;
import GeraArray.GerarVetoresAleatorios;
import javax.swing.JOptionPane;

public class TelaDeExecucaoSelectionSortVersao1 extends TelaPadraoDeExecucao {

    public TelaDeExecucaoSelectionSortVersao1() {
        super("Algoritmos Ordenacao Selection Sort");
    }

    public void run() {
       try {

            int arrayOrdenavel[] = gerarArray();

            Thread executar = new OrdenacaoSelectionSortTipo1(arrayOrdenavel, areaParaImpressaoDoSistemaDeImpressaoDoAlgoritmoDeOrdenacao, Integer.parseInt(getTempoDelay().getValue().toString()));
            executar.start();

        } catch (NumberFormatException er) {
            JOptionPane.showMessageDialog(null, "Reinicie a janela e digite um numero valido");
        }
    }
}
