package cn.com.njit.wd.api.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wangdi on 2017/5/4.
 */
public class CartResDTO implements Serializable{

    private static final long serialVersionUID = -4155258017738531194L;

    private List<CartDTO> cartDTOS;

    private int count;

    public List<CartDTO> getCartDTOS() {
        return cartDTOS;
    }

    public void setCartDTOS(List<CartDTO> cartDTOS) {
        this.cartDTOS = cartDTOS;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
