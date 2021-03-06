package io.sofastack.stockmng.controller;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import io.sofastack.dynamic.facade.StrategyService;
import io.sofastack.dynamic.model.ProductInfo;
import io.sofastack.stockmng.data.DatabaseSeed;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * index controller
 *
 * @author caojie.cj@antfin.com
 * @since 2020/2/11
 */
@Controller
public class IndexController {
    @SofaReference
    private StrategyService strategyService;
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "test sucdess";
    }

    @RequestMapping("/index")
    public String index(Model model) {
        List<ProductInfo> list1=initProducts();
        List<ProductInfo> list2=strategyService.strategy(list1);
        model.addAttribute("productList", list2);
        return "index";
    }

    /**
     * 初始化默认展示列表,为了实验效果，此处初始化的列表与实际列表是相反的，但是实际排序结果与现场购买订单直接挂钩
     *
     * @return
     */
    private List<ProductInfo> initProducts() {
        List<ProductInfo> products = new ArrayList<>(5);
        for (int i = 4; i >= 0; i--) {
            ProductInfo productInfo = new ProductInfo();
            productInfo.setName(DatabaseSeed.name[i]);
            productInfo.setOrderCount(DatabaseSeed.orderCount[i]);
            productInfo.setSrc(DatabaseSeed.imageUrls[i]);
            productInfo.setAuthor(DatabaseSeed.authors[i]);
            products.add(productInfo);
        }
        return products;
    }
}
