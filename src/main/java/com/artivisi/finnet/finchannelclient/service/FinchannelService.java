package com.artivisi.finnet.finchannelclient.service;

import com.artivisi.finnet.finchannelclient.dto.InputRemittance;
import com.artivisi.finnet.finchannelclient.dto.Remittance;
import com.artivisi.finnet.finchannelclient.dto.RemittanceResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class FinchannelService extends WebServiceGatewaySupport {

    private String urlFinchannel;

    public FinchannelService(String url){
        urlFinchannel = url;
    }

    public void inputRemittance(){
        InputRemittance inputRemittance = InputRemittance.builder()
                .description("Keterangan")
                .destAmount("100001")
                .destBankAcc("1231234567")
                .feeAmount("1000")
                .merchantCode("FNN778")
                .merchantNumber("+6281000111001")
                .payCode("123")
                .productCode("007004")
                .recepientId("123")
                .recepientIdentificationId("123")
                .recepientProvince("DKI Jakarta")
                .recepientProvinceId("DKI")
                .recepientSubProvince("Jakarta Timur")
                .recepientSubProvinceId("jaktim")
                .recipientAddress("Pangkalan Jati")
                .recipientCity("Jakarta")
                .recipientCountry("Indonesia")
                .recipientName("Endy")
                .recipientPhone("+62812345678890")
                .refCode("123")
                .senderAddress("Bogor")
                .senderBornDate("1945-08-17")
                .senderBornPlace("Jakarta")
                .senderCountry("Indonesia")
                .senderCountryId("id")
                .signature("ABCD")
                .terminal("TMONEY10")
                .timeStamp("123")
                .transactionType("41")
                .traxId("124")
                .userName("devlunari")
                .build();

        Remittance remittance = Remittance.builder().inputRemittance(inputRemittance).build();

        RemittanceResponse response = (RemittanceResponse) getWebServiceTemplate()
                .marshalSendAndReceive(urlFinchannel, remittance);

        System.out.println(response);
    }
}
