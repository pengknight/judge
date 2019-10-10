package cn.pengknight.judge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class JudgeApplication {

    public static void main(String[] args) {
        SpringApplication.run(JudgeApplication.class, args);
    }

}
