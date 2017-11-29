package com.artivisi.finnet.finchannelclient.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
@XmlRootElement(name = "outputTransaction")
@XmlAccessorType(XmlAccessType.FIELD)
public class OutputTransaction {
    private String sysCode;
    private String refCode;
    private String resultCode;
    private String resultDesc;
    private String userName;
    private String signature;
    private String productCode;
    private String merchantCode;
    private String terminal;
    private String merchantNumber;
    private String destBankAcc;
    private String destAmount;
    private String amount;
    private String feeAmount;
    private String sourceID;
    private String sourceName;
    private String senderName;
    private String senderAddress;
    private String senderID;
    private String senderPhone;
    private String senderCity;
    private String senderCountry;
    private String recipientName;
    private String recipientPhone;
    private String recipientNumber;
    private String recipientAddress;
    private String recipientCity;
    private String recipientCountry;
    private String notiDesc;
    private String transactionType;
    private String billNumber;
    private String bit61;
    private String bit48;
    private String bit39;
    private String verifyingCode;
    private String verCode;
    private String description;
    private String bankName;
    private String traxId;
    private String timeStamp;
    private String timeStampServer;
    private String mcNoHP;
    private String mcNoeVA;
    @XmlElement(name = "NTPPos", required = true)
    protected String ntpPos;
    @XmlElement(name = "PINPos", required = true)
    protected String pinPos;
    @XmlElement(name = "PIN", required = true)
    protected String pin;
    private String recepientId;
    private String recepientProvince;
    private String cashoutTerminal;
}
