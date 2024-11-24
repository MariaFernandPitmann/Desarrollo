package pe.edu.i202224467.conexiondegestion.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConexionesConfig {

    @Value("${DB_WORLD_URL}")
    private String dbWORLDUrl;
    @Value("${DB_WORLD_USER}")
    private String dbWORLDUser;
    @Value("${DB_WORLD_PASS}")
    private String dbWORLDPass;
    @Value("${DB_WORLD_DRIVER}")
    private String dbWORLDDriver;

    @Bean
    public HikariDataSource hikariDataSource() {

        HikariConfig config = new HikariConfig();

        /**
         * Configurar propiedad de conexion a BD
         */
        config.setJdbcUrl(dbWORLDUrl);
        config.setUsername(dbWORLDUser);
        config.setPassword(dbWORLDPass);
        config.setDriverClassName(dbWORLDDriver);

        /**
         * Configurar propiedades del pool de HikariCP
         * - MaximumPoolSize: Máximo # de conexiones del pool.
         * - MinimumIdle: Mínimo # de conexiones inactivas del pool.
         * - IdleTimeout: Tiempo máximo de espera par
         *      para conectarse a la BD.
         */
        config.setMaximumPoolSize(30);
        config.setMinimumIdle(4);
        config.setIdleTimeout(400000);
        config.setConnectionTimeout(45000);

        System.out.println("###### HikariCP initialized ######");
        return new HikariDataSource(config);

    }

}

