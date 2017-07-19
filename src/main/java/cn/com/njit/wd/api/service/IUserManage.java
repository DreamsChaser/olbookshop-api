package cn.com.njit.wd.api.service;

import cn.com.njit.wd.api.dto.UserDTO;

import java.util.List;

/**
 * Created by wangdi on 2017/3/20.
 */
public interface IUserManage {

    /**
     * 查询所有用户信息
     * @return
     */
    List<UserDTO> queryAll();

    /**
     * 插入用户信息
     * @param userDTO
     */
    UserDTO insert(UserDTO userDTO);

    /**
     * 判断用户名是否存在
     * @param userDTO
     * @return
     */
    boolean queryByName(UserDTO userDTO);

    /**
     * 查询单个用户（根据用户名密码）
     * @param userDTO
     * @return
     */
    UserDTO queryOne(UserDTO userDTO);

    /**
     * 根据id查询
     * @param userDTO
     * @return
     */
    UserDTO queryById(UserDTO userDTO);

    /**
     * 修改用户余额
     * @param userDTO
     */
    void updateUserBalance(UserDTO userDTO);

    /**
     * 根据用户Id修改用户信息
     * @param userDTO
     * @return
     */
    void updateUserInfoById(UserDTO userDTO);

    /**
     * 根据用户Id修改用户类型
     * @param userDTO
     */
    void updateUserTypeById(UserDTO userDTO);
}
