package com.weego.main.controller;

import com.weego.main.dto.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.weego.main.service.BasePOIService;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/api/v3/city")
public class BasePOIController {

	private Logger logger = LogManager.getLogger(BasePOIController.class);
	@Autowired
	BasePOIService basePOIService;

	@RequestMapping(value = "/discovery", method = RequestMethod.GET)
	@ResponseBody
	public POIListDto getPOIList(@RequestParam("cityId") String cityId,
			@RequestParam("type") Integer type,
			@RequestParam("labelId") String labelId,
			@RequestParam("page") Integer page,
			@RequestParam("count") Integer count) {

		return basePOIService.getPOIsByCityId(cityId, type, labelId, page,
				count);
	}

	@RequestMapping(value = "/discovery/poi", method = RequestMethod.GET)
	@ResponseBody
	public POIDetailDto getPOIDetail(@RequestParam("id") String id,
			@RequestParam("type") Integer type,
		    @RequestParam("coordination") String coordination) {

		return basePOIService.getPOIDetailById(id, type, coordination);
	}

	@RequestMapping(value = "/discovery/specialList", method = RequestMethod.GET)
	@ResponseBody
	public POISpecialDto getPOISpecialList(@RequestParam("poiId") String poiId,
			@RequestParam("type") Integer type) {

		return basePOIService.getPOISpecialById(poiId, type);
	}

	@RequestMapping(value = "/discovery/specialDetail", method = RequestMethod.GET)
	@ResponseBody
	public POISpecialDetailDto getPOISpecialDetail(
			@RequestParam("specialId") String specialId,
			@RequestParam("type") Integer type) {

		return basePOIService.getPOISpecialDetailById(specialId, type);
	}

	@RequestMapping(value = "/discovery/comment", method = RequestMethod.GET)
	@ResponseBody
	public POICommentsDto getPOIComments(@RequestParam("poiId") String poiId,
			@RequestParam("type") Integer type) {

		return basePOIService.getPOICommentsById(poiId, type);
	}
	
	@RequestMapping(value = "/discovery/translate", method = RequestMethod.GET)
	@ResponseBody
	public POITranslationDto getPOITranslation(
			@RequestParam("content") String content,
			@RequestParam(value = "from", defaultValue = "en") String from,
			@RequestParam(value = "to", defaultValue = "zh") String to) {

		return basePOIService.getPOITranslation(content, from, to);
	}

	//Ray add POI基本信息
	@RequestMapping(value = "/discovery/specialdetail/{type}",method = RequestMethod.GET)
	public ModelAndView getPOIBaseDetail(@RequestParam("Id") String Id, @PathVariable("type") Integer type){
		logger.info("开始POI基本信息列表查询");
		logger.info("Id={}",Id,"type={}",type);

		POIBaseDetailDto POIBaseDetail = basePOIService.getPOIBaseDetail(Id,type);

		ModelAndView view = basePOIService.getPOIspecialDetailMv(type);
		view.addObject("POIdetail", POIBaseDetail);
		return view;
	}

}
