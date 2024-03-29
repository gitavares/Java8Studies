package com.giselle;

import java.sql.*;

public class Main {
    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:/home/giselletavares/Documents/giselletavares/_CursosOnline/Udemy-CompleteJavaMasterClass/Java8Studies/TestDB/" + DB_NAME;
    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";


    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
            Statement statement = conn.createStatement();

            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);

            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                    " (" + COLUMN_NAME +" TEXT, "
                    + COLUMN_PHONE + " INTEGER, "
                    + COLUMN_EMAIL+ " TEXT)"
                    );
            insertContact(statement, "Giselle", 65345536, "gitavares@hotmail.com");
            insertContact(statement, "Peri", 564613123, "peri_reis@hotmail.com");
            insertContact(statement, "Mia", 687463463, "mia@hotmail.com");
            insertContact(statement, "Agatha", 968567, "agatha@hotmail.com");

            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " +
                    COLUMN_PHONE + "=513213 WHERE " +
                    COLUMN_NAME + "='Mia'");
            statement.execute("DELETE FROM " + TABLE_CONTACTS +
                    " WHERE " + COLUMN_NAME + "='Agatha'");

            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS + "");
            while(results.next()){
                System.out.println(results.getString(COLUMN_NAME) + " " +
                                    results.getInt(COLUMN_PHONE) + " " +
                                    results.getString(COLUMN_EMAIL));
            }

            results.close();


            statement.close();
            conn.close();
        } catch (SQLException e){
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

    private static void insertContact(Statement statement, String name, int phone, String email) throws  SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS + "(" +
                COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " +
                COLUMN_EMAIL +
                ") values ('" + name + "', " + phone + ", '" + email + "')");
    }
}
