package airlinemanagementsystem;

import net.proteanit.sql.DbUtils;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Ticket extends JFrame{  //Second Frame

    private JTable table;
    private JTextField textField;
    private JLabel tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
    
    public static void main(String[] args){		 
	new Ticket().setVisible(true);    
    }
    
    public Ticket(){
        
        getContentPane().setBackground(Color.WHITE);
        getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(860,523);
	setLayout(null);
	setVisible(true);
        
        JLabel ticket = new JLabel("Ticket");
	ticket.setFont(new Font("Tahoma", Font.PLAIN, 31));
	ticket.setForeground(new Color(100, 149, 237));
	ticket.setBounds(50, 20, 570, 35);
	add(ticket);
		
	JLabel pnrno = new JLabel("PNR NO");
	pnrno.setFont(new Font("Tahoma", Font.PLAIN, 17));
        pnrno.setBounds(50, 100, 200, 30);
	add(pnrno);
        
        textField = new JTextField();
        textField.setBounds(220, 100, 200, 30);
	add(textField);
	
        JLabel heading = new JLabel("FLIGHT TICKET");
        heading.setFont(new Font("Tahoma",Font.BOLD,20));
        heading.setForeground(Color.BLUE);
        heading.setBounds(325,260,200,30);
        add(heading);
        
		
	
		
	JButton btnShow = new JButton("SHOW");
	btnShow.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnShow.setBounds(220, 150, 120, 30);
	add(btnShow);
        
         JLabel pnr_no = new JLabel("PNR NO");
        pnr_no.setFont(new Font("Tahoma", Font.PLAIN, 15));
        pnr_no.setBounds(50, 300, 120, 20);
        add(pnr_no);
        
        JLabel name = new JLabel("NAME");
        name.setFont(new Font("Tahoma", Font.PLAIN, 15));
        name.setBounds(50, 350, 120, 20);
        add(name);
        
        JLabel nationality = new JLabel("NATIONALITY");
        nationality.setFont(new Font("Tahoma", Font.PLAIN, 15));
        nationality.setBounds(400, 350, 120, 20);
        add(nationality);
        
        JLabel gender = new JLabel("GENDER");
        gender.setFont(new Font("Tahoma", Font.PLAIN, 15));
        gender.setBounds(50, 400, 120, 20);
        add(gender);
        
        JLabel fcode = new JLabel("FLIGHT CODE");
        fcode.setFont(new Font("Tahoma", Font.PLAIN, 15));
        fcode.setBounds(400, 400, 120, 20);
        add(fcode);
        
        JLabel src = new JLabel("SOURCE");
        src.setFont(new Font("Tahoma", Font.PLAIN, 15));
        src.setBounds(50, 450, 120, 20);
        add(src);
        
        JLabel dst = new JLabel("DESTINATION");
        dst.setFont(new Font("Tahoma", Font.PLAIN, 15));
        dst.setBounds(400, 450, 120, 20);
        add(dst);
        
        JLabel date = new JLabel("JOURNEY DATE");
        date.setFont(new Font("Tahoma", Font.PLAIN, 15));
        date.setBounds(400, 300, 120, 20);
        add(date);
        
        
        tf1 = new JLabel();
        tf1.setBounds(150, 300, 150, 20);
        add(tf1);
        
        tf2 = new JLabel();
        tf2.setBounds(150, 350, 150, 20);
        add(tf2);
        
        tf3 = new JLabel();
        tf3.setBounds(550, 350, 150, 20);
        add(tf3);
        
        tf4 = new JLabel();
        tf4.setBounds(150, 400, 150, 20);
        add(tf4);
        
        tf5 = new JLabel();
        tf5.setBounds(550, 400, 150, 20);
        add(tf5);
        
        tf6 = new JLabel();
        tf6.setBounds(150, 450, 150, 20);
        add(tf6);
        
        tf7 = new JLabel();
        tf7.setBounds(550, 450, 150, 20);
        add(tf7);
        
        tf8 = new JLabel();
        tf8.setBounds(550, 300, 150, 20);
        add(tf8);
        
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icon/images.jpeg"));
       JLabel image = new JLabel(i1);
       image.setBounds(690,280,80,80);
       add(image);

        
        
       
	
        btnShow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
	
                String code = textField.getText();
                
                try {
                    Conn c = new Conn();
                    String str = "select pnr_no,name,nationality,gender,fl_code,date,src,dst from passenger,flight where pnr_no = '"+code+"'and fl_code=f_code";
      
                    ResultSet rs = c.s.executeQuery(str);
                     
	
                   	
                    if(rs.next()){
                        String pnrno = rs.getString("pnr_no");
                        tf1.setText(pnrno);
                        
                        
                        String Name = rs.getString("name");
                        tf2.setText(Name);
                        
                        String Nationality = rs.getString("nationality");
                        tf3.setText(Nationality);
                        
                        String Gender = rs.getString("gender");
                        tf4.setText(Gender);
                        
                        String Fl_code = rs.getString("fl_code");
                        tf5.setText(Fl_code);
                        
                        String Src = rs.getString("src");
                        tf6.setText(Src);
                        
                        String Dst = rs.getString("dst");
                        tf7.setText(Dst);
                        
                        String Date = rs.getString("date");
                        tf8.setText(Date);
                                
                    }else{
                        JOptionPane.showMessageDialog(null,"Invalid PNR NO\nPlease enter correct PNR NO");
                        
                    }	
                    
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
        });



      
       JScrollPane pane = new JScrollPane(table);
	pane.setBounds(23, 250, 800, 300);
      pane.setBackground(Color.WHITE);
       add(pane);
		
	
		
	
		
	
		
	
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	setSize(900,650);
        setVisible(true);
        setLocation(400,200);
		
    }
}