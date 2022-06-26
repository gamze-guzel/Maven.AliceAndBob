import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ) {
        JTextField nameField1 = new JTextField(15);
        JTextField nameField2 = new JTextField(15);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Name 1:"));
        myPanel.add(nameField1);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("Name 2:"));
        myPanel.add(nameField2);

        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Please Enter Your Names", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            if ((nameField1.getText().equals("Alice") || nameField1.getText().equals("Bob")) && (nameField2.getText().equals("Alice") || nameField2.getText().equals("Bob"))) {
                System.out.println("Hi " + nameField1.getText() + " and " + nameField2.getText());
            }
            else {
                return;
            }
        }
        }
    }









    /*public static void main(String[] args) {
        //String line;
        Scanner in= new Scanner (system.in);
        System.out.print("Hello Alice");
        line= in.nextline();
        System.out.printIn( )
 }*/
