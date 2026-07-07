import javax.swing.*;

public class GUI {
    JFrame window;
    JTextArea textArea;
    JScrollPane scrollPane;

    public static void main(String[] args){
        new GUI();

    }
    public GUI(){
    createWindow();
    createTextArea();
    window.setVisible(true);
    }

    public void createWindow(){
        window = new JFrame("Notepad");
        //Standard window sizing
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void createTextArea(){
        textArea = new JTextArea();
        //Combined the text area with horizontal and vertical scroll
        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //Removes the Empty border from the text area
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        window.add(scrollPane);

    }
}
