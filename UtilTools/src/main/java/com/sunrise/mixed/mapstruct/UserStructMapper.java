package com.sunrise.mixed.mapstruct;

import com.sunrise.mixed.dto.UserDTO;
import com.sunrise.mixed.vo.UserVo;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 * user struct map.
 *
 * @author yz
 * @since : 1.0 2024/7/18
 **/
@Mapper
public interface UserStructMapper {
    UserStructMapper INSTANCE = Mappers.getMapper(UserStructMapper.class);

    @Mapping(source = "birthday", target = "birthday", dateFormat = "yyyy-MM-dd")
    UserVo dtoToUserVo(UserDTO userDTO);

    @Mapping(source = "birthday", target = "birthday", dateFormat = "yyyy-MM-dd")
    void toUserVo(@MappingTarget UserVo vo, UserDTO userDTO);
}
