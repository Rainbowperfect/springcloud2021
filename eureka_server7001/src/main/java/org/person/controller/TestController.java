package org.person.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Retention;

/**
 * 测试启动类
 *
 * @author rainbowPerfect/RainbowPerfect
 * @version v1.0
 * @create 2021/3/10/1:27
 */
@RestController
@RefreshScope   // 支持nacos的动态刷新
public class TestController {
    @Value("${server.port}")
    private String serPort;

    // @Value("${}")
    // private String configInfo;

    @GetMapping(value = "/nacos/{id}")
    public String getSerPort(@PathVariable("id") Integer id){
        return "返回信息"+serPort+"==="+id;
    }
    //
    // @GetMapping("/config/info")
    // public String getConfigInfo() {
    //     return configInfo;
    // }
}
