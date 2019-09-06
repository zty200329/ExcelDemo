package com.excel.controller;

import com.excel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: zty
 * @date 2019/9/5 下午1:08
 * des:
 */
@RestController
@RequestMapping(value = "/excel")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/upload")
    public String uploadExcel(@RequestParam(value = "file")MultipartFile file, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        String result = userService.readExcelFile(file);
        return result;
    }
}
