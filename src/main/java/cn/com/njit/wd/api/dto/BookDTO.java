package cn.com.njit.wd.api.dto;

import java.io.Serializable;

/**
 * Created by wangdi on 2017/5/3.
 */
public class BookDTO implements Serializable{

    private static final long serialVersionUID = 1631767404702112078L;

    private String bookId;

    private String bookName;

    private String bookPrice;

    private String bookSpePrice;

    private String bookNum;

    /**
     * 00-无活动，01-新品，02-促销，03-热卖
     */
    private String bookAct;

    private byte[] bookImg;

    private String bookDesc;

    private String bookMoreDesc;

    private int pageSize;

    private int curPage;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
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

    public String getBookNum() {
        return bookNum;
    }

    public void setBookNum(String bookNum) {
        this.bookNum = bookNum;
    }

    public String getBookAct() {
        return bookAct;
    }

    public void setBookAct(String bookAct) {
        this.bookAct = bookAct;
    }

    public byte[] getBookImg() {
        return bookImg;
    }

    public void setBookImg(byte[] bookImg) {
        this.bookImg = bookImg;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public String getBookDesc() {
        return bookDesc;
    }

    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc;
    }

    public String getBookMoreDesc() {
        return bookMoreDesc;
    }

    public void setBookMoreDesc(String bookMoreDesc) {
        this.bookMoreDesc = bookMoreDesc;
    }

    public String getBookSpePrice() {
        return bookSpePrice;
    }

    public void setBookSpePrice(String bookSpePrice) {
        this.bookSpePrice = bookSpePrice;
    }
}
