package vip.ckbiz.controller;

import org.apache.commons.collections.map.HashedMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import vip.ckbiz.common.ServerResponse;
import vip.ckbiz.service.UserService;
import vip.ckbiz.vo.VIP_USER;

import java.util.List;
import java.util.Map;

/**
 * Created by Ahn on 2017/11/14.
 */
@Controller
@RequestMapping(value = "/customer/")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "get_all_user.do")
    @ResponseBody
    public ServerResponse select_all_user() {
        logger.debug("asdfasdf");
        ServerResponse<List<VIP_USER>> lstAllUsers = null;
        System.out.println(">>>>>>>>>>>>>>>>>>>>>");
        try {
            lstAllUsers = userService.selectAllUsers();
            return ServerResponse.createBySuccess(lstAllUsers);
        } catch (Exception e) {
            logger.error("用户查询错误");
            e.printStackTrace();
            return ServerResponse.createByErrorMessage("网络出错");
        }

    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
