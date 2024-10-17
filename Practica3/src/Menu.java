import java.util.Scanner;
import javax.swing.JOptionPane;

public class Menu {

    Text userText = new Text();

    public void show() {

        Object [] options = {"Add","Undo","Redo","Exit"};
        int opc;

        do {
            opc = (int) JOptionPane.showOptionDialog(null, userText.toString()+"\nClick an option", "String Editor",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,options,options[0]);

            switch (opc) {

                case 0:
                    option0();
                    break;
                case 1:
                    option1();
                    break;
                case 2:
                    option2();
                    break;
                case 3:
                    option3();
                    break;
            }
        } while (opc!=3);
    }

    private void option0() {
        String newText = JOptionPane.showInputDialog("Enter your text");
        userText.addText(newText);
    }
    private void option1() {
        userText.undo();
    }
    private void option2() {
        userText.redo();
    }
    private void option3() {
        JOptionPane.showMessageDialog(null, "Closing");
    }
}
