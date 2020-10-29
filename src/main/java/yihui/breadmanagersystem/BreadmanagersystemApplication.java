package yihui.breadmanagersystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("yihui.breadmanagersystem.mapper")
public class BreadmanagersystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(BreadmanagersystemApplication.class, args);
    }
}
