/** **********
 *
 *      Class:         CreateMissionsTable.java
 *      Package:       util
 *      Date:          October 14, 2018
 *
 *      Course: UMUC CMSC 495 6381
 *      Group A Members: John Tamer, Jason Grimard, Demetrius Billups, & Emily Hoppe
 *
 *      Class Description: CreateMissionsTable is a static utility class that is
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

public class CreateMissionsTable {

    public static void main(String args[]) {
        final String CONNECTION = "jdbc:derby:FlightHours;create=true";
        boolean okayToCreate = false;

        try {
            Connection conn = DriverManager.getConnection(CONNECTION);
            Statement s = conn.createStatement();
            s.execute("SELECT '1' FROM MISSIONS");
        } catch (SQLException sqle) {
            String theError = (sqle).getSQLState();
            if (theError.equals("42X05")) // Table does not exist
            {
                okayToCreate = true;
            } else {
                JOptionPane.showMessageDialog(null, "Database Error: " + theError,
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (okayToCreate) {
            try (Connection conn = DriverManager.getConnection(CONNECTION);
                    Statement statement = conn.createStatement()) {
                statement.executeUpdate("CREATE TABLE MISSIONS ( "
                        + " MISSION_ID INT NOT NULL GENERATED ALWAYS AS IDENTITY, "
                        + " MISSION_NAME VARCHAR (50) NOT NULL)");
                System.out.println("MISSIONS table created.");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Database Error: " + e,
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        try (Connection conn = DriverManager.getConnection(CONNECTION);
                Statement statement = conn.createStatement()) {
            statement.executeUpdate("INSERT INTO MISSIONS (MISSION_NAME) VALUES "
                    + "('Interdiction'), "
                    + "('Surveillance'), "
                    + "('Intelligence'), "
                    + "('Tactical Ops'), "
                    + "('Transport'), "
                    + "('Search and Rescue'), "
                    + "('Disaster Relief') ");
            System.out.println("Missions inserted");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Error: " + e,
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

}
