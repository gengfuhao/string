package ltd.newbee.mall.newbeemall.service;

import java.util.List;


import ltd.newbee.mall.newbeemall.entity.IndexConfig;
import ltd.newbee.mall.newbeemall.entity.NewBeeMallGoods;
public interface NewBeeMallIndexConfigService {
//	List<IndexConfig> getConfigGoodsesForIndex(int configType ,int number);
	List<NewBeeMallGoods> getConfigGoodsesForIndex(int configType ,int number);
}