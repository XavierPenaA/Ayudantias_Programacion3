import java.util.Scanner;
import javax.swing.JOptionPane;

public class Menu {

    Text userText = new Text();
    Scanner input = new Scanner(System.in);

    public void show() {

        Object [] options = {"Add","Undo","Redo","Exit"};
        int opc;

        do {
            opc = (int) JOptionPane.showOptionDialog(null, userText.toString()+"\nClick an option", "Text Editor",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,options,options[0]);

            switch (opc) {

                case 0:
                    option1();
                    break;
                case 1:
                    option2();
                    break;
                case 2:
                    option3();
                    break;
                case 3:
                    option5();
                    break;
            }
        } while (opc!=3);
    }

    private void option1() {
        String newText = JOptionPane.showInputDialog("Enter your text");
        userText.addText(newText);
    }
    private void option2() {
        userText.undo();
    }
    private void option3() {
        userText.redo();
    }
    private void option4() {
        JOptionPane.showMessageDialog(null, userText.toString());
    }
    private void option5() {
        JOptionPane.showMessageDialog(null, "Closing");
    }
}
