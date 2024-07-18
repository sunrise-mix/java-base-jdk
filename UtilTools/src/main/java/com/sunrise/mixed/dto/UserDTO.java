package com.sunrise.mixed.dto;

import lombok.Data;

import java.util.Date;

/**
 * user dto.
 *
 * @author yz
 * @since : 1.0 2024/7/18
 **/
@Data
public class UserDTO {
    private String username;
    private Integer age;
    private Date birthday;
}
