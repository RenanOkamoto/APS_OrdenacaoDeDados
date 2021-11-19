package PainelPrincipalInicial;

import java.awt.Font;
import javax.swing.JLabel;

public class PainelDosLabelsParaSwingPrincipal extends PainelContendoPadroesDeFormatacao {

    private JLabel abrirPainelDeAvaliacaoBubbleSortTipo1JLabel;
    private JLabel abrirPainelDeAvaliacaoInsertionSortJLabel;
    private JLabel abrirPainelDeAvaliacaoSelectionSortJLabel;
    private JLabel abrirPainelDeAvaliacaoMergeSortJLabel;
    private JLabel abrirPainelDeAvaliacaoQuickSortJLabel;
    private Font fonteDeFormatacaoDoTextoDosLabels;

    public PainelDosLabelsParaSwingPrincipal() {

        fonteDeFormatacaoDoTextoDosLabels = new Font("Sans Serif", Font.PLAIN, 20);

        abrirPainelDeAvaliacaoBubbleSortTipo1JLabel = new JLabel("Bubble Sort");
        abrirPainelDeAvaliacaoInsertionSortJLabel = new JLabel("Insertion Sort");
        abrirPainelDeAvaliacaoSelectionSortJLabel = new JLabel("Selection Sort");
        abrirPainelDeAvaliacaoMergeSortJLabel = new JLabel("Merge Sort");
        abrirPainelDeAvaliacaoQuickSortJLabel = new JLabel("Quick Sort");

        abrirPainelDeAvaliacaoBubbleSortTipo1JLabel.setFont(fonteDeFormatacaoDoTextoDosLabels);
        abrirPainelDeAvaliacaoInsertionSortJLabel.setFont(fonteDeFormatacaoDoTextoDosLabels);
        abrirPainelDeAvaliacaoSelectionSortJLabel.setFont(fonteDeFormatacaoDoTextoDosLabels);
        abrirPainelDeAvaliacaoMergeSortJLabel.setFont(fonteDeFormatacaoDoTextoDosLabels);
        abrirPainelDeAvaliacaoQuickSortJLabel.setFont(fonteDeFormatacaoDoTextoDosLabels);

        getBoxLayout().add(abrirPainelDeAvaliacaoBubbleSortTipo1JLabel);
        getBoxLayout().add(abrirPainelDeAvaliacaoInsertionSortJLabel);
        getBoxLayout().add(abrirPainelDeAvaliacaoSelectionSortJLabel);
        getBoxLayout().add(abrirPainelDeAvaliacaoMergeSortJLabel);
        getBoxLayout().add(abrirPainelDeAvaliacaoQuickSortJLabel);

        add(getBoxLayout());

    }
}
