package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    JTextField firstOperand, secondOperand;
    JButton sum;
    JLabel result;
    Calculator(){
        firstOperand= new JTextField();
        firstOperand.setBounds(90,50,150,30);
        secondOperand=new JTextField();
        secondOperand.setBounds(90,80,150,30);
        sum =new JButton("Calculate");
        sum.setBounds(90,110, 150,30);
        result=new JLabel();
        result.setBounds(90,150, 150, 30);
        add(firstOperand);
        add(secondOperand);
        add(sum);
        sum.addActionListener(this);
        add(result);
        setVisible(true);
        setSize(300, 300);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int firstOperandValue, secondOperandValue, sumResult;
        firstOperandValue= Integer.parseInt(firstOperand.getText());
        secondOperandValue= Integer.parseInt(secondOperand.getText());
        sumResult=firstOperandValue+secondOperandValue;
        result.setText(String.valueOf(sumResult));


    }
}
