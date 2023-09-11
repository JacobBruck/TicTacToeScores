/**
 * long description for the file
 *
 * @summary short description for the file
 * @author Jacob Bruck
 *
 * Created at     : 2022-10-31 20:59:37 
 * Last modified  : 2022-10-31 20:59:37 
 */

package TicTacToeScores;

import javax.swing.JPanel;
//import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.*;
import java.awt.event.*;

public class TicTacToeScorePanel extends JPanel {  //create a public class for scores that extends JPanel
    //private JTextArea m_textArea;
    private JTextField m_textField;
    private JTextField m_textField2;

    //private final static String s_newLine = "\n";
    public TicTacToeScorePanel() {  //constructor
        //super(new GridBagLayout());

        
        m_textField = new JTextField(10);  //first text field, make sure size is small enough for both to fit
       // m_textField.addActionListener(this);
        add(m_textField);
        //m_textArea = new JTextArea(5, 50);
        //m_textArea.setEditable(false);
        //JScrollPane scrollPane = new JScrollPane(m_textArea);
        
        m_textField2 = new JTextField(10);  //second text field
        //m_textField2.addActionListener(this);
        add(m_textField2);

        m_textField.setEditable(false);
        m_textField2.setEditable(false);
        //m_textArea = new JTextArea(5, 50);
        //m_textArea.setEditable(false);
        //JScrollPane scrollPane = new JScrollPane(m_textArea);
       
    }
    /*public void actionPerformed(ActionEvent e) { //add method
        String _text = m_textField.getText();
        String _text2 = m_textField2.getText();
        //m_textArea.append(_text + s_newLine);
        m_textField.selectAll();
        m_textField2.selectAll();
        //m_textArea.setCaretPosition(m_textArea.getDocument().getLength());
    } */

    public void setScoreString(int o, int x){ //create a function
        m_textField.setText("O Wins: " + Integer.valueOf(o));
        m_textField2.setText("X Wins: " + Integer.valueOf(x));
    }
        
}
   


