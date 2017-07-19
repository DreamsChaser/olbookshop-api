package cn.com.njit.wd.api.service;

import cn.com.njit.wd.api.dto.BookDTO;
import cn.com.njit.wd.api.dto.BookResDTO;

import java.awt.print.Book;
import java.util.List;

/**
 * Created by wangdi on 2017/5/3.
 */
public interface IBookManage {

    /**
     * 添加书本
     * @param bookDTO
     */
    void addBook(BookDTO bookDTO);

    /**
     * 分页查询所有图书
     * @param bookDTO
     * @return
     */
    BookResDTO listAllBook(BookDTO bookDTO);

    /**
     * 通过id查询书本信息
     * @param bookDTO
     * @return
     */
    BookDTO getById(BookDTO bookDTO);

    /**
     * 根据类型分页查询
     * @param bookDTO
     * @return
     */
    BookResDTO findByAct(BookDTO bookDTO);

    /**
     * 修改书本
     * @param bookDTO
     */
    void updateBook(BookDTO bookDTO);

    /**
     * 结算时扣减书本数量
     * @param bookDTO
     */
    void decodeNumById(BookDTO bookDTO);

    /**
     * 删除书本
     * @param bookDTO
     */
    void deleteBook(BookDTO bookDTO);

    /**
     * 按书本名字模糊查询
     * @param bookDTO
     * @return
     */
    List<BookDTO> queryByName(BookDTO bookDTO);
}
