
package airlinemanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Mainframe extends JFrame {
    
    public static void main(String[] args){
        new Mainframe().setVisible(true);
    }
    public Mainframe(){
        super("AIRLINE RESERVATION MANAGEMENT SYSTEM");
        initialize();
    }
    
    private void initialize(){
        
        setForeground(Color.cyan);
        setLayout(null);
        
        JLabel NewLabel = new JLabel("");
        NewLabel.setIcon(new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icon/airo.jpg")));
        NewLabel.setBounds(0,0, 1366,768 );
        add(NewLabel);
        
        JLabel AirlineManagementSystem = new JLabel("AIR INDIA WELCOMES YOU");
        AirlineManagementSystem.setForeground(Color.BLUE);
        AirlineManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 36));
        AirlineManagementSystem.setBounds(450, 60, 1000, 55);
        NewLabel.add(AirlineManagementSystem);
        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        JMenu AirlineSystem = new JMenu("AIRLINE SYSTEM");
        AirlineSystem.setForeground(Color.BLUE);
        menuBar.add(AirlineSystem);
        
        JMenuItem FlightDetails = new JMenuItem("FLIGHT_INFO");
        AirlineSystem.add(FlightDetails);
        
        JMenuItem ReservationDetails = new JMenuItem("ADD_CUSTOMER_DETAILS");
        AirlineSystem.add(ReservationDetails);
        
        JMenuItem PassengerDetails = new JMenuItem("JOURNEY_DETAILS");
        AirlineSystem.add(PassengerDetails);
        
        JMenuItem SectorDetails_1 = new JMenuItem("PAYMENT_DETAILS");
        AirlineSystem.add(SectorDetails_1);
        
        JMenuItem Cancellation = new JMenuItem("CANCELLATION");
        AirlineSystem.add(Cancellation);
        
        JMenu Ticket = new JMenu("TICKET");
        Ticket.setForeground(Color.red);
        menuBar.add(Ticket); 
        
        JMenuItem viewTickets = new JMenuItem("VIEW TICKETS");
        Ticket.add(viewTickets);
        
        JMenu List = new JMenu("LIST");
        List.setForeground(Color.BLUE);
        menuBar.add(List);
        
        JMenu Misc = new JMenu("MISC");
        Misc.setForeground(Color.RED);
	menuBar.add(Misc);
        
		
	FlightDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Flight_Info();
            }
            
        });
        
        ReservationDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new Add_Customer();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
        
        PassengerDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new Journey_Details();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            
        });
        
        SectorDetails_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new Payment_Details();
                  
                }catch(Exception e){
                    e.printStackTrace();
                    
                }
            }
        });
        
          Cancellation.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Cancel();
            }
	});
          
          
            viewTickets.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new Ticket();
                  
                }catch(Exception e){
                    e.printStackTrace();
                    
                }
            }
        });
		
        setSize(1950,1090);
	setVisible(true);
    
    }
} 
         
        
         
        
        
        
    
    

