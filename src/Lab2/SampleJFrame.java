package Lab2;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Admin on 15.09.2015.
 */
public class SampleJFrame extends JFrame {
    private JLabel label1 = new JLabel("Label 1");
    private JTextArea textArea1 = new JTextArea("TextArea 1");
    private JCheckBox checkbox1 = new JCheckBox("Checkbox 1");
    private JComboBox choice1 = new JComboBox();
    private JList list1 = new JList();
    private JPanel panel1 = new JPanel();
    private JTextField textField1 = new JTextField("TextField 1");
    private JButton button1 = new JButton("Button1");

    public static void main(String[] args) {
        SampleJFrame frame = new SampleJFrame();


        frame.add(frame.label1, new GridBagConstraints(0,0,2,2,1,1,GridBagConstraints.CENTER,
                GridBagConstraints.BOTH, new Insets(0,0,0,0),0,0));
        frame.add(frame.textArea1, new GridBagConstraints(2,0,4,1,1,1,GridBagConstraints.CENTER,
                GridBagConstraints.BOTH, new Insets(0,0,0,0),0,0));
        frame.add(frame.checkbox1, new GridBagConstraints(0,2,1,2,1,1,GridBagConstraints.CENTER,
                GridBagConstraints.BOTH, new Insets(0,0,0,0),0,0));
        frame.add(frame.choice1, new GridBagConstraints(1,2,1,2,1,1,GridBagConstraints.CENTER,
                GridBagConstraints.BOTH, new Insets(0,0,0,0),0,0));
        frame.add(frame.list1, new GridBagConstraints(2,1,2,3,1,1,GridBagConstraints.CENTER,
                GridBagConstraints.BOTH, new Insets(0,0,0,0),0,0));
        frame.add(frame.panel1, new GridBagConstraints(4,1,2,1,1,1,GridBagConstraints.CENTER,
                GridBagConstraints.BOTH, new Insets(0,0,0,0),0,0));
        frame.add(frame.textField1, new GridBagConstraints(4,2,1,2,1,1,GridBagConstraints.CENTER,
                GridBagConstraints.BOTH, new Insets(0,0,0,0),0,0));
        frame.add(frame.button1, new GridBagConstraints(5,2,1,2,1,1,GridBagConstraints.CENTER,
                GridBagConstraints.BOTH, new Insets(0,0,0,0),0,0));


    }
    public SampleJFrame() throws HeadlessException {
        setLayout(new GridBagLayout());
        setSize(600,600);
        setVisible(true);
        setTitle("Java lab_2 Miroshnychenko Makarenko");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
