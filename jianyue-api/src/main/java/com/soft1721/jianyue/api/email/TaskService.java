package com.soft1721.jianyue.api.email;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Slf4j
@Component

@Service
public class TaskService {
    @Autowired
    private MailService mailService;

  /*  @Scheduled(cron = "0 01 10 ? * *")*/



    @Scheduled(cron = "*/6 * * * *  ?")
    public void  proces(){
        mailService.sendMail("474772119@qq.com","嗯","哦哈哈");
        System.out.println("111");
    }


}
