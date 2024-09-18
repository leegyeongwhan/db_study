package db_study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("db_study.repository.mybatis")
public class DbStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbStudyApplication.class, args);
    }

}
