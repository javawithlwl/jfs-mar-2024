package com.careerit.ljdbc;
import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

@Slf4j
public final class ConnectionUtil {

    private static Properties properties;
    private ConnectionUtil() {
    }

    static {
        properties = new Properties();
        try {
            properties.load(ConnectionUtil.class.getResourceAsStream("/db.properties"));
        } catch (Exception e) {
            log.error("Error while loading properties file : ", e);
        }
    }

    public static Connection getConnection() {
        String url = properties.getProperty("db.url");
        String username = properties.getProperty("db.username");
        String password = properties.getProperty("db.password");
        try{
            return DriverManager.getConnection(url, username, password);
        }catch (SQLException e){
            log.error("Error while creating connection : ", e);
        }
        throw new RuntimeException("Connection not created");
    }

    public static void close(AutoCloseable... closeables) {

        for (AutoCloseable closeable : closeables) {
            try {
                if (closeable != null) {
                    closeable.close();
                }
            } catch (Exception e) {
                log.error("Error while closing : ", e);
            }
        }

    }
}
