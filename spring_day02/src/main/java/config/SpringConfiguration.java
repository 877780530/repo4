package config;

import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.itheima")
@Import(JdbcConfig.class)
public class SpringConfiguration {
    @Bean(name="runner")
    public QueryRunner getQueryRunner(DataSource dataSource){
        return new QueryRunner(dataSource);
    }
}
