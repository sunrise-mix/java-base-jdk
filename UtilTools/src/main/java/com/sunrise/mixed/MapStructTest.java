package com.sunrise.mixed;

import com.sunrise.mixed.dto.UserDTO;
import com.sunrise.mixed.mapstruct.UserStructMapper;
import com.sunrise.mixed.vo.UserVo;

import java.util.Date;

/**
 * mapstruct test.
 *
 * @author yz
 * @since : 1.0 2024/7/18
 **/
public class MapStructTest {
    public static void main(String[] args) {
        System.out.println("hello");
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername("sunrise");
        userDTO.setAge(18);
        userDTO.setBirthday(new Date());
        System.out.println(userDTO);
        UserVo userVo = new UserVo();
        UserStructMapper.INSTANCE.toUserVo(userVo, userDTO);

        //UserVo userVo = UserStructMapper.INSTANCE.dtoToUserVo( userDTO);
        System.out.println(userVo);
    }
}
