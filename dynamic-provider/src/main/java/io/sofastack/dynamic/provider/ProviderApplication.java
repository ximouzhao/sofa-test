package io.sofastack.dynamic.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

/**
 * dynamic-provider 启动类
 *
 * @author caojie.cj@antfin.com
 * @since 2020/2/11
 */
@SpringBootApplication
@ComponentScan({"com.mm.test","io.sofastack.dynamic.provider"})
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
