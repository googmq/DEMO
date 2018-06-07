package cn.minqi.consumer.majorService;

import cn.minqi.consumer.entity.Goods;
import cn.minqi.consumer.model.BaseResponse;
import cn.minqi.consumer.model.request.GoodsPageParam;
import cn.minqi.consumer.service.IGoodsService;
import com.baomidou.mybatisplus.plugins.Page;
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

    /**
     * 查一个
     * @param goods
     * @return
     */
    public BaseResponse majorQuery(Goods goods) {
        return iGoodsService.query(goods);
    }

    public Page majorPage(GoodsPageParam goods) {
        return iGoodsService.page(goods);
    }
}
