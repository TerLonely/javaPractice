/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong.buliderPattern;

import lombok.Data;

/**
 * 建造者模式
 * @author 张琛栋
 * @data 2022/11/29 15:41
 */
@Data
public class Course {

    private String name;
    private String ppt;
    private String video;
    private String note;
    private String homeWork;

}
