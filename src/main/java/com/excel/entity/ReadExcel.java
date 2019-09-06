package com.excel.entity;

import lombok.Data;

/**
 * @author: zty
 * @date 2019/9/5 下午12:19
 * des:
 */
@Data
public class ReadExcel {
    //总行数
    private int totalRows = 0;
    //总条数
    private int totalCells = 0;
    //错误信息收集
    private String errorMsg;
}
