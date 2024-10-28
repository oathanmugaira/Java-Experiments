
// Aim: Write a program to find square of a given number using applet
// Name:Pathan Mugaira
// UIN: 231P084
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Square extends Applet implements ActionListener {
Label l1, l2;
TextField tf1, tf2;
Button btnresult;
public void init() {
l1 = new Label("Enter a number:");
l2 = new Label("The Square is: ");
tf1 = new TextField(5);
tf2 = new TextField(5);
btnresult = new Button("calculate");
btnresult.addActionListener(this);
add(l1);
add(tf1);
add(l2);
tf2.setEditable(false);
add(tf2);
add(btnresult);
}
public void actionPerformed(ActionEvent ae) {
if (ae.getSource() == btnresult)
{
int num = Integer.parseInt(tf1.getText());
int sqr = num * num;
tf2.setText(String.valueOf(sqr));
}
}
}