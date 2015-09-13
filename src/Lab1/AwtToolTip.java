package Lab1;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Admin on 12.09.2015.
 */
public class AwtToolTip extends MouseAdapter {

    private String toolTipText= "";
    private Component component = null;
    private Dialog dialog;

    public AwtToolTip(String toolTipText, Component component){
        this.toolTipText = toolTipText;
        this.component = component;
        dialog = new Dialog(new Frame());
        dialog.add(new Label(toolTipText));
        dialog.setLocationRelativeTo(component);
        dialog.pack();

    }

    public void mouseEntered(MouseEvent mouseEvent){
        dialog.setVisible(true);
    }

    public void mouseExited(MouseEvent mouseEvent){
        dialog.setVisible(false);

    }

}