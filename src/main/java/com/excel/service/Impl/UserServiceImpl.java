package com.excel.service.Impl;

import com.excel.dao.UserMapper;
import com.excel.entity.User;
import com.excel.service.UserService;
import com.excel.util.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author: zty
 * @date 2019/9/5 下午12:06
 * des:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    /**
     * 文件导入
     * @param file
     * @return
     */
    @Override
    public String readExcelFile(MultipartFile file) {
        String result = "";
        ExcelUtil excelUtil = new ExcelUtil();
        List<User> ilist = excelUtil.getExcelInfo(file);
        if(ilist != null && !ilist.isEmpty()){
            //不为空 加入数据库
            for(User user :ilist){
                userMapper.insert(user);
            }
            result = "上传成功";
        }else{
            result = "上传失败";
        }
        return result;
    }
}
