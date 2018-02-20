package com.giselle;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
//        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:/home/giselletavares/Documents/giselletavares/_CursosOnline/Udemy-CompleteJavaMasterClass/Java8Studies/TestDB/testjava.db");
//             Statement statement = conn.createStatement()) {
//            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/home/giselletavares/Documents/giselletavares/_CursosOnline/Udemy-CompleteJavaMasterClass/Java8Studies/TestDB/testjava.db");
//            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts (name TEXT, phone INTEGER, email TEXT)");
//            statement.execute("INSERT INTO contacts (name, phone, email) values ('Peri', 564613123, 'peri_reis@hotmail.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email) values ('Mia', 564564, 'mia@hotmail.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email) values ('Agatha', 563776, 'agatha@hotmail.com')");
//            statement.execute("UPDATE contacts SET phone=513213 WHERE name='Mia'");
//            statement.execute("DELETE FROM contacts WHERE name='Agatha'");

            statement.execute("SELECT * FROM contacts");
            ResultSet results = statement.getResultSet();
            while(results.next()){
                System.out.println(results.getString("name") + " " +
                                    results.getInt("phone") + " " +
                                    results.getString("email"));
            }

            results.close();


            statement.close();
            conn.close();
        } catch (SQLException e){
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
