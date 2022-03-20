
package airlinemanagementsystem;

import java.awt.EventQueue;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Add_Customer extends JFrame{ //third frame
    
    JTextField tf,tf1,tf2,tf3,tf4,tf5,tf6,tf7;
    
    public Add_Customer(){
        getContentPane().setForeground(Color.BLUE);
        getContentPane().setBackground(Color.WHITE);
        setTitle("ADD CUSTOMER DETAILS");
        
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(778,486);
        getContentPane().setLayout(null);
        
        JLabel Passportno = new JLabel("PASSPORT NO");
        Passportno.setFont(new Font("Tahoma",Font.PLAIN,17));
        Passportno.setBounds(60,80,150,27);
        add(Passportno);
        
        tf = new JTextField();
        tf.setBounds(200, 80, 150, 27);
        add(tf);
        
        
        JButton Next = new JButton("SAVE");
        Next.setBounds(200, 500, 150, 30);
        Next.setBackground(Color.BLACK);
        Next.setForeground(Color.WHITE);
        add(Next);
        
        JLabel Pnrno = new JLabel("PNR NO");
        Pnrno.setFont(new Font("Tahoma", Font.PLAIN,17));
        Pnrno.setBounds(60, 120, 150, 27);
        add(Pnrno);
        
        tf1 = new JTextField();
        tf1.setBounds(200, 120, 150, 27);
        add(tf1);
        
        JLabel Address = new JLabel("ADDRESS");
        Address.setFont(new Font("Tahoma",Font.PLAIN,17));
        Address.setBounds(60,170,150,27);
        add(Address);
        
        tf2 = new JTextField();
        tf2.setBounds(200,170,150,27);
        add(tf2);
        
        JLabel Nationality = new JLabel("NATIONALITY");
        Nationality.setFont(new Font("Tahoma",Font.PLAIN,17));
        Nationality.setBounds(60,220,150,27);
        add(Nationality);
        
        tf3 = new JTextField();
        tf3.setBounds(200, 220, 150, 27);
        add(tf3);
        
        JLabel Name = new JLabel("NAME");
        Name.setFont(new Font("Tahoma",Font.PLAIN,17));
        Name.setBounds(60,270,150,27);
        add(Name);
        
        tf4 = new JTextField();
        tf4.setBounds(200, 270, 150, 27);
        add(tf4);
        
        JLabel Gender = new JLabel("GENDER");
        Gender.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Gender.setBounds(60, 320, 150, 27);
        add(Gender);
        
        JRadioButton Male = new JRadioButton("MALE");
        Male.setBackground(Color.WHITE);
        Male.setBounds(200,320,70,27);
        add(Male);
        
        JRadioButton Female = new JRadioButton("FEMALE");
        Female.setBackground(Color.WHITE);
        Female.setBounds(280,320,70,27);
        add(Female);
        
        JRadioButton Other = new JRadioButton("OTHER");
        Other.setBackground(Color.WHITE);
        Other.setBounds(360,320,70,27);
        add(Other);
        
        JLabel Phno = new JLabel("PH NO");
        Phno.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Phno.setBounds(60, 370, 150, 27);
        add(Phno);
			
        tf5 = new JTextField();
        tf5.setBounds(200, 370, 150, 27);
        add(tf5);
	
        setVisible(true);
        
        JLabel AddPassengers = new JLabel("ADD CUSTOMER DETAILS");
        AddPassengers.setForeground(Color.BLUE);
        AddPassengers.setFont(new Font("Tahoma", Font.PLAIN, 31));
        AddPassengers.setBounds(420, 24, 442, 35);
        add(AddPassengers);
        
        JLabel Flightcode = new JLabel("FLIGHT CODE");
        Flightcode.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Flightcode.setBounds(60, 30, 150, 27);
        add(Flightcode);
        
          tf6 = new JTextField();
        tf6.setBounds(200, 30, 150, 27);
        add(tf6);
        
         JLabel Date = new JLabel("Journey Date");
        Date.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Date.setBounds(60, 430, 150, 27);
        add(Date);
        
        tf7 = new JTextField();
        tf7.setBounds(200, 430, 150, 27);
        add(tf7);

       
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icon/emp.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(450,80,280,410);
        add(image);
        
        Next.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
            String passport_No = tf.getText();
            String pnr_no = tf1.getText();
            String address = tf2.getText();
            String nationality = tf3.getText();
            String name = tf4.getText();
            String fl_code = tf6.getText();
            String date = tf7.getText();
            
            String gender = null;
            String ph_no = tf5.getText();
            
            if(Male.isSelected()){
                gender = "male";
                
            }else if(Female.isSelected()){
                gender = "female";
            }
            
            try{
            Conn c = new Conn();
            String str = "INSERT INTO passenger values( '"+pnr_no+"', '"+address+"', '"+nationality+"','"+name+"', '"+gender+"', '"+ph_no+"','"+passport_No+"', '"+fl_code+"','"+date+"')";
            
            c.s.executeUpdate(str);
            JOptionPane.showMessageDialog(null,"Customer Added");
            setVisible(false);
        }catch(Exception e){
            e.printStackTrace();
        }
            }
        
            
            
            
            
            
        });
        
        setSize(900,600);
        setVisible(true);
        setLocation(400,200);
    }
     public static void main(String[] args){
        new Add_Customer();
    }   
        
        
        
        
        
    }
    
    
    
    

