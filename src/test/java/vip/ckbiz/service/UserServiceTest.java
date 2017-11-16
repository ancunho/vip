package vip.ckbiz.service;

import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import vip.ckbiz.TestBase;
import vip.ckbiz.common.ServerResponse;
import vip.ckbiz.vo.VIP_USER;

import java.util.List;

/**
 * Created by Ahn on 2017/11/16.
 */
public class UserServiceTest extends TestBase {

    @Autowired
    private UserService userService;

    @Autowired
    private SqlSession sqlSession;

    @Test
    public void selectAllUsers() throws Exception {
        PageInfo pageInfo = new PageInfo();
        List<VIP_USER> lstAllUsers = sqlSession.selectList("VIP.USER.selectAllUsers");
        System.out.println(">>>>>>" + lstAllUsers.size());
    }

}
