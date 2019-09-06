package com.excel.service;

import com.excel.entity.User;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author: zty
 * @date 2019/9/5 下午12:01
 * des:
 */
public interface UserService {

    /**
     * 插入
     */
    int insert(User user);

    /**
     * 读取excel文件
     */
    String readExcelFile(MultipartFile file);
}
