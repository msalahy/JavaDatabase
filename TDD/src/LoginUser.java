import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


    public  class LoginUser extends JFrame{
    	int userID;
    	
    	//Dao dao = new Dao();
    	public LoginUser() throws SQLException {
    		new LoginUser(userID);
    	}
    	
    	public LoginUser(int userID) throws SQLException {
    		
    	this.userID=userID;
    	
    	//super("Regular User Log In");
       //conn = new Dao();
    	//java.sql.Statement statement= dao.connect().createStatement();
        setSize(500, 400);
        setLayout(new GridLayout(5, 1));
        setLocationRelativeTo(null); // centers window


        
        JLabel lblStatus = new JLabel("Recent Tickets", JLabel.CENTER);
        JScrollPane scroll = new JScrollPane(lblStatus, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        JButton btnTicketStatus = new JButton("View Tickets Status");
        JButton btnNewTicket = new JButton("Enter a New Ticket");
        JButton btnBack = new JButton("Back");
        JButton btnExit = new JButton("Exit");
        
     
        add(btnNewTicket);
        add(btnTicketStatus);
        // 3rd row
        add(btnBack);
        add(btnExit);
        add(scroll);
       
        btnExit.addActionListener(e -> System.exit(0));
    	btnBack.addActionListener(new ActionListener() {
    	    @Override
    	    public void actionPerformed(ActionEvent e) {
    	    	//new Login();
				dispose();
    	    }
    	});


		
    	
    	btnNewTicket.addActionListener(new ActionListener() {
    	    @Override
    	    public void actionPerformed(ActionEvent e) {
    	    	try {
					new	NewTicket();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				dispose();
    	    }
    	});	
        setVisible(true); // SHOW THE FRAME   
    }
    	

	public  class NewTicket extends JFrame {
    		
    		public  NewTicket() throws SQLException {

    			super("Enter New Ticket");
    			//java.sql.Statement statement= dao.connect().createStatement();
    			setSize(500, 300);
    			setLayout(new GridLayout(3, 2));
    			setLocationRelativeTo(null); // centers window
    			
    			JLabel DescriptionLabel = new JLabel("Enter Description ", JLabel.CENTER);
    			JLabel lblStatus = new JLabel(" Welcome Back! ", JLabel.LEFT);
    			
    			

    			//JTextField dateTextField= new JTextField();
    			JTextField textDescription = new JTextField();
    			//lblStatus.setToolTipText(" ");
    			  
    			JButton exitBTN  = new JButton("EXIT");
    			JButton submitBTN  = new JButton("Submit");
    			
    			//add(dateLabel);
    			//add(dateTextField);
    			add(DescriptionLabel);
    			add(textDescription);
    			
    			 
    			add(exitBTN);
    			add(submitBTN);
    			 add(lblStatus);
    			
    		
    		exitBTN.addActionListener(e -> System.exit(0));
    		setVisible(true); // SHOW THE FRAME
    		}
    		}

 
   
}

