package com.weego.main.controller;

import com.weego.main.constant.ErrorCode;
import com.weego.main.dto.CityHomeDto;
import com.weego.main.dto.CityHomeWeatherDto;
import com.weego.main.dto.CityListContinentDto;
import com.weego.main.dto.ResponseDto;
import com.weego.main.dao.WeatherDao;
import com.weego.main.model.City;
import com.weego.main.model.Weather;
import com.weego.main.service.CityService;
import com.weego.main.service.PgcService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v3/city")
public class CityController {
    private static Logger logger = LogManager.getLogger(CityController.class);

    @Autowired
    CityService cityService;

    @Autowired
    PgcService pgcService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    @ResponseBody
    public ResponseDto<CityHomeDto> getCityHome(@RequestParam("cityId") String cityId) {
        logger.info("cityId=[{}]", cityId);

        ResponseDto<CityHomeDto> responseDto = new ResponseDto<>();
        CityHomeDto cityHomeDto = cityService.getCityHome(cityId);

        if (cityHomeDto == null) {
            responseDto.setCodeMessage(ErrorCode.SERVICE_BLANK);
            logger.fatal("城市首页数据为空");
        } else {
            responseDto.setCodeMessage(ErrorCode.SUCCESS);
            responseDto.setData(cityHomeDto);
        }

        return responseDto;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public ResponseDto<List<CityListContinentDto>> getCityList() {
        logger.info("user={}", "test");

        ResponseDto<List<CityListContinentDto>> responseDto = new ResponseDto<>();
        List<CityListContinentDto> cityListContinentDtoList = cityService.getOnlineCityList();

        if (cityListContinentDtoList.size() == 0) {
            responseDto.setCodeMessage(ErrorCode.SERVICE_BLANK);
            logger.fatal("城市列表数据为空");

        } else {
            responseDto.setCodeMessage(ErrorCode.SUCCESS);
            responseDto.setData(cityListContinentDtoList);
        }

        return responseDto;
    }

    @RequestMapping(value = "/weather", method = RequestMethod.GET)
    @ResponseBody
    public ResponseDto<CityHomeWeatherDto> getCitHomeWeather(@RequestParam("cityId") String cityId){
        logger.info("cityId=[{}]",cityId);

        ResponseDto<CityHomeWeatherDto> responseDto = new ResponseDto<>();
        CityHomeWeatherDto cityHomeWeatherDto = cityService.getCitHomeWeather(cityId);

        if(cityHomeWeatherDto == null){
            responseDto.setCodeMessage(ErrorCode.SERVICE_BLANK);
            logger.fatal("城市天气数据为空");
        } else {
            responseDto.setCodeMessage(ErrorCode.SUCCESS);
            responseDto.setData(cityHomeWeatherDto);
        }

        return responseDto;
    }

    @RequestMapping(value = "/postweather" , method = RequestMethod.POST)
    @ResponseBody
    public ResponseDto<WeatherDao> setWeatherDao(@RequestParam("cityId") String cityId,@ModelAttribute("wea") Weather wea){
        logger.info("cityIdpost=[{}]",cityId);
        System.out.println(wea.getDate());
        ResponseDto<WeatherDao> responseDto = new ResponseDto<>();
        WeatherDao setWeatherDao = cityService.setWeather(wea ,cityId);
        logger.info("setWeatherDao=[{}]",setWeatherDao);

        if(setWeatherDao == null){
            responseDto.setCodeMessage(ErrorCode.SERVICE_BLANK);
            logger.fatal("插入数据为空");
        } else {
            responseDto.setCodeMessage(ErrorCode.SUCCESS);
            responseDto.setData(setWeatherDao);
        }

        return responseDto;

    }

}
