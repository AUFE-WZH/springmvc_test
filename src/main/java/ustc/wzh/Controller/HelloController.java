package ustc.wzh.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author USTC_WZH
 * @create 2019-11-27 0:25
 */
@Controller
@RequestMapping("/user")
public class HelloController {

    @RequestMapping("hello")
    public String helloworld(){
        System.out.println("hello world!");
        return "success";
    }
}
