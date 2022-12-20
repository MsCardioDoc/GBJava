package Lesson8.listeners;

import org.mariuszgromada.math.mxparser.Expression;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcFieldButtonListener implements ActionListener {

    private JTextField inputField;

    public CalcFieldButtonListener(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Expression exp = new Expression(inputField.getText());
        inputField.setText(String.valueOf(exp.calculate()));

    }
}
