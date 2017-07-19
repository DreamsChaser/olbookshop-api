package cn.com.njit.wd.api.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wangdi on 2017/5/17.
 */
public class NoticeResDTO implements Serializable{

    private static final long serialVersionUID = -8872885670796694284L;

    private List<NoticeDTO> noticeDTOList;

    private int count;

    public List<NoticeDTO> getNoticeDTOList() {
        return noticeDTOList;
    }

    public void setNoticeDTOList(List<NoticeDTO> noticeDTOList) {
        this.noticeDTOList = noticeDTOList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
