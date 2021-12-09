package javaBasic.example.restApi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
@Configuration
@ConfigurationProperties(prefix = "spring")
public class DataConfig {
    private Datasource datasource;
//    private String dataSource;
//
//    public String getDataSource() {
//        return dataSource;
//    }
//
    public void setDatasource(Datasource datasource){
        this.datasource=datasource;
    }
    public Datasource getDatasource() {
        return datasource;
    }
//
//    public void setDatasource(Datasource datasource) {
//        this.datasource = datasource;
//    }
}
