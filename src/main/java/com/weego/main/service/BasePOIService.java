package com.weego.main.service;

import com.weego.main.dto.*;
import org.springframework.web.servlet.ModelAndView;

public interface BasePOIService {
	POIListDto getPOIsByCityId(String cityId, Integer type, String labelId, 
							Integer page, Integer count);
	
	POIDetailDto getPOIDetailById(String id, Integer type, String coordination);
	
	POISpecialDto getPOISpecialById(String id, Integer type);
	
	POISpecialDetailDto getPOISpecialDetailById(String specialId, Integer type);
	
	POICommentsDto getPOICommentsById(String id, Integer type);
	
	POITranslationDto getPOITranslation(String content, String from, String to);

	//Ray add POI基本信息
	POIBaseDetailDto getPOIBaseDetail(String Id , Integer type);

	ModelAndView getPOIspecialDetailMv(Integer type);
}
