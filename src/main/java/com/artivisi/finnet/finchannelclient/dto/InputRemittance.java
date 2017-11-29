package com.artivisi.finnet.finchannelclient.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class InputRemittance {
    private String userName;
    private String signature;
    private String productCode;
    private String merchantCode;
    private String terminal;
    private String merchantNumber;
    private String destBankAcc;
    private String destAmount;
    private String transactionType;
    private String senderName;
    private String senderAddress;
    private String senderID;
    private String senderPhone;
    private String senderCity;
    private String senderCountry;
    private String recipientName;
    private String recipientPhone;
    private String recipientAddress;
    private String recipientCity;
    private String recipientCountry;
    private String description;
    private String traxId;
    private String feeAmount;
    private String refCode;
    private String payCode;
    private String senderCountryId;
    private String senderBornDate;
    private String senderBornPlace;
    private String recepientIdentificationId;
    private String recepientIdentificationNumber;
    private String recepientProvinceId;
    private String recepientProvince;
    private String recepientSubProvinceId;
    private String recepientSubProvince;
    private String recepientId;
    private String timeStamp;
}
