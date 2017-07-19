package cn.com.njit.wd.api.service;

import cn.com.njit.wd.api.dto.EmpDTO;
import cn.com.njit.wd.api.dto.UserDTO;

/**
 * Created by wangdi on 2017/3/29.
 */
public interface IEmpInfo {

    EmpDTO queryByName(String name);
    UserDTO save(EmpDTO empDTO);
}
