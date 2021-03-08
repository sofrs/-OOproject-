package apCommon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;


public class MyListener implements ActionListener {
    private int buttonNum;
    JTextField textField;
    JInternalFrame calendario;
    
    public MyListener(int buttonNum, JTextField textField, JInternalFrame calendario) {
       this.buttonNum = buttonNum;
       this.textField = textField;
       this.calendario = calendario;
    }


    public void actionPerformed(ActionEvent e) {
       switch(buttonNum) {
       case 0:
    	   textField.setText("01/03/21");
    	   calendario.setVisible(false);
    	   break;
       case 1:
    	   textField.setText("02/03/21");
    	   calendario.setVisible(false);
    	   break;
       case 2:
    	   textField.setText("03/03/21");
    	   calendario.setVisible(false);
    	   break;
       case 3:
    	   textField.setText("04/03/21");
    	   calendario.setVisible(false);
    	   break;
       case 4:
    	   textField.setText("05/03/21");
    	   calendario.setVisible(false);
    	   break;
       case 5:
    	   textField.setText("06/03/21");
    	   calendario.setVisible(false);
    	   break;
       case 6:
    	   textField.setText("07/03/21");
    	   calendario.setVisible(false);
    	   break;
       case 8: //TO FIX
    	   textField.setText("08/03/21");
    	   calendario.setVisible(false);
    	   break;
       case 9:
    	   textField.setText("09/03/21");
    	   calendario.setVisible(false);
    	   break;
       case 10:
    	   textField.setText("10/03/21");
    	   calendario.setVisible(false);
    	   break;
       case 11:
    	   textField.setText("11/03/21");
    	   calendario.setVisible(false);
    	   break;
       case 12:
    	   textField.setText("12/03/21");
    	   calendario.setVisible(false);
    	   break;
       case 13:
    	   textField.setText("13/03/21");
    	   calendario.setVisible(false);
    	   break;
       case 14:
    	   textField.setText("14/03/21");
    	   calendario.setVisible(false);
    	   break;
       case 15:
    	   textField.setText("15/03/21");
    	   calendario.setVisible(false);
    	   break;
       case 16:
    	   textField.setText("16/03/21");
    	   calendario.setVisible(false);
    	   break;
       case 17:
    	   textField.setText("17/03/21");
    	   calendario.setVisible(false);
    	   break;
       case 18:
    	   textField.setText("18/03/21");
    	   calendario.setVisible(false);
    	   break;
       case 19:
    	   textField.setText("19/03/21");
    	   calendario.setVisible(false);
    	   break;
       case 20:
    	   textField.setText("20/03/21");
    	   calendario.setVisible(false);
    	   break;
       case 21:
    	   textField.setText("23/03/21");
    	   calendario.setVisible(false);
    	   break;
       case 22:
    	   textField.setText("22/03/21");
    	   calendario.setVisible(false);
    	   break;
       case 23:
    	   textField.setText("23/03/21");
    	   calendario.setVisible(false);
    	   break;
       case 24:
    	   textField.setText("24/03/21");
    	   calendario.setVisible(false);
    	   break;
       case 25:
    	   textField.setText("25/03/21");
    	   calendario.setVisible(false);
    	   break;
       case 26:
    	   textField.setText("26/03/21");
    	   calendario.setVisible(false);
    	   break;
       case 27:
    	   textField.setText("27/03/21");
    	   calendario.setVisible(false);
    	   break;
       case 28:
    	   textField.setText("28/03/21");
    	   calendario.setVisible(false);
    	   break;
       case 29:
    	   textField.setText("29/03/21");
    	   calendario.setVisible(false);
    	   break;
       case 30:
    	   textField.setText("30/03/21");
    	   calendario.setVisible(false);
    	   break;
       case 31:
    	   textField.setText("31/03/21");
    	   calendario.setVisible(false);
    	   break;
       }
     }
   }