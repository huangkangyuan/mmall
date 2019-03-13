//package com.mmall.common;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;
//import org.springframework.web.servlet.HandlerExceptionResolver;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.view.json.MappingJacksonJsonView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * Created by geely
// */
//@Slf4j
//@Component
//public class ExceptionResolver implements HandlerExceptionResolver{
//
//    @Override
//    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
//        log.error("{} Exception",httpServletRequest.getRequestURI(),e);
//        ModelAndView modelAndView = new ModelAndView(new MappingJacksonJsonView());
//
//        //当使用是jackson2.x的时候使用MappingJackson2JsonView，课程中使用的是1.9。
//        modelAndView.addObject("status",ResponseCode.ERROR.getCode());
//        modelAndView.addObject("msg","接口异常,详情请查看服务端日志的异常信息");
//        modelAndView.addObject("data",e.toString());
//        return modelAndView;
//    }
//}
