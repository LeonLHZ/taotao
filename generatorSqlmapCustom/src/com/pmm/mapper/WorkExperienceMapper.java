package com.pmm.mapper;

import com.pmm.pojo.WorkExperience;
import com.pmm.pojo.WorkExperienceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkExperienceMapper {
    int countByExample(WorkExperienceExample example);

    int deleteByExample(WorkExperienceExample example);

    int insert(WorkExperience record);

    int insertSelective(WorkExperience record);

    List<WorkExperience> selectByExampleWithBLOBs(WorkExperienceExample example);

    List<WorkExperience> selectByExample(WorkExperienceExample example);

    int updateByExampleSelective(@Param("record") WorkExperience record, @Param("example") WorkExperienceExample example);

    int updateByExampleWithBLOBs(@Param("record") WorkExperience record, @Param("example") WorkExperienceExample example);

    int updateByExample(@Param("record") WorkExperience record, @Param("example") WorkExperienceExample example);
}