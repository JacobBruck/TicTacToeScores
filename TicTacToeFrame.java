/**
 * long description for the file
 *
 * @summary short description for the file
 * @author Jacob Bruck
 *
 * Created at     : 2022-10-31 20:41:48 
 * Last modified  : 2022-10-31 20:41:48 
 */

package TicTacToeScores;


//package TicTacToeLab;

import javax.swing.JFrame;
//import javax.swing.JScrollPane;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 * the dialog that holds the game board.
 */
public class TicTacToeFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    TicTacToePanel tPanel;
    TicTacToeScorePanel sPanel;

    /**
     * the frame class constructor.
     */
    public TicTacToeFrame (boolean hostOrConnect,String ip){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLayout(new BorderLayout());
        tPanel = new TicTacToePanel(this);
        add(tPanel,BorderLayout.CENTER);
        sPanel = new TicTacToeScorePanel();
        add(sPanel, BorderLayout.NORTH);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
            }
        });
    }
}