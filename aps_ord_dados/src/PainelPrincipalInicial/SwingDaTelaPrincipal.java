package PainelPrincipalInicial;

import TelasAlgoritmosDeAvaliacao.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingDaTelaPrincipal extends JFrame {

    private PainelDosBotoesParaSwingPrincipal botoesDeAcionamento;
    private PainelDosLabelsParaSwingPrincipal labelsDeAcionamento;
    private JButton executarTodasThreadsAbertasJButton;
    private ArrayList<Thread> threadingsDeExecucao;

    public SwingDaTelaPrincipal() {

        super("Tela principal de Controle");
        setLayout(new BorderLayout());

        botoesDeAcionamento = new PainelDosBotoesParaSwingPrincipal();
        labelsDeAcionamento = new PainelDosLabelsParaSwingPrincipal();
        threadingsDeExecucao = new ArrayList<Thread>();

        executarTodasThreadsAbertasJButton = new JButton("Executar todas as opera��es abertas");

        add(botoesDeAcionamento, BorderLayout.WEST);
        add(labelsDeAcionamento, BorderLayout.EAST);
        add(executarTodasThreadsAbertasJButton, BorderLayout.SOUTH);

        botoesDeAcionamento.getBotaoAcionamento1().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    threadingsDeExecucao.add(new Thread(new TelaDeExecucaoBubbleSortVersao1()));
                } catch (Exception er) {
                    JOptionPane.showMessageDialog(null, "Erro ao adicionar nova thread a aplicacao");
                }
            }
        });

        botoesDeAcionamento.getBotaoAcionamentoInsertionSort().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    threadingsDeExecucao.add(new Thread(new TelaDeExecucaoInsertionSortVersao1()));
                } catch (Exception er) {
                    JOptionPane.showMessageDialog(null, "Erro ao adicionar nova thread a aplicacao");
                }
            }
        });

        botoesDeAcionamento.getBotaoAcionamentoSelectionSort().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    threadingsDeExecucao.add(new Thread(new TelaDeExecucaoSelectionSortVersao1()));
                } catch (Exception er) {
                    JOptionPane.showMessageDialog(null, "Erro ao adicionar nova thread a aplicacao");
                }
            }
        });

        botoesDeAcionamento.getBotaoAcionamentoMergeSort().addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try{
                    threadingsDeExecucao.add(new Thread(new TelaDeExecucaoMergeSort()));
                }catch(Exception er){
                    JOptionPane.showMessageDialog(null, "Erro ao adicionar nova thread a aplicacao");
                }
            }
        });

         botoesDeAcionamento.getBotaoAcionamentoQuickSort().addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try{
                    threadingsDeExecucao.add(new Thread(new TelaDeExecucaoQuickSort()));
                }catch(Exception er){
                    JOptionPane.showMessageDialog(null, "Erro ao adicionar nova thread a aplicacao");
                }
            }
        });

        executarTodasThreadsAbertasJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    for (Thread thread : threadingsDeExecucao) {
                        thread.start();
                    }
                    threadingsDeExecucao.clear();
                } catch (Exception er) {
                    threadingsDeExecucao.clear();
                }
            }
        });

        setSize(310, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
