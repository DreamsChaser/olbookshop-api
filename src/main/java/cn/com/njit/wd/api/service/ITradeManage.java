package cn.com.njit.wd.api.service;

import cn.com.njit.wd.api.dto.BookResDTO;
import cn.com.njit.wd.api.dto.TradeInfoDTO;
import cn.com.njit.wd.api.dto.TradeInfoResDTO;

/**
 * Created by wangdi on 2017/5/16.
 */
public interface ITradeManage {

    /**
     * 新增交易信息
     * @param tradeInfoDTO
     */
    void addTradeInfo(TradeInfoDTO tradeInfoDTO);

    /**
     * 分页查询交易信息
     * @param tradeInfoDTO
     * @return
     */
    TradeInfoResDTO queryByPage(TradeInfoDTO tradeInfoDTO);
}
