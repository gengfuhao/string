package ltd.newbee.mall.newbeemall.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.IndexConfigMapper;
import ltd.newbee.mall.newbeemall.entity.IndexConfig;
import ltd.newbee.mall.newbeemall.service.NewBeeMallIndexConfigService;
import ltd.newbee.mall.newbeemall.entity.NewBeeMallGoods;

@Service
public class NewBeeMallIndexConfigServicelmpl implements NewBeeMallIndexConfigService {

	@Resource
    private IndexConfigMapper indexConfigMapper;

	@Override
//	public List<IndexConfig> getConfigGoodsesForIndex(int configType,int number) {
		public List<NewBeeMallGoods> getConfigGoodsesForIndex(int configType,int number) {

	 		List<IndexConfig> idxConfList = indexConfigMapper.findIndexConfigsByTypeAndNum(configType, number);

	 		List<Long> ids = new ArrayList<Long>();
	 		// List<IndexConfig> => List<Long>
	 		for(IndexConfig iConf : idxConfList) {
	 			ids.add(iConf.getGoodsId());
	 		}
		
		
//		return indexConfigMapper.findIndexConfigsByTypeAndNum(configType, number);
		return indexConfigMapper.selectByPrimaryKeys(ids);
	
	
	}

}