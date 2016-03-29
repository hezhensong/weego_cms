package com.weego.main.service;

import com.weego.main.dto.ActivityBaseDto;
import com.weego.main.dto.ActivityDetailDto;

import java.util.List;

import com.weego.main.model.Activity;
import org.springframework.web.servlet.ModelAndView;

public interface ActivityService {

    ActivityDetailDto getActivityDetail(String cityActivityId);

    List<ActivityBaseDto> getActivityList(String cityId);

    ActivityBaseDto delActivityBase(String cityBaseId);

    ActivityDetailDto setActivityDetail(Activity setCityActivity ,String cityId);

    ActivityBaseDto getActivityBase(String cityBaseId);

     ModelAndView getSpecifiedActivity(String activityId);

    ModelAndView getActivity();

}
