package cn.com.njit.wd.api.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wangdi on 2017/5/3.
 */
public class BookResDTO implements Serializable{

    private static final long serialVersionUID = 3198921915176041201L;

    private List<BookDTO> bookDTOList;

    private int count;

    public List<BookDTO> getBookDTOList() {
        return bookDTOList;
    }

    public void setBookDTOList(List<BookDTO> bookDTOList) {
        this.bookDTOList = bookDTOList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
