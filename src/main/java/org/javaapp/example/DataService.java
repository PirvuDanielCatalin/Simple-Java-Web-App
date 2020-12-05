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
        String queryFilter = "";

        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url, user, password);

            if (type.equals("Cloud Providers")) {
                queryFilter = "CP";
            } else if (type.equals("Shells")) {
                queryFilter = "SH";
            }

            PreparedStatement pst = con.prepareStatement("SELECT * FROM examples WHERE name = '" + queryFilter + "'");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                data.add(rs.getString("value"));
            }

        } catch (Exception ex) {
            Logger lgr = Logger.getLogger(DataService.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
            errorMessage = ex.getMessage();
        }

        if (data.isEmpty()) {
            data.add("Error");
            data.add(errorMessage);
        }

        return data;
    }
}
