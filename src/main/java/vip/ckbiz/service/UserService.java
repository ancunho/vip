package vip.ckbiz.service;

import vip.ckbiz.common.ServerResponse;
import vip.ckbiz.vo.VIP_USER;

import java.util.List;

/**
 * Created by Ahn on 2017/11/14.
 */
public interface UserService {

    public ServerResponse<List<VIP_USER>> selectAllUsers() throws Exception;

}
