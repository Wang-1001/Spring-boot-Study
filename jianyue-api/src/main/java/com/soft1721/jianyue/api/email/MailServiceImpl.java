package com.soft1721.jianyue.api.email;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("mailService")
public class MailServiceImpl implements MailService {

    @Resource
    private JavaMailSender mailSender;
    @Override
    public void sendMail(String to, String subject, String content) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom("1834257441@qq.com");
        mailMessage.setTo(to);
        mailMessage.setSubject(subject);
        mailMessage.setText(content);
        try {
            mailSender.send(mailMessage);
            System.out.println("发送简单邮件成功");
        }catch (Exception e){
            System.out.println("发送简单邮件失败");
        }

    }
}
