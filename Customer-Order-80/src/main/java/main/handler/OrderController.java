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

    @Resource
    private RestTemplate restTemplate;


   public final static String Payment_Url = "http://PAYMENT";
    private final Logger log =  LoggerFactory.getLogger(OrderController.class);

   @RequestMapping("customer/create")
   @ResponseBody
    public CommonResult<Payment> create(Payment payment){
//       log.warn("User  Creating ..."+user);
//       LinkedMultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
//       map.add("username",user.getUsername());
//       map.add("password",user.getPassword());
       return restTemplate.postForObject(Payment_Url + "/payment/create",payment,CommonResult.class);
    }

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
