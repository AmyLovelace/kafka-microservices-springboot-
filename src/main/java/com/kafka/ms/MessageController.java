package com.kafka.ms;


import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/messages")
@AllArgsConstructor
public class MessageController {

    private KafkaTemplate<String,String> kafkaTemplate;

    /*now you can do post request via another services or via postman message is just a object wich a key "message"and a its value  */
    @PostMapping
    public void publish(@RequestBody MessageRequest request){
        kafkaTemplate.send("amy", request.message());
    }

}
