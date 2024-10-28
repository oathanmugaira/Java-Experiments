// Aim: Write an applet using ActionEvent and textfield to find largest between three numbers.
// Name: Pathan Mugaira
// UIN: 231P084
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class LargestNumber extends Applet implements ActionListener {
TextField num1Field, num2Field, num3Field, resultField;
Button findLargestButton;
public void init() {
setLayout(null);
num1Field = new TextField();
num1Field.setBounds(50, 50, 100, 30);
add(num1Field);
num2Field = new TextField();
num2Field.setBounds(50, 100, 100, 30);
add(num2Field);
num3Field = new TextField();
num3Field.setBounds(50, 150, 100, 30);
add(num3Field);
findLargestButton = new Button("Find Largest");
findLargestButton.setBounds(200, 100, 100, 30);
add(findLargestButton);
resultField = new TextField();
resultField.setBounds(50, 200, 250, 30);
resultField.setEditable(false);
add(resultField);
findLargestButton.addActionListener(this);
}
public void actionPerformed(ActionEvent e) {
double num1, num2, num3;
try {
num1 = Double.parseDouble(num1Field.getText());
num2 = Double.parseDouble(num2Field.getText());
num3 = Double.parseDouble(num3Field.getText());
} catch (NumberFormatException ex) {
resultField.setText("Please enter valid numbers");
return;
}
double largest;
if (num1 >= num2 && num1 >= num3) {
largest = num1;
} else if (num2 >= num1 && num2 >= num3) {
largest = num2;
} else {
largest = num3;
}
resultField.setText("The largest number is: " + largest);
}
}
}