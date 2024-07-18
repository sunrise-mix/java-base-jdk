package com.sunrise.mixed.vo;

import lombok.Data;

import java.util.Date;

/**
 * user dto.
 *
 * @author yz
 * @since : 1.0 2024/7/18
 **/
@Data
public class UserVo {
    private String username;
    private Integer age;
    private String birthday;
}
