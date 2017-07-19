package cn.com.njit.wd.api.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wangdi on 2017/5/16.
 */
public class TradeInfoResDTO implements Serializable{

    private static final long serialVersionUID = -6664605295220730133L;

    private List<TradeInfoDTO> tradeInfoDTOList;

    private int count;

    public List<TradeInfoDTO> getTradeInfoDTOList() {
        return tradeInfoDTOList;
    }

    public void setTradeInfoDTOList(List<TradeInfoDTO> tradeInfoDTOList) {
        this.tradeInfoDTOList = tradeInfoDTOList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
