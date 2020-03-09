package com.zfbgt.ticket.system.cinema.consumer.service;

import com.zfbgt.ticket.system.user.provider.service.TicketService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service //Spring里的Service
public class UserService {

    @Reference
    TicketService ticketService;

    Logger logger = LoggerFactory.getLogger(getClass());

    public void hello(){
        String ticket = ticketService.getTicket();
        logger.info("买到票了:"+ticket);
    }
}
