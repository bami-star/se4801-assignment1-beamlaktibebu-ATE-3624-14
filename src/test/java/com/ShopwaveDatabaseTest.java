package com.shopwave_starter.model; 
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import javax.sql.DataSource;
import java.sql.Connection;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ActiveProfiles("test") 
public class ShopwaveDatabaseTest {

    @Autowired
    private DataSource dataSource;

    @Test
    void verifyShopwaveIsUsingDocker() throws Exception {
        try (Connection conn = dataSource.getConnection()) {
            String dbName = conn.getMetaData().getDatabaseProductName();
            
            System.out.println("------------------------------------------");
            System.out.println("BONUS CHECK - DATABASE: " + dbName);
            System.out.println("------------------------------------------");
            
            assertTrue(dbName.contains("PostgreSQL"), "Should be PostgreSQL from Docker!");
        }
    }
}