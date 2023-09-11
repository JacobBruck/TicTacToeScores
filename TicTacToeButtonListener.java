package TicTacToeScores;

/**
 * long description for the file
 *
 * @summary short description for the file
 * @author Jacob Bruck
 *
 * Created at     : 2022-10-17 22:17:33 
 * Last modified  : 2022-10-17 22:17:33 
 */



import java.awt.event.*;

public class TicTacToeButtonListener implements ActionListener {

    private static boolean imgChoice = true;
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        TicTacToeButton tButton = (TicTacToeButton) e.getSource();
        tButton.getParent().setActionPerformed(tButton.btnIDx, tButton.btnIDy, imgChoice);
        imgChoice = !imgChoice; 
        
    }
    
}
