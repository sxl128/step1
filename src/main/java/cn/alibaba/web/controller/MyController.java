package cn.alibaba.web.controller;

import cn.alibaba.web.pojo.User;
import cn.alibaba.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @Autowired
    private UserService userService;

    @RequestMapping("query")
    public String testIntegration(@RequestParam(value="id",required = false) String id, Model model){
         int idx = 0;
        try{
            idx = Integer.parseInt(id);

        }catch(Exception e){

           model.addAttribute("msg","您输入的id格式不正确");
           return "error";

        }
        User user = userService.queryById(idx);
        model.addAttribute("msg",user);
        return "this";

    }

    @RequestMapping("delete")
    public String testIntegration02(@RequestParam("id") String id,Model model){
        int idx = 0;
        try{
            idx = Integer.parseInt(id);

        }catch(Exception e){

            model.addAttribute("msg","您输入id的格式不正确");
            return "error";

        }
             userService.deleteById(idx);
        model.addAttribute("msg","删除成功");
        return "this";

    }





}
