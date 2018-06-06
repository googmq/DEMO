package cn.minqi.consumer.web;

import cn.minqi.consumer.entity.Goods;
import cn.minqi.consumer.majorService.MajorService;
import cn.minqi.consumer.model.BaseResponse;
import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
public class MajorController {

    private MajorService majorService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        log.info("home入口" );
        return "index";
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String query() {
        log.info("query入口" );
        Goods goods = new Goods();
        goods.setId(1);
        BaseResponse response = majorService.majorPass(goods);

        log.info("query返回 :"+ JSONObject.toJSONString(response));
        goods = (Goods)response.getDataInfo();
        return goods.getUrl();
    }
}
