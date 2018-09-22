/** **********
 *
 *      Class:         CreateAircraftTable.java
 *      Package:       util
 *      Date:          October 14, 2018
 *
 *      Course: UMUC CMSC 495 6381
 *      Group A Members: John Tamer, Jason Grimard, Demetrius Billups, & Emily Hoppe
 *
 *      Class Description: CreateAircraftTable is a static utility class that is
 *                  used to create a table in the database and fill it with
 *                  sample data.
 *
 *
 *********** */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CreateAircraftTable {

    public static void createTable() {
        final String CONNECTION = "jdbc:derby:FlightHours;create=true";
        boolean okayToCreate = false;

        try {
            Connection conn = DriverManager.getConnection(CONNECTION);
            Statement s = conn.createStatement();
            s.execute("SELECT '1' FROM AIRCRAFT");
        } catch (SQLException sqle) {
            String theError = (sqle).getSQLState();
            if (theError.equals("42X05")) // Table does not exist
            {
                okayToCreate = true;
            } else {
                JOptionPane.showMessageDialog(null, "CreateAircraftTable Database Error: " + theError,
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (okayToCreate) {
            //Create table in database
            try (Connection conn = DriverManager.getConnection(CONNECTION);
                    Statement statement = conn.createStatement()) {
                statement.executeUpdate("CREATE TABLE aircraft ( "
                        + " aircraft_id INT NOT NULL GENERATED ALWAYS AS IDENTITY, "
                        + " tail_number   VARCHAR (10) NOT NULL UNIQUE,"
                        + " aircraft_type VARCHAR (20) NOT NULL,"
                        + " station_id INT NOT NULL,"
                        + " max_speed INT NOT NULL,"
                        + " max_altitude INT NOT NULL,"
                        + " total_flight_hours INT NOT NULL,"
                        + " maintenance_flag BOOLEAN NOT NULL,"
                        + " current_maintenance_hours INT NOT NULL,"
                        + " maintenance_hours_threshold INT NOT NULL,"
                        + " end_of_service_date DATE) ");
                System.out.println("AIRCRAFT table created.");
                //Insert rows of sample data into the table
                try {
                    Statement insertStatement = conn.createStatement();
                    insertStatement.executeUpdate("INSERT INTO aircraft"
                            + "(tail_number,"
                            + " aircraft_type,"
                            + " station_id,"
                            + " max_speed,"
                            + " max_altitude,"
                            + " total_flight_hours,"
                            + " maintenance_flag,"
                            + " current_maintenance_hours,"
                            + " maintenance_hours_threshold,"
                            + " end_of_service_date)"
                            + "VALUES"
                            + "('N7256N','Rotary Wing',1,130,15000,143000,false,3400,1000,NULL),"
                            + "('N6507R','Fixed Wing',1,174,18000,57000,false,56000,1000,NULL),"
                            + "('N7255N','Rotary Wing',1,130,15000,3400,false,3400,1000,NULL),"
                            + "('N6506R','Fixed Wing',1,174,18000,56000,false,56000,1000,NULL),"
                            + "('N7166P','UAV',2,260,26000,802,false,802,1000,NULL),"
                            + "('N3707R','Rotary Wing',2,150,20000,76621,false,76621,1000,NULL),"
                            + "('N8877N','Rotary Wing',3,130,15000,47558,false,47558,1000,NULL),"
                            + "('N4900P','Fixed Wing',3,270,31000,60783,false,60783,1000,NULL),"
                            + "('N1010N','Fixed Wing',4,174,18000,14825,false,14825,1000,NULL),"
                            + "('N2233R','Fixed Wing',4,270,31000,76483,false,76483,1000,'2017-02-21'),"
                            + "('N4576P','Fixed Wing',5,270,31000,11482,false,11482,1000,NULL),"
                            + "('N4398N','Rotary Wing',5,130,15000,67004,false,67004,1000,NULL),"
                            + "('N0987P','Rotary Wing',6,130,15000,66015,false,66015,1000,NULL),"
                            + "('N0789R','Rotary Wing',6,130,15000,13396,false,13396,1000,NULL),"
                            + "('N6671P','UAV',7,260,26000,45621,false,45621,1000,NULL),"
                            + "('N6681P','Rotary Wing',7,150,20000,27226,false,27226,1000,NULL),"
                            + "('N7781R','Rotary Wing',8,130,15000,30882,false,30882,1000,NULL),"
                            + "('N8778R','Rotary Wing',8,130,15000,27460,false,27460,1000,NULL),"
                            + "('N0980N','Fixed Wing',9,270,31000,85011,true,85011,1000,NULL),"
                            + "('N0190N','Fixed Wing',9,174,18000,41595,false,41595,1000,NULL),"
                            + "('N8801R','Fixed Wing',10,270,31000,7970,false,7970,1000,NULL),"
                            + "('N8903R','Rotary Wing',10,150,20000,26626,false,26626,1000,NULL),"
                            + "('N4867N','Rotary Wing',12,130,15000,66574,false,66574,1000,NULL),"
                            + "('N4890N','Rotary Wing',12,150,20000,57092,true,57092,1000,NULL),"
                            + "('N3402N','Rotary Wing',13,130,15000,36019,false,36019,1000,NULL),"
                            + "('N4509P','UAV',13,260,26000,55067,false,55067,1000,NULL),"
                            + "('N3980R','Rotary Wing',14,130,15000,20460,false,20460,1000,NULL),"
                            + "('N3911R','Rotary Wing',14,150,20000,35623,false,35623,1000,NULL),"
                            + "('N2497N','Fixed Wing',15,270,31000,71015,false,71015,1000,NULL),"
                            + "('N2587N','Fixed Wing',15,174,18000,30380,false,30380,1000,NULL),"
                            + "('N0989R','Fixed Wing',16,270,31000,67776,true,67776,1000,NULL),"
                            + "('N0667P','Rotary Wing',16,130,15000,7302,false,7302,1000,NULL),"
                            + "('N0898N','Rotary Wing',17,150,20000,70630,false,70630,1000,NULL),"
                            + "('N2121N','Fixed Wing',17,130,15000,14535,false,14535,1000,NULL)");
                    System.out.println("AIRCRAFT inserted");
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "CreateAircraftTable Database Error: " + e,
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "CreateAircraftTable Database Error: " + e,
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

}