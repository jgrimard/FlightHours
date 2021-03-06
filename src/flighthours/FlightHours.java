/** **********
 *
 *      Class:         FlightHours.java
 *      Package:       flighthours
 *      Date:          October 14, 2018
 *
 *      Course: UMUC CMSC 495 6381
 *      Group A Members: John Tamer, Jason Grimard, Demetrius Billups, & Emily Hoppe
 *
 *      Class Description: FlightHours contains the main method of the FHS
 *              application.  It first creates the database and tables and loads
 *              the tables with sample data.  It then starts the GUI using the
 *              SwingUtilities.invokeLater method which prevents any visible lag
 *              in the GUI when background tasks are processing.
 *
 *
 *********** */
package flighthours;

import java.sql.DriverManager;
import java.sql.SQLException;
import javafx.scene.control.Button;
import javax.swing.JOptionPane;
import view.MainStage;

public class FlightHours {

    Button button;

    public static void main(String[] args) {
        //Welcome message for our Dev team
        System.out.println("Hello Team!");
        System.out.println("Welcome to CMSC495 FlightHours!");
        if (testDatabaseConnection()) {
            System.out.println("Database connection successful");
            //Only continue if database connection is available
            createTables();
            //Start JavaFX GUI applicaiton
            MainStage.run();
        }
    }

    //Test database connection
    private static boolean testDatabaseConnection() {
        final String CONNECTION = "jdbc:derby:FlightHours;create=true";

        try {
            DriverManager.getConnection(CONNECTION);
        } catch (SQLException sqle) {
            {
                JOptionPane.showMessageDialog(null, "Database connection error.\n"
                        + "Please only open one instance of this application at a time.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }

    //Create tables and insert sample data
    private static void createTables() {
        util.CreateMissionsTable.createTable();
        util.CreateStationsTable.createTable();
        util.CreateAircraftTable.createTable();
        util.CreateOperationsTable.createTable();
        util.CreateMaintenanceTable.createTable();
    }

}
