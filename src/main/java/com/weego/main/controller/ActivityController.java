package com.weego.main.controller;

import com.weego.main.constant.ErrorCode;
import com.weego.main.dto.ActivityBaseDto;
import com.weego.main.dto.ActivityDetailDto;
import com.weego.main.dto.ResponseDto;
import com.weego.main.model.Activity;
import com.weego.main.service.ActivityService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/api/v3/city")
public class ActivityController {
    private Logger logger = LogManager.getLogger(ActivityController.class);

    @Autowired
    private ActivityService cityActivityService;

    @RequestMapping(value = "/activity/list", method = RequestMethod.GET)
    @ResponseBody
    public ResponseDto<List<ActivityBaseDto>> getActivityList(@RequestParam("cityId") String cityId) {

        logger.info("开始城市活动列表查询");
        logger.info("cityId = {}", cityId);
        List<ActivityBaseDto> activityBaseList = cityActivityService.getActivityList(cityId);

        logger.info("结束城市活动列表查询");
        ResponseDto<List<ActivityBaseDto>> responseDto = new ResponseDto<>();
        if (activityBaseList != null && activityBaseList.size() > 0) {
            responseDto.setCodeMessage(ErrorCode.SUCCESS);
            responseDto.setData(activityBaseList);
        } else {
            responseDto.setCodeMessage(ErrorCode.SERVICE_BLANK);
            logger.fatal("城市活动列表数据为空");
        }

        return responseDto;
    }

    @RequestMapping(value = "/activity/list/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseDto<ActivityBaseDto> delActivityList(@RequestParam("cityId") String cityId){
        logger.info("开始删除城市活动");
        logger.info("cityId = {}", cityId);
        ActivityBaseDto activityBaseList = cityActivityService.delActivityBase(cityId);

        ResponseDto<ActivityBaseDto> responseDto = new ResponseDto<>();
        if (activityBaseList == null){
            responseDto.setCodeMessage(ErrorCode.SUCCESS);
            responseDto.setData(activityBaseList);
        } else {
            responseDto.setCodeMessage(ErrorCode.SERVICE_BLANK);
            logger.fatal("城市活动数据删除失败");
        }
        return responseDto;
    }


    @RequestMapping(value = "/activity/list/post" , method = RequestMethod.POST)
    @ResponseBody
    public ResponseDto<ActivityDetailDto> setActivityDetail (@RequestParam("cityId") String cityId,Activity setCityActivity){

        logger.info("开始城市活动列表添加");
        logger.info("cityId = {}" , cityId);
        ActivityDetailDto activityDetailDto = cityActivityService.setActivityDetail(setCityActivity ,cityId);

        logger.info("结束城市活动列表查询");
        ResponseDto<ActivityDetailDto> responseDto = new ResponseDto<>();
        if (activityDetailDto != null){
            responseDto.setCodeMessage(ErrorCode.SUCCESS);
        } else {
            responseDto.setCodeMessage(ErrorCode.SERVICE_BLANK);
            logger.fatal("城市活动列表数据为空");
        }

        return responseDto;
    }

    @RequestMapping(value = "/activity", method = RequestMethod.GET)
    @ResponseBody
    public ResponseDto<ActivityDetailDto> getActivityDetail(@RequestParam("activityId") String activityId) {

        logger.info("开始城市活动详情查询");
        logger.info("activityId = {}", activityId);
        ResponseDto<ActivityDetailDto> responseDto = new ResponseDto<>();

        ActivityDetailDto activityDetailDto = cityActivityService.getActivityDetail(activityId);

        if (activityDetailDto != null) {
            responseDto.setCodeMessage(ErrorCode.SUCCESS);
            responseDto.setData(activityDetailDto);
        } else {
            responseDto.setCodeMessage(ErrorCode.SERVICE_BLANK);
            logger.fatal("城市活动详情数据为空");
        }
        logger.info("结束城市活动详情查询");
        return responseDto;

    }

    @RequestMapping(value = "/activity/Base", method = RequestMethod.GET)
    @ResponseBody
    public ResponseDto<ActivityBaseDto> getActivityBase(@RequestParam("cityBaseId") String cityBaseId) {

        logger.info("开始城市活动基础查询");
        logger.info("activityId = {}", cityBaseId);
        ResponseDto<ActivityBaseDto> responseDto = new ResponseDto<>();

        ActivityBaseDto activityBaseDto = cityActivityService.getActivityBase(cityBaseId);

        if (activityBaseDto != null) {
            responseDto.setCodeMessage(ErrorCode.SUCCESS);
        } else {
            responseDto.setCodeMessage(ErrorCode.SERVICE_BLANK);
            logger.fatal("城市活动详情数据为空");
        }
        logger.info("结束城市活动详情查询");
        return responseDto;

    }

    @RequestMapping(value ="/addUser2" ,method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView addUser2() {
        return cityActivityService.getActivity();
    }

    @RequestMapping(value ="/addUser3" ,method = RequestMethod.POST)
    public String addUser3(User user) {
        System.out.println("userName is:"+user.getUserName());
        System.out.println("password is:"+user.getPassword());
        return "/html/activity";
    }



    @RequestMapping(value ="/addUser1" ,method = RequestMethod.POST)
    @ResponseBody
    public String addUser1(String userName,String password) {
        logger.info("asdfasdf");
        System.out.println("userName is:"+userName);
        System.out.println("password is:"+password);
        return "/html/name";
    }
}
