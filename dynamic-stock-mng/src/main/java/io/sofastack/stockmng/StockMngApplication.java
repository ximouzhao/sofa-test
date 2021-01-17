package io.sofastack.stockmng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * dynamic-stock-mng 启动类
 *
 * @author caojie.cj@antfin.com
 * @since 2020/2/11
 */
@ComponentScan({"com.mm.test","io.sofastack.stockmng"})
@SpringBootApplication
public class StockMngApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockMngApplication.class, args);
    }

}
