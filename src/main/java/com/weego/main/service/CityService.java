package com.weego.main.service;

import com.weego.main.dao.WeatherDao;
import com.weego.main.dto.CityHomeBaseInfoDto;
import com.weego.main.dto.CityHomeDto;
import com.weego.main.dto.CityHomeWeatherDto;
import com.weego.main.dto.CityListContinentDto;
import com.weego.main.model.Weather;

import java.util.List;

public interface CityService {

    CityHomeDto getCityHome(String cityId);

    List<CityListContinentDto> getOnlineCityList();

    CityHomeWeatherDto getCitHomeWeather(String cityId);

    WeatherDao setWeather(Weather wea, String cityId);
}
