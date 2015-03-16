package shha;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;


/**
 *
 * @author Sheldon Gray
 */

//here also add a forgot userName, forgot passWord form
public class loginGUI2 extends JFrame {
    
    //Global Variables
    private JButton loginButton;
    private JLabel userLabel;
    private JLabel passLabel;
    private JLabel logoLabel;
    private JLabel portalMessage;
    private JPasswordField passText;
    private JTextField userText;
    private String userName, passWord;
    
    //Lauch GUI
    public loginGUI2() {
        buildGUI();
    }
    
    //Method to build the Login GUI Interface
    private void buildGUI() {
        //Set exit on close function and Preferred Size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800, 600));
        
        
        //Component variables
        userLabel = new JLabel();
        passLabel = new JLabel();
        userText = new JTextField();
        passText = new JPasswordField();
        loginButton = new JButton();
        logoLabel = new JLabel();
        portalMessage = new JLabel();
        
        //Set text for labels and button
        userLabel.setText("Username:");
        passLabel.setText("Password:");
        loginButton.setText("Login");
        
        //Action Listener for the Login Button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        
        //Set logo to a label to be displayed
        logoLabel.setIcon(new ImageIcon(getClass().getResource("/logo.png")));
        
        //Portal Message
        portalMessage.setFont(new Font("Tahoma", 0, 24));
        portalMessage.setText("SHHA Employee Portal");

        //And the fun begins
        //Build Login GUI using a Group Layout
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                    .addComponent(portalMessage, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoLabel))
                .addGap(201, 201, 201))
            .addGroup(layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(userLabel)
                    .addComponent(passLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(userText)
                    .addComponent(passText, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(312, Short.MAX_VALUE))
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(logoLabel)
                .addGap(18, 18, 18)
                .addComponent(portalMessage)
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(userLabel)
                    .addComponent(userText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(passLabel)
                    .addComponent(passText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginButton)
                .addContainerGap(209, Short.MAX_VALUE))
        );
        
        logoLabel.getAccessibleContext().setAccessibleDescription("");
        pack();
    }
    
    //Precondition: The RootPane has been loaded adn the Login button has been 
    //              pressed
    //Postcondition: If either the userName textbox or passWord textbox is empty
    //               the user is prompted to enter the field
    public boolean validForm() {
         
        if(userName.equals("")) {
            
           JOptionPane.showMessageDialog(rootPane, "Enter a user name");
           return false;
        }
        
        if(passWord.equals("")) {
             JOptionPane.showMessageDialog(rootPane, "Enter a password");
             return false;
        }
        
        return true;
    }
    
    //Precondition: The rootPanel has been loaded
    //Postcondition: The authentication sequence is initated and if sucessful
    //              "the next panel" is loaded
    private void loginButtonActionPerformed(ActionEvent e) { 
        userName = userText.getText();
        passWord = passText.getText();

        if(validForm()) {
           
            Authentication auth = new Authentication(userName, passWord);
            
            if(auth.verifyAuth()) {
                JOptionPane.showMessageDialog(rootPane, "Authentication Sucessful");
                mainGUI2 mainGUI = new mainGUI2();
                mainGUI.setVisible(true);
                setVisible(false);
                
            } else {
                JOptionPane.showMessageDialog(rootPane, "Authentication failed");
            }   
        }
    }                                        
}
