package com.cd826dong.clouddemo.baihui.repository;

import com.cd826dong.clouddemo.baihui.entity.ErShouHouse;
import com.cd826dong.clouddemo.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 二手房仓库
 * @author 陈航
 */
public interface ErShouRepository extends JpaRepository<ErShouHouse, Long> {

}
