package com.cd826dong.clouddemo.user.api;

import com.cd826dong.clouddemo.user.entity.User;
import com.cd826dong.clouddemo.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/chen")
@RestController
@Api(tags = "test")
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ApiOperation(tags = "test",value = "返回一个用户",httpMethod = "GET",notes = "just a test")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "id",value = "用户id",dataType = "int",paramType = "path")
    )
    public User getTest(@PathVariable int id){
        User user=userService.load((long)id);
        return user;
    }
}
