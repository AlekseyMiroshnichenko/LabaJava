package Laboratorna2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class MyFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setMinimumSize(new Dimension(500,500));
        frame.setPreferredSize(new Dimension(500, 500));
        frame.setLayout(new GridLayout(1,2));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //A3,B2
        final DefaultListModel dlm = new DefaultListModel();
        dlm.setSize(2);
        dlm.set(0, "A*A*A");
        dlm.set(1,"B*B");

        final JLabel labelA3B2 = new JLabel("(A*A*A)*(B*B)");
        //Components
        JList list1 = new JList(dlm);
        final JTextField textFieldA = new JTextField();
        final JTextField textFieldB = new JTextField();
        JButton button1 = new JButton("Підрахувати");
        JPanel panel1 = new JPanel();
        JComboBox comboBox1 = new JComboBox();
        JTable table1 = new JTable();
        JTextPane textPane1 = new JTextPane();
        //----------------------------------------------------

        JPanel panelLeft = new JPanel(new BorderLayout());
        JPanel panelRight = new JPanel(new GridLayout(2,1));
        frame.add(panelLeft);
        frame.add(panelRight);

        //Add components into the Left part of Frame
        JPanel panelLN = new JPanel();
        JPanel panelLC = new JPanel(new GridLayout(1,2));
        JPanel panelLS = new JPanel();

        panelLN.setPreferredSize(new Dimension((int)(frame.getWidth()*0.5),(int)(frame.getHeight()*0.25)));
        panelLS.setPreferredSize(new Dimension((int)(frame.getWidth()*0.5),(int)(frame.getHeight()*0.25)));
        panelLC.setPreferredSize(new Dimension((int)(frame.getWidth()*0.5),(int)(frame.getHeight()*0.5)));

        panelLeft.add(panelLN, BorderLayout.NORTH);
        panelLeft.add(panelLC, BorderLayout.CENTER);
        panelLeft.add(panelLS, BorderLayout.SOUTH);

        panelLN.add(list1);
        panelLC.add(textFieldA);
        panelLC.add(textFieldB);
        panelLS.add(button1);

        list1.setBackground(new Color(0xFFD716));
        textFieldA.setBackground(new Color(0xB9D594));
        textFieldB.setBackground(new Color(0xD5C1AC));
        button1.setBackground(new Color(0xC2E3FF));

        //Add components into the Left part of Frame
        JPanel panelRB = new JPanel(new GridLayout(1,3));
        panelRB.add(comboBox1);
        panelRB.add(table1);
        panelRB.add(textPane1);

        panel1.add(labelA3B2);
        panelRight.add(panel1);
        panelRight.add(panelRB);

        comboBox1.setBackground(new Color(0x2EC5C2));
        table1.setBackground(new Color(0xFF518F));
        textPane1.setBackground(new Color(0xDBDB8D));
        panel1.setBackground(new Color(0xE96A22));

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = Integer.parseInt(dlm.getElementAt(0).toString());
                int y = Integer.parseInt(dlm.getElementAt(1).toString());
                labelA3B2.setText("(A*A*A)*(B*B) = " + (x * y));
            }
        });

        textFieldA.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                int A = Integer.parseInt(textFieldA.getText());
                dlm.set(0, A * A * A);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {

            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                int A = Integer.parseInt(textFieldA.getText());
                dlm.set(0, A*A*A);
            }
        });

        textFieldB.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                int B = Integer.parseInt(textFieldB.getText());
                dlm.set(1, B*B);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {

            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                int B = Integer.parseInt(textFieldB.getText());
                dlm.set(1, B*B);
            }
        });

        //Set ToolTipText
        list1.setToolTipText(list1.getClass().toString());
        textFieldA.setToolTipText(textFieldA.getClass().toString());
        textFieldB.setToolTipText(textFieldB.getClass().toString());
        button1.setToolTipText(button1.getClass().toString());
        panel1.setToolTipText(panel1.getClass().toString());
        comboBox1.setToolTipText(comboBox1.getClass().toString());
        table1.setToolTipText(table1.getClass().toString());
        textPane1.setToolTipText(textPane1.getClass().toString());
        //
        frame.setVisible(true);
    }

}
