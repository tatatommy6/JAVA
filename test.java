import javax.swing.*;
import java.awt.*;
public class test  extends JFrame{
    public test() {
        setTitle("FlowLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        //컨텐트판에 FlowLayout 배치 관리자 생성
        c.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
        c.add(new JButton("add"));
        c.add(new JButton("sub"));
        c.add(new JButton("mul"));
        c.add(new JButton("div"));
        c.add(new JButton("Calculate"));

        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new test();
    }
}