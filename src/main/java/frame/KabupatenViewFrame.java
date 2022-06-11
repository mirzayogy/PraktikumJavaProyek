package frame;

import javax.swing.*;

public class KabupatenViewFrame  extends  JFrame{
    private JPanel mainPanel;
    private JTextField cariTextField;
    private JButton cariButton;
    private JTable viewTable;
    private JButton tambahButton;
    private JButton ubahButton;
    private JButton hapusButton;
    private JButton batalButton;
    private JButton cetakButton;
    private JButton tutupButton;
    private JPanel cariPanel;
    private JPanel buttonPanel;
    private JScrollPane viewScrollPane;

    public KabupatenViewFrame(){
        init();
    }
    public void init(){
        setContentPane(mainPanel);
        setTitle("Data Kabupaten");
        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
