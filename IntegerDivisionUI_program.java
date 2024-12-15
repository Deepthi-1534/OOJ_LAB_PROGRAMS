import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntegerDivisionUI {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Integer Division Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        
        JLabel labelNum1 = new JLabel("Num1:");
        JTextField textNum1 = new JTextField();
        
        JLabel labelNum2 = new JLabel("Num2:");
        JTextField textNum2 = new JTextField();
        
        JLabel labelResult = new JLabel("Result:");
        JTextField textResult = new JTextField();
        textResult.setEditable(false);

        JButton buttonDivide = new JButton("Divide");

       
        frame.add(labelNum1);
        frame.add(textNum1);
        frame.add(labelNum2);
        frame.add(textNum2);
        frame.add(labelResult);
        frame.add(textResult);
        frame.add(buttonDivide);

        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    
                    int num1 = Integer.parseInt(textNum1.getText());
                    int num2 = Integer.parseInt(textNum2.getText());

                   
                    int result = num1 / num2;
                    textResult.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid integers!", "Input Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(frame, "Division by zero is not allowed!", "Arithmetic Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        
        frame.setVisible(true);
    }
}
