package com.napier.sem;

import java.sql.*;

public class App
{
    public static void main(String[] args)
    {
        try
        {
            //load database driver
            Class.forName("com.mysql.dbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        // Connection to the database 'employees'
        Connection con = null;
        int retries = 100;
        for (int i = 0; i < retries; ++i)
        {
            System.out.println("Connecting to database...");
            try
            {
                //wait a bit for db to start
                Thread.sleep(30000);
                //Connect to to database
                con = DriverManager.getConnection("jdbc:mysql://db:3306/employees?useSSL=false", "root", "example");
                System.out.println("Successfully connected");
                //wait a bit
                Thread.sleep(10000);
                //exit for loop
                break;
            }
            catch (SQLException sqle)
            {
                System.out.println("Failed to connect to database attempt " + Integer.toString(i));
                System.out.println(sqle.getMessage());
            }
            catch (InterruptedException ie)
            {
                System.out.println("Thread interrupted? Should not be happening...");
            }
        }
        if(con != null)
        {
            try
            {
                //close connection
                con.close();
            } catch (Exception e)
            {
                System.out.println("Error closing connection to database");
            }
        }
    }
}
