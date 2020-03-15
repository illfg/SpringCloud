package main.handler;


import entity.CommonResult;
import entity.Payment;
import main.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {

    @Qualifier("PaymentService")
    @Autowired
    PaymentService userService;

    @Value("${server.port}")
    private String port;

    private final Logger log =  LoggerFactory.getLogger(PaymentController.class);

    @PostMapping("payment/create")
    @ResponseBody
    public CommonResult<Payment> create(@RequestBody Payment payment){
        log.warn("payment Creating ...." + payment+port);
        try {
            userService.create(payment);
            return new CommonResult<Payment>(200,"插入成功！",payment);
        }catch (Exception e) {
            log.error(e.toString());
            return new CommonResult<Payment>(500, "插入失败", null);
        }

    }

    @RequestMapping("payment/query")
    @ResponseBody
    public CommonResult<Payment> query(@RequestBody Long id){
        Payment result = userService.getPaymentById(id);
        log.info("payment Query ...." + result+port);
        if (result != null){
            return new CommonResult<Payment>(200,"查询成功！",result);
        }else {
            return new CommonResult<Payment>(500,"查询失败",null);
        }
    }

}
