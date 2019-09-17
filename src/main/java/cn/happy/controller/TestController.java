package cn.happy.controller;

import cn.happy.annotation.CAutowired;
import cn.happy.annotation.CController;
import cn.happy.annotation.CRequestMapping;
import cn.happy.service.ITestService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p>
 * 前置控制器
 *
 * @author XiaoPengwei
 * @since 2019-07-19
 */
@CController
@CRequestMapping("/test")
public class TestController {

    @CAutowired
    ITestService testXService;

    /**
     * 测试方法 /test/query
     *
     * @param req  请求体
     * @param resp 响应体
     */
    @CRequestMapping("/query")
    public void query(HttpServletRequest req, HttpServletResponse resp) {

        if (req.getParameter("username") == null) {
            try {
                resp.getWriter().write("param username is null");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {

            String paramName = req.getParameter("username");
            try {
                resp.getWriter().write("param username is " + paramName);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("[INFO-req] New request param username-->" + paramName);
        }
    }

    /**
     * 测试方法 /test/listClassName
     *
     * @param req  请求体
     * @param resp 响应体
     */
    @CRequestMapping("/listClassName")
    public void listClassName(HttpServletRequest req, HttpServletResponse resp) {
        String str = testXService.listClassName();
        System.out.println("testXService----------=-=-=>" + str);
        try {
            resp.getWriter().write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
