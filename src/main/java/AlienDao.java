package main.java;

import main.java.model.Alien;

import java.sql.*;

public class AlienDao
{


    public Alien getAlien(int aid)
    {
        Alien a = new Alien();
        a.setAid(101);
        a.setAname("marat");
        a.setTech("cicd");
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/navin","root","root");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from alien where aid=" + aid);
            if(rs.next())
            {
                a.setAid(rs.getInt("aid"));
                a.setAname(rs.getString("aname"));
                a.setTech(rs.getString("tech"));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }

        return a;
    }

}
