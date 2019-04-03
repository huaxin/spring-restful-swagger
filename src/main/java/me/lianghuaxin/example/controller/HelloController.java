package me.lianghuaxin.example.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @ApiOperation(value="程序首页接口", notes="")
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello world";
    }

    @ApiOperation(value="获取用户", notes="根据url的userName来获取用户详细信息")
    @ApiImplicitParam(name = "userName", value = "用户姓名", required = true, dataType = "String", paramType = "path")
    @RequestMapping(value="/hello/{userName:.+}", method=RequestMethod.GET)
    public String getUser(@PathVariable String userName) {
        return "Hello "+userName;
    }
}
