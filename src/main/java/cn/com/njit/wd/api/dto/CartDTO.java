package cn.com.njit.wd.api.dto;

import java.io.Serializable;

/**
 * Created by wangdi on 2017/5/4.
 */
public class CartDTO implements Serializable{

    private static final long serialVersionUID = -4201700080031582004L;

    private String cartId;

    private String userId;

    private String bookId;

    private String bookName;

    private String bookPrice;

    private String cartPrice;

    private String bookNum;

    private int pageSize;

    private int currPage;

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getCartPrice() {
        return cartPrice;
    }

    public void setCartPrice(String cartPrice) {
        this.cartPrice = cartPrice;
    }

    public String getBookNum() {
        return bookNum;
    }

    public void setBookNum(String bookNum) {
        this.bookNum = bookNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }

    public CartDTO() {
    }

    public CartDTO(String cartId,String bookId, String bookName, String bookPrice, String cartPrice, String bookNum) {
        this.cartId = cartId;
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.cartPrice = cartPrice;
        this.bookNum = bookNum;
    }
}
