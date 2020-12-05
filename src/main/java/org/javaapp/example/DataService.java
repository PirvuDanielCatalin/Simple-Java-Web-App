package org.javaapp.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataService {
    public List getAvailableData(String type) {

        List data = new ArrayList<String>();

        String url = "jdbc:postgresql://jenkinsagentcloudcomputing.eastus.cloudapp.azure.com:5432/postgres";
        String user = "postgres";
        String password = "postgres";

        String errorMessage = "";

        try (Connection con = DriverManager.getConnection(url, user, password);
//             PreparedStatement pst = con.prepareStatement("SELECT * FROM examples WHERE lower(name) = '" + type.toLowerCase() + "'");
             PreparedStatement pst = con.prepareStatement("SELECT * FROM examples");
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                data.add("ABC");
                data.add(rs.getString("value"));
                data.add(errorMessage);
            }

        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(DataService.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
            errorMessage = ex.getMessage();
        }

        if (data.isEmpty()) {
            data.add("Eroare prinsa");
            data.add(errorMessage);
        }

        return data;
    }
}
