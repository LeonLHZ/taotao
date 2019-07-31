package com.pmm.mapper;

import com.pmm.pojo.PersonalMessages;
import com.pmm.pojo.PersonalMessagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonalMessagesMapper {
    int countByExample(PersonalMessagesExample example);

    int deleteByExample(PersonalMessagesExample example);

    int insert(PersonalMessages record);

    int insertSelective(PersonalMessages record);

    List<PersonalMessages> selectByExample(PersonalMessagesExample example);

    int updateByExampleSelective(@Param("record") PersonalMessages record, @Param("example") PersonalMessagesExample example);

    int updateByExample(@Param("record") PersonalMessages record, @Param("example") PersonalMessagesExample example);
}