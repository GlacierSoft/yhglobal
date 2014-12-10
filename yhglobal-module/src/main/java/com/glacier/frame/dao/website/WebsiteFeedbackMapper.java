package com.glacier.frame.dao.website;

import com.glacier.frame.entity.website.WebsiteFeedback;
import com.glacier.frame.entity.website.WebsiteFeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebsiteFeedbackMapper {
    int countByExample(WebsiteFeedbackExample example);

    int deleteByExample(WebsiteFeedbackExample example);

    int deleteByPrimaryKey(String webFdbId);

    int insert(WebsiteFeedback record);

    int insertSelective(WebsiteFeedback record);

    List<WebsiteFeedback> selectByExampleWithBLOBs(WebsiteFeedbackExample example);

    List<WebsiteFeedback> selectByExample(WebsiteFeedbackExample example);

    WebsiteFeedback selectByPrimaryKey(String webFdbId);

    int updateByExampleSelective(@Param("record") WebsiteFeedback record, @Param("example") WebsiteFeedbackExample example);

    int updateByExampleWithBLOBs(@Param("record") WebsiteFeedback record, @Param("example") WebsiteFeedbackExample example);

    int updateByExample(@Param("record") WebsiteFeedback record, @Param("example") WebsiteFeedbackExample example);

    int updateByPrimaryKeySelective(WebsiteFeedback record);

    int updateByPrimaryKeyWithBLOBs(WebsiteFeedback record);

    int updateByPrimaryKey(WebsiteFeedback record);
}