package TelasAlgoritmosDeAvaliacao;

import AlgoritOrd.OrdenacaoInsertionSortTipo1;
import GeraArray.GerarVetoresAleatorios;
import javax.swing.JOptionPane;

public class TelaDeExecucaoInsertionSortVersao1 extends TelaPadraoDeExecucao {

    public TelaDeExecucaoInsertionSortVersao1() {
        super("Ordenacao Algoritmo Insertion Sort");
    }

    public void run() {
        try {

            int arrayOrdenavel[] = gerarArray();

            Thread executar = new OrdenacaoInsertionSortTipo1(arrayOrdenavel, areaParaImpressaoDoSistemaDeImpressaoDoAlgoritmoDeOrdenacao, Integer.parseInt(getTempoDelay().getValue().toString()));
            executar.start();

        } catch (NumberFormatException er) {
            JOptionPane.showMessageDialog(null, "Reinicie a janela e digite um numero valido");
        }
    }
}
