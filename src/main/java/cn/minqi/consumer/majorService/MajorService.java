package cn.minqi.consumer.majorService;

import cn.minqi.consumer.entity.Goods;
import cn.minqi.consumer.model.BaseResponse;
import cn.minqi.consumer.service.IGoodsService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
@NoArgsConstructor
public class MajorService {

    @Autowired
    private IGoodsService iGoodsService;

    public BaseResponse majorPass(Goods goods) {
        return iGoodsService.query(goods);
    }
}
