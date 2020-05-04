package com.cd826dong.clouddemo.baihui.api;

import com.cd826dong.clouddemo.baihui.dto.ErShouHouseDTO;
import com.cd826dong.clouddemo.baihui.entity.ErShouHouse;
import com.cd826dong.clouddemo.baihui.repository.ErShouRepository;
import com.cd826dong.clouddemo.baihui.service.HouseSaleService;
import com.cd826dong.clouddemo.product.dto.ProductCommentDto;
import com.cd826dong.clouddemo.product.dto.ProductDto;
import com.cd826dong.clouddemo.user.dto.UserDto;
import com.cd826dong.clouddemo.product.entity.Product;
import com.cd826dong.clouddemo.product.entity.ProductComment;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 产品管理的Endpoint
 *
 * @author CD826
 * @since 1.0.0
 */
@RestController
@RequestMapping("/api")
@Api(tags = "ershou", description = "二手交易房源查询")
public class Baihui {
    @Autowired
    private HouseSaleService houseSaleService;
    @Autowired
    private ErShouRepository erShouRepository;

    /**
     * 获取产品信息列表
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "获取商品分页数据", notes = "获取商品分页数据", httpMethod = "GET",tags = "ershou")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "第几页，从0开始，默认为第0页", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "size", value = "每一页记录数的大小，默认为20", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "sort", value = "排序，格式为:property,property(,ASC|DESC)的方式组织，如sort=firstname&sort=lastname,desc", dataType = "String", paramType = "query")
    })
    public List<ErShouHouseDTO> list(Pageable pageable) {
        Page<ErShouHouse> page = this.houseSaleService.getPage(pageable);
        if (null != page) {
            return page.getContent().stream().map((erShouHouse) -> {
                return new ErShouHouseDTO(erShouHouse);
            }).collect(Collectors.toList());
        }
        return Collections.EMPTY_LIST;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ApiOperation(value = "获取二手房详情数据", notes = "获取二手房详情数据", httpMethod = "GET", tags = "ershou")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "商品的主键", dataType = "int", paramType = "path")
    })
    public ErShouHouseDTO detail(@PathVariable Long id){
        ErShouHouse erShouHouse = this.houseSaleService.load(id);
        if (null == erShouHouse)
            return null;
        return new ErShouHouseDTO(erShouHouse);
    }


}

