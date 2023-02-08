package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Driver {

    public static void main(String[] args) {


        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","developer","Cris1997");

            Statement statement = connection.createStatement();

            ResultSet resultSet  = statement.executeQuery("Select * from students;");
            while(resultSet.next()){
                System.out.println(resultSet.getString("first_name")+" "+resultSet.getString("last_name"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
