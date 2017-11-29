package com.artivisi.finnet.finchannelclient;

import com.artivisi.finnet.finchannelclient.dto.InputRemittance;
import com.artivisi.finnet.finchannelclient.dto.OutputTransaction;
import com.artivisi.finnet.finchannelclient.dto.Remittance;
import com.artivisi.finnet.finchannelclient.service.FinchannelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.bind.JAXB;
import java.io.StringWriter;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FinchannelClientApplicationTests {

    @Autowired private FinchannelService service;

	@Test
	public void testMarshallInputRemittance() {
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
				.transactionType("remittance")
				.traxId("124")
				.userName("devlunari")
				.build();

        Remittance request = Remittance.builder().inputRemittance(inputRemittance).build();

		StringWriter sw = new StringWriter();
		JAXB.marshal(request, sw);
		System.out.println(sw);
	}

	@Test
    public void testMarshallTransactionResponse(){
        OutputTransaction response = OutputTransaction.builder()
                .amount("100000")
                .bankName("BCA (BANK CENTRAL ASIA)")
                .billNumber("123")
                .bit39("00")
                .bit48("Test Response")
                .bit61("12345")
                .cashoutTerminal("TEST001")
                .description("Contoh Response")
                .destAmount("110000")
                .destBankAcc("BNI Syariah")
                .feeAmount("1000")
                .mcNoeVA("123")
                .mcNoHP("0812345677890")
                .merchantCode("123")
                .merchantNumber("123")
                .notiDesc("Test")
                .ntpPos("123")
                .pin("1111")
                .pinPos("1234")
                .productCode("001")
                .recepientId("123")
                .recepientProvince("Jakarta")
                .recipientAddress("Jakarta")
                .recipientCity("Jakarta")
                .recipientCountry("Indonesia")
                .recipientName("Penerima")
                .recipientNumber("123")
                .recipientPhone("081234567889")
                .refCode("123")
                .resultCode("00")
                .resultDesc("Sakses")
                .build();

        StringWriter output = new StringWriter();
        JAXB.marshal(response, output);
        System.out.println(output);
    }

    @Test
    public void testInputRemittance(){
        service.inputRemittance();
    }

}
