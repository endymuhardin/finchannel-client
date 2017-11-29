package com.artivisi.finnet.finchannelclient.dto;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {
    public ObjectFactory() {}
    public Remittance createRemittance() {
        return new Remittance();
    }
    public RemittanceResponse createRemittanceResponse() {
        return new RemittanceResponse();
    }

}
