package Lab1;

import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Admin on 11.09.2015.
 */
public class SampleFrame extends Frame {
    private Label label1 = new Label("Label 1");
    private TextArea textArea1 = new TextArea("TextArea 1");
    private Checkbox checkbox1 = new Checkbox("Checkbox 1");
    private Choice choice1 = new Choice();
    private List list1 = new List();
    private Panel panel1 = new Panel();
    private TextField textField1 = new TextField("TextField 1");
    private Button button1 = new Button("Button1");

    public static void main(String[] args) {
        SampleFrame frame = new SampleFrame();
        GridBagConstraints gbc = new GridBagConstraints();

        /*frame.label1.setSize((int)(frame.getWidth()*0.33), (int)(frame.getHeight()*0.5));
        frame.textArea1.setSize((int) (frame.getWidth() * 0.66), (int) (frame.getHeight() * 0.25));
        frame.checkbox1.setSize((int) (frame.getWidth() * 0.33 * 0.5), (int) (frame.getHeight() * 0.5));
        frame.choice1.setSize((int)(frame.getWidth()*0.33*0.5), (int)(frame.getHeight()*0.5));
        frame.list1.setSize((int)(frame.getWidth()*0.33), (int)(frame.getHeight()*0.75));
        frame.panel1.setSize((int)(frame.getWidth()*0.33), (int)(frame.getHeight()*0.25));
        frame.textField1.setSize((int)(frame.getWidth()*0.33*0.5), (int)(frame.getHeight()*0.5));
        frame.button1.setSize((int) (frame.getWidth() * 0.33 * 0.5), (int) (frame.getHeight() * 0.5));
*/
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



        frame.label1.addMouseListener(new AwtToolTip(frame.label1.getClass().toString(),frame.label1));
        frame.textArea1.addMouseListener(new AwtToolTip(frame.textArea1.getClass().toString(),frame.textArea1));
        frame.checkbox1.addMouseListener(new AwtToolTip(frame.checkbox1.getClass().toString(),frame.checkbox1));
        frame.choice1.addMouseListener(new AwtToolTip(frame.choice1.getClass().toString(),frame.choice1));
        frame.list1.addMouseListener(new AwtToolTip(frame.list1.getClass().toString(),frame.list1));
        frame.panel1.addMouseListener(new AwtToolTip(frame.panel1.getClass().toString(),frame.panel1));
        frame.textField1.addMouseListener(new AwtToolTip(frame.textField1.getClass().toString(),frame.textField1));
        frame.button1.addMouseListener(new AwtToolTip(frame.button1.getClass().toString(),frame.button1));

        frame.pack();

    }

    public SampleFrame(){
        setLayout(new GridBagLayout());
        setSize(600,600);
        setVisible(true);
        setTitle("Java lab_1 Miroshnychenko Makarenko");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { System.exit(0); }
        });


    }



}
