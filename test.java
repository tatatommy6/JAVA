import javax.swing.*;
import java.awt.*;
public class test extends JFrame{
    public test(){
        setTitle("gridlayout sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout gr=new GridLayout(4,2);
        gr.setVgap(5);
        Container c=getContentPane();
        c.setLayout(gr);
        c.add(new JLabel("이름"));
        c.add(new JTextField(""));
        c.add(new JLabel("학번"));
        c.add(new JTextField(""));
        c.add(new JLabel("학과"));
        c.add(new JTextField(""));
        c.add(new JLabel("과목"));
        c.add(new JTextField(""));

        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new test();
    }
}