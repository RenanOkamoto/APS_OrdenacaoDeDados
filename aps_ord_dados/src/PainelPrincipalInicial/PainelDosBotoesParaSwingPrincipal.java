package PainelPrincipalInicial;

import javax.swing.JButton;

public class PainelDosBotoesParaSwingPrincipal extends PainelContendoPadroesDeFormatacao {

    private JButton botaoAcionamentoInterfaceBubbleSort1;
    private JButton botaoAcionamentoInterfaceInsertionSort;
    private JButton botaoAcionamentoInterfaceSelectionSort;
    private JButton botaoAcionamentoInterfaceMergeSort;
    private JButton botaoAcionamentoInterfaceQuickSort;

    public PainelDosBotoesParaSwingPrincipal() {

        botaoAcionamentoInterfaceBubbleSort1 = new JButton("Abrir Bubble Sort      ");
        botaoAcionamentoInterfaceInsertionSort = new JButton("Abrir Insertion Sort  ");
        botaoAcionamentoInterfaceSelectionSort = new JButton("Abrir Selection Sort ");
        botaoAcionamentoInterfaceMergeSort = new JButton("Abrir Merge Sort       ");
        botaoAcionamentoInterfaceQuickSort = new JButton("Abrir Quick Sort        ");

        getBoxLayout().add(botaoAcionamentoInterfaceBubbleSort1);
        getBoxLayout().add(botaoAcionamentoInterfaceInsertionSort);
        getBoxLayout().add(botaoAcionamentoInterfaceSelectionSort);
        getBoxLayout().add(botaoAcionamentoInterfaceMergeSort);
        getBoxLayout().add(botaoAcionamentoInterfaceQuickSort);

        add(getBoxLayout());

    }

    protected JButton getBotaoAcionamento1() {
        return this.botaoAcionamentoInterfaceBubbleSort1;
    }

    protected JButton getBotaoAcionamentoInsertionSort() {
        return this.botaoAcionamentoInterfaceInsertionSort;
    }

    protected JButton getBotaoAcionamentoSelectionSort() {
        return this.botaoAcionamentoInterfaceSelectionSort;
    }

    protected JButton getBotaoAcionamentoMergeSort(){
        return this.botaoAcionamentoInterfaceMergeSort;
    }

    protected JButton getBotaoAcionamentoQuickSort(){
        return this.botaoAcionamentoInterfaceQuickSort;
    }
}
