package com.yaozhou.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by WXHang on HANG at 2021/6/17 15:40
 * Desc：
 * @author
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class People {
    private int id;
    private String name;
    private int age;
    private String address;
}
