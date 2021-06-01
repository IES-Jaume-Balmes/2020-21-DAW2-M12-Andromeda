package com.dev.webthymeleaf.controladores;

import com.dev.webthymeleaf.servicios.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SendMailController {

    @Autowired
    private SendMailService sendMailService;
    
    /*Devuelve el formulario del mail de contacto*/
    @GetMapping("/mail")
    public String index(){
        return "send_mail_view";
    }
    
    /*Guarda el cuerpo del mensaje y se lo envia a andromedadaw@gmail.com*/
    @PostMapping("/sendMail")
    public String sendMail(@RequestParam("name") String name, @RequestParam("mail") String mail, @RequestParam("subject") String subject, @RequestParam("body") String body){

        String message = body +"\n\n Datos de contacto: " + "\nNombre: " + name + "\nE-mail: " + mail;
        sendMailService.sendMail("andromedadaw@gmail.com", "andromedadaw@gmail.com" ,subject,message);

        return "index";
    }
}
