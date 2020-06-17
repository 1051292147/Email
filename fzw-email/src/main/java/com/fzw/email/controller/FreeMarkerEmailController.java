package com.fzw.email.controller;



import com.fzw.email.pojo.Message;
import com.fzw.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FreeMarkerEmailController {


    @Autowired
    private EmailService emailService;

    @GetMapping(value = "/sendMessage")
    public boolean sendMailMessage() {
        Message message = new Message();

        message.setMessageCode("Parameter");
        message.setMessageStatus("Success");
        message.setCause("测试成功");
        emailService.sendMessageMail(message, "测试消息通知", "message.ftl");
        return true;
    }
}
