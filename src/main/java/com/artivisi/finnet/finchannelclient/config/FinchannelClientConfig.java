package com.artivisi.finnet.finchannelclient.config;

import com.artivisi.finnet.finchannelclient.service.FinchannelService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class FinchannelClientConfig {

    @Value("${finchannel.url}") private String urlFinchannel;

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.artivisi.finnet.finchannelclient.dto");
        return marshaller;
    }

    @Bean
    public FinchannelService finchannelService(){
        FinchannelService service = new FinchannelService(urlFinchannel);
        service.setMarshaller(marshaller());
        service.setUnmarshaller(marshaller());
        service.setDefaultUri(urlFinchannel);
        return service;
    }
}
