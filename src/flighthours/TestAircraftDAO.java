/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flighthours;

/**
 *
 * @author jjtam
 */

import controller.AircraftDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import javax.swing.JTable;

public class TestAircraftDAO {
    private static String dbURL = "jdbc:derby:FlightHours";
    private static String tableName = "AIRCRAFT";

    private static Connection conn = null;
    private static AircraftDAO aircraftQueries;
    private static List<Aircraft> aircraftList;
    private static JTable aircraftTable;

    public static void main(String args[]) {
        int result;
        new TestAircraftDAO();
        try {
            conn = DriverManager.getConnection(dbURL);

        } catch (Exception except) {
            except.printStackTrace();
        }
        
        aircraftQueries = new AircraftDAO(conn);
        
        //aircraftTable = AircraftDAO.selectAllAircraft();
        
        String loc = "Laredo Air Branch";
        
        aircraftList = AircraftDAO.selectAircraftbyLocation(loc);
        
       
        System.out.println("Stop Here");

    }

}
