package cn.happy.service;

import cn.happy.annotation.CService;

@CService
public class TestServiceImpl implements ITestService {

    @Override
    public String listClassName() {

        // 假装来自数据库
        return "123456TestXServiceImpl";
    }
}
