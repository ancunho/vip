package vip.ckbiz.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import vip.ckbiz.common.ServerResponse;
import vip.ckbiz.service.UserService;
import vip.ckbiz.vo.VIP_USER;

import java.util.List;

/**
 * Created by Ahn on 2017/11/14.
 */
@Repository
public class UserServiceImpl implements UserService {

    private SqlSession sqlSession;

    public ServerResponse<List<VIP_USER>> selectAllUsers() throws Exception {
        List<VIP_USER> lstAllUsers = sqlSession.selectList("VIP.USER.selectAllUsers");

        return ServerResponse.createBySuccess(lstAllUsers);
    }

    public SqlSession getSqlSession() {
        return sqlSession;
    }

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }


}
