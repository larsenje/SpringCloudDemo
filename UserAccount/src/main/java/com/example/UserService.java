package com.example;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jlarsen on 4/28/16.
 */
@FeignClient("user")
public interface UserService {


    @RequestMapping(method = RequestMethod.GET, value="/user")
    String getUser();
}
