package Jdbc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class LoginForm extends JFrame implements ActionListener {
  JPanel panel;
  JLabel user_label, email_label;
  JTextField userName_text, email_text;
  JButton submit;
  LoginForm(){
      user_label= new JLabel();
      user_label.setText("User Name:");
      userName_text= new JTextField();
      email_label= new JLabel();
      email_label.setText("Email");
      email_text=new JTextField();
      submit =new JButton("OK");
      panel= new JPanel( new GridLayout(3,1));
      panel.add(user_label);
      panel.add(userName_text);
      panel.add(email_label);
      panel.add(email_text);
      panel.add(submit);
      submit.addActionListener(this);
      add(panel);
      setVisible(true);
      setSize(450, 350);
  }

    public static void main(String[] args) {
       new LoginForm();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      try{
          Class.forName("com.mysql.cj.jdbc.Driver");          //loads the driver
          String url="jdbc:mysql://localhost:3306/data"; // url to the database
          String user= "root"; // by default username to database
          String password=""; // default pw for db
          Connection connection= DriverManager.getConnection(url,user,password); // checks for the connection and makes the connection to database
          String userEmail, userName; //variables for storing textfield's values
          userName= userName_text.getText();
          userEmail= email_text.getText();
     if(connection!=null){
         System.out.println("connection success");
         //pst for inserting data into column name and email. it takes sql queries as an argument.
//         PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO `user`(`name`, `email`) VALUES ('"+userName+"','"+userEmail+"')");
//         preparedStatement.executeUpdate(); //executes the pst
         Statement statement= connection.createStatement(); //creating a statement; callable statement
         ResultSet resultSet= statement.executeQuery("SELECT * FROM `user`"); //retrieving result set
         resultSet.next();
         resultSet.next();  //moves the pointer to the next row

         String name=resultSet.getString(2);
         String mail=resultSet.getString(3);
         if (name.equals(userName)&&mail.equals(userEmail)){
             userName_text.setText("user already exists");
         }
     }
    }catch(Exception exception){
          exception.printStackTrace();
      }

}}
