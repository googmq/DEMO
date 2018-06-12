package cn.minqi.consumer.web;

import cn.minqi.consumer.entity.Goods;
import cn.minqi.consumer.entity.User;
import cn.minqi.consumer.majorService.MajorService;
import cn.minqi.consumer.model.BaseResponse;
import cn.minqi.consumer.model.request.GoodsPageParam;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.plugins.Page;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
public class MajorController {

    private MajorService majorService;

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String query() {
        log.info("query入口");
        Goods goods = new Goods();
        goods.setId(1);
        BaseResponse response = majorService.majorQuery(goods);

        log.info("query返回 :" + JSONObject.toJSONString(response));
        goods = (Goods) response.getDataInfo();

        return "<h1>" + JSONObject.toJSONString(goods) + "</h1>";
    }

    @RequestMapping(value = "/queryPage", method = RequestMethod.GET)
    public String queryPage() {
        log.info("queryPage入口");
        GoodsPageParam goodsPageParam = new GoodsPageParam();
        goodsPageParam.setPageNumber(1);
        goodsPageParam.setPageSize(10);
        Page response = majorService.majorPage(goodsPageParam);

        log.info("queryPage返回 :" + JSONObject.toJSONString(response));

        return "<h1>" + JSONObject.toJSONString(response) + "</h1>";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public BaseResponse login(@RequestBody User user) {
        log.info("login入口");
        log.info("login入参 :" + JSONObject.toJSONString(user));
        BaseResponse response = majorService.userLogin(user);
        log.info("login返回 :" + JSONObject.toJSONString(response));
        return response;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public BaseResponse register(@RequestBody User user) {
        log.info("register入口");
        log.info("register入参 :" + JSONObject.toJSONString(user));
        BaseResponse response = majorService.register(user);
        log.info("register返回 :" + JSONObject.toJSONString(response));
        return response;
    }
}
