package com.yangtzelsl;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class SpringbootLogApplication {

    public static void main(String[] args) {

        // 日志用法
        log.info("这是我的测试方法，不需要定义Logger属性，即可输出日志文件");

        SpringApplication.run(SpringbootLogApplication.class, args);
    }

}
