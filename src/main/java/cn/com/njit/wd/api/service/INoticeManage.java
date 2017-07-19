package cn.com.njit.wd.api.service;

import cn.com.njit.wd.api.dto.NoticeDTO;
import cn.com.njit.wd.api.dto.NoticeResDTO;

/**
 * Created by wangdi on 2017/5/17.
 */
public interface INoticeManage {

    /**
     * 新增公告
     * @param noticeDTO
     */
    void addNotice(NoticeDTO noticeDTO);

    /**
     * 分页查询公告信息
     * @param noticeDTO
     * @return
     */
    NoticeResDTO queryAll(NoticeDTO noticeDTO);

    /**
     * 根据id查询公告信息
     * @param noticeDTO
     * @return
     */
    NoticeDTO queryById(NoticeDTO noticeDTO);

    /**
     * 编辑公告
     * @param noticeDTO
     */
    void modifyNotice(NoticeDTO noticeDTO);

    /**
     * 删除公告
     * @param noticeDTO
     */
    void deleteNotice(NoticeDTO noticeDTO);
}
