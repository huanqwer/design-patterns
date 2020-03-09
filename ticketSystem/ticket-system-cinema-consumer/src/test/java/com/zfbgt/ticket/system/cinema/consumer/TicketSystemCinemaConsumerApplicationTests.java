package com.zfbgt.ticket.system.cinema.consumer;

import com.zfbgt.ticket.system.cinema.consumer.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TicketSystemCinemaConsumerApplicationTests {

    @Autowired
    UserService userService;
    @Test
    public void contextLoads() {
        userService.hello();
    }

}
