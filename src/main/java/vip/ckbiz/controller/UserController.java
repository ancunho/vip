package vip.ckbiz.controller;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import vip.ckbiz.common.ServerResponse;
import vip.ckbiz.service.UserService;
import vip.ckbiz.vo.VIP_USER;

import java.util.List;
import java.util.Map;

/**
 * Created by Ahn on 2017/11/14.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public ServerResponse select_all_user() {
        Map<String, Object> returnMap = new HashedMap();
        try {
            ServerResponse lstAllUsers = userService.selectAllUsers();
        } catch (Exception e) {
            e.printStackTrace();
        }

//        return ServerResponse.createBySuccess(lstAllUsers);
        return null;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
