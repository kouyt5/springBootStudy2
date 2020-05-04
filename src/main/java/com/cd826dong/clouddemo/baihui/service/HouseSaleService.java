package com.cd826dong.clouddemo.baihui.service;

import com.cd826dong.clouddemo.baihui.entity.ErShouHouse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author 陈航
 */
public interface HouseSaleService {
    /**
     * 获取二手房的分页数据
     * @param pageable 分页参数
     * @return 分页数据
     */
    Page<ErShouHouse> getPage(Pageable pageable);

    /**
     * 加载指定的二手房
     * @param id 商品配置ID
     * @return
     */
    ErShouHouse load(Long id);
}
