package org.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 7001启动类
 *
 * @author rainbowPerfect/RainbowPerfect
 * @version v1.0
 * @create 2021/2/4/23:27
 */

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaRunner7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaRunner7001.class);
    }
}
