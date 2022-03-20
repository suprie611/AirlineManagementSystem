
package airlinemanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class Payment_Details extends JFrame { // Fifth

    JTextField tf;
    JTable table;
    JLabel  Pay_Details;
    JLabel pnr, Paid_Amt, Pay_Date, Cheque_No, label,Cardno,Phoneno;
    
    public static void main(String[] args){
        new Payment_Details();
        
    }
    public Payment_Details(){
        initialize();
    }
    
    private void initialize(){
        setTitle("PAYMENT_DETAILS");
        getContentPane().setBackground(Color.WHITE);
        setSize(860,486);
        setLayout(null);
        
        JLabel Fcode = new  JLabel("PNR NO");
        Fcode.setFont(new Font("Tahoma", Font.PLAIN,17));
        Fcode.setBounds(60,160,150,26);
        add(Fcode);
     
        tf = new JTextField();
        tf.setBounds(200, 160, 150, 26);
        add(tf);
        
        table = new JTable();
        table.setBounds(45,329,766,87);
        add(table);
        
        JButton Show = new  JButton("SHOW");
        Show.setFont(new Font("Tahoma",Font.PLAIN,17));
        Show.setBackground(Color.BLACK);
        Show.setForeground(Color.WHITE);
        Show.setBounds(200, 210, 150, 26);
        add(Show);
        
        Pay_Details = new JLabel("PAYMENT DETAILS");
	 Pay_Details.setForeground(Color.BLUE);
	 Pay_Details.setFont(new Font("Tahoma", Font.PLAIN, 31));
	 Pay_Details.setBounds(51, 17, 300, 39);
	add( Pay_Details);
		
	pnr = new JLabel("PNR_NO");
	pnr.setFont(new Font("Tahoma", Font.PLAIN, 13));
	pnr.setBounds(84, 292, 108, 26);
	add(pnr);
		
	Paid_Amt = new JLabel("PAID_AMOUNT");
	Paid_Amt.setFont(new Font("Tahoma", Font.PLAIN, 13));
	Paid_Amt.setBounds(183, 298, 92, 14);
	add(Paid_Amt);
		
	Pay_Date = new JLabel("PAY_DATE");
	Pay_Date.setFont(new Font("Tahoma", Font.PLAIN, 13));
	Pay_Date.setBounds(322, 294, 101, 24);
	add(Pay_Date);
		
	Cheque_No = new JLabel("CHEQUE_NO");
	Cheque_No.setFont(new Font("Tahoma", Font.PLAIN, 13));
	Cheque_No.setBounds(455, 298, 114, 14);
	add(Cheque_No);
		
	label = new JLabel("");
	label.setIcon(new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icon/payment.png")));
	label.setBounds(425, 15, 239, 272);
	add(label);
		
	Cardno = new JLabel("CARD_NO");
	Cardno.setFont(new Font("Tahoma", Font.PLAIN, 13));
	Cardno.setBounds(602, 299, 101, 19);
	add(Cardno);
		
	Phoneno = new JLabel("PHONE_NO");
	Phoneno.setFont(new Font("Tahoma", Font.PLAIN, 13));
	Phoneno.setBounds(712, 294, 86, 24);
	add(Phoneno);
	
        setVisible(true);
		
	Show.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
		
                try {
                    String code  = tf.getText();
                    
                    Conn c = new Conn();
                    String str = "select pnr_no,paid_amt,pay_date,cheque_no,card_no,ph_no from payment where pnr_no = '"+code+"'";
					
                    ResultSet rs = c.s.executeQuery(str);
		
                    table.setModel(DbUtils.resultSetToTableModel(rs));
					
		}catch(SQLException e) {
                    e.printStackTrace();
                }
            }
	});
		
	setSize(960,590);
        setLocation(400,200);
	setVisible(true);
        
        
    }
    
    
}
