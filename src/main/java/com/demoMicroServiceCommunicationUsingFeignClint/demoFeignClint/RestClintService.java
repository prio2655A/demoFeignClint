package com.demoMicroServiceCommunicationUsingFeignClint.demoFeignClint;

import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Headers("content-Type:application/json")
@FeignClient(name="${feign.name}",url="${feign.url}")
public interface RestClintService {
    @RequestMapping(value="microService2/student/save",method= RequestMethod.POST)
    Student save(Student student);
}
