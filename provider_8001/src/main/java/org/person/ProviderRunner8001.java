package org.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 启动类
 *
 * @author rainbowPerfect/RainbowPerfect
 * @version v1.0
 * @create 2021/1/19/0:15
 */
@SpringBootApplication
@EnableEurekaClient
public class ProviderRunner8001 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderRunner8001.class);
    }
}
