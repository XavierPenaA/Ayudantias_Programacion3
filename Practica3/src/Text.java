import java.util.Stack;

public class Text {

    private String text = "";
    private Stack<String> undos = new Stack<String>();
    private Stack<String> redos = new Stack<String>();

    public Boolean canRedo() {
        return !redos.isEmpty();
    }

    public Boolean canUndo() {
        return !undos.isEmpty();
    }

    public String toString() {
        return this.text;
    }

    public void addText(String newText) {
        newText = this.text.isEmpty() ? newText :" " + newText;
        this.text = this.text + newText;
        this.undos.push(newText);
        this.redos.clear();
    }

    public void undo() {
        if (!this.undos.isEmpty()) {
            String change = this.undos.pop();
            this.text = this.text.substring(0,text.length()-change.length());
            this.redos.push(change);
        } else {
            System.out.println("Nothing to undo");
        }
    }

    public void redo() {
        if (!this.redos.isEmpty()) {
            String change = this.redos.pop();
            this.text = this.text + change;
            this.undos.push(change);
        } else {
            System.out.println("You're already in the last change");
        }
    }
}
