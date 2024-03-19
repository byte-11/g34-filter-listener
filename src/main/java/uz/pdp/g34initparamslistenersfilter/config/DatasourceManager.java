package uz.pdp.g34initparamslistenersfilter.config;

import lombok.RequiredArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@RequiredArgsConstructor
public class DatasourceManager {
    private final String username;
    private final String url;
    private final String password;

    public Connection connection(){
        try {
            return DriverManager.getConnection(
                    url,
                    username,
                    password
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
