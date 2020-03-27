package main.handler;


import entity.CommonResult;
import entity.Payment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderController {



    @RequestMapping("customer/get")
    @ResponseBody
    public CommonResult<Payment> get(Long id){
        System.out.println("sadfasdfsadfsadfdfsadf");
//        log.warn("User  query ..."+id);
//        LinkedMultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
//        map.add("id",id);
        return restTemplate.postForObject(Payment_Url + "/payment/query",id,CommonResult.class);
    }

    @RequestMapping("customer/test")
    @ResponseBody
    public void test(){
        System.out.println("sadfasdfsadfsadfdfsadf");
        restTemplate.postForObject(Payment_Url + "/payment/test",null,CommonResult.class);
    }

}
