import javax.swing.*;


public class HelloJava {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello, Java!");
        //JLabel  label = new JLabel("Привет любимая, желаю тебе хорошего дня!", JLabel.CENTER);
        frame.add(new HelloComponent());
        frame.setSize(350,300);
        frame.setVisible(true);
    }
}
