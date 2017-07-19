package cn.com.njit.wd.api.service;

import cn.com.njit.wd.api.dto.CartDTO;
import cn.com.njit.wd.api.dto.CartResDTO;

/**
 * Created by wangdi on 2017/5/4.
 */
public interface ICartManage {

    /**
     * 通过用户id查询购物车信息
     * @param cartDTO
     * @return
     */
    CartResDTO queryByUserId(CartDTO cartDTO);

    /**
     * 加入购物车
     * @param cartDTO
     */
    void addToCart(CartDTO cartDTO);

    /**
     * 购买后删除购物车
     * @param cartDTO
     */
    void deleteCart(CartDTO cartDTO);
}
