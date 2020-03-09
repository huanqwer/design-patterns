package com.zfbgt.ticket.system.user.provider.serviceImpl;

import com.zfbgt.ticket.system.user.provider.service.TicketService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
//dubbo下的注解
@Service
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "<速度与激情8>";
    }
}
