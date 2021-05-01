package com.javalab.web.autoconfigure;

import com.javalab.springcloud.registry.ServiceRegistry;
import com.javalab.web.controller.ServicesController;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudWebAutoConfigure {

    @Bean
    @ConditionalOnMissingBean
    public ServicesController servicesController(ServiceRegistry serviceRegistry){
        return new ServicesController(serviceRegistry);
    }
}
