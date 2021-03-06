# Finnet MC Mobile Cash Client #

* WSDL : https://www.mcmobilecash.com/devofc/FinChannelServices/routeX2.php?wsdl

## Request Remittance ##

```
POST / HTTP/1.1
Accept-Encoding: gzip
Accept: text/xml, text/html, image/gif, image/jpeg, *; q=.2, */*; q=.2
SOAPAction: ""
Content-Type: text/xml; charset=utf-8
Cache-Control: no-cache
Pragma: no-cache
User-Agent: Java/1.8.0_151
Host: localhost:8080
Connection: keep-alive
Content-Length: 1363
```

```xml
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <remittance>
            <inputRemittance>
                <userName>devlunari</userName>
                <signature>ABCD</signature>
                <productCode>007004</productCode>
                <merchantCode>FNN778</merchantCode>
                <terminal>TMONEY10</terminal>
                <merchantNumber>+6281000111001</merchantNumber>
                <destBankAcc>1231234567</destBankAcc>
                <destAmount>100001</destAmount>
                <transactionType>41</transactionType>
                <senderAddress>Bogor</senderAddress>
                <senderCountry>Indonesia</senderCountry>
                <recipientName>Endy</recipientName>
                <recipientPhone>+62812345678890</recipientPhone>
                <recipientAddress>Pangkalan Jati</recipientAddress>
                <recipientCity>Jakarta</recipientCity>
                <recipientCountry>Indonesia</recipientCountry>
                <description>Keterangan</description>
                <traxId>124</traxId>
                <feeAmount>1000</feeAmount>
                <refCode>123</refCode>
                <payCode>123</payCode>
                <senderCountryId>id</senderCountryId>
                <senderBornDate>1945-08-17</senderBornDate>
                <senderBornPlace>Jakarta</senderBornPlace>
                <recepientIdentificationId>123</recepientIdentificationId>
                <recepientProvinceId>DKI</recepientProvinceId>
                <recepientProvince>DKI Jakarta</recepientProvince>
                <recepientSubProvinceId>jaktim</recepientSubProvinceId>
                <recepientSubProvince>Jakarta Timur</recepientSubProvince>
                <recepientId>123</recepientId>
                <timeStamp>123</timeStamp>
            </inputRemittance>
        </remittance>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```

## Remittance Response ##

```xml
<?xml version="1.0" encoding="ISO-8859-1"?>
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/"
                   xmlns:SOAP-ENC="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="urn:routeDx2"
                   xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                   SOAP-ENV:encodingStyle="http://schemas.xmlsoap.org/soap/encoding/">
    <SOAP-ENV:Body>
        <ns1:remittanceResponse xmlns:ns1="http://schemas.xmlsoap.org/soap/envelope/">
            <outputTransaction xsi:type="tns:outputTransaction">
                <sysCode xsi:type="xsd:string">649471129491</sysCode>
                <resultCode xsi:type="xsd:string">7063</resultCode>
                <resultDesc xsi:type="xsd:string">Wrong Data Input</resultDesc>
                <productCode xsi:type="xsd:string">007004</productCode>
                <merchantCode xsi:type="xsd:string">FNN778</merchantCode>
                <terminal xsi:type="xsd:string">TMONEY10</terminal>
                <merchantNumber xsi:type="xsd:string">+6281000111001</merchantNumber>
                <destBankAcc xsi:type="xsd:string">1231234567</destBankAcc>
                <destAmount xsi:type="xsd:string">100001</destAmount>
                <feeAmount xsi:type="xsd:string">1000</feeAmount>
                <senderAddress xsi:type="xsd:string">Bogor</senderAddress>
                <senderCountry xsi:type="xsd:string">Indonesia</senderCountry>
                <recipientName xsi:type="xsd:string">Endy</recipientName>
                <recipientPhone xsi:type="xsd:string">+62812345678890</recipientPhone>
                <recipientAddress xsi:type="xsd:string">Pangkalan Jati</recipientAddress>
                <recipientCity xsi:type="xsd:string">Jakarta</recipientCity>
                <recipientCountry xsi:type="xsd:string">Indonesia</recipientCountry>
                <transactionType xsi:type="xsd:string">41</transactionType>
                <description xsi:type="xsd:string">Keterangan</description>
                <traxId xsi:type="xsd:string">124</traxId>
                <timeStamp xsi:type="xsd:string">123</timeStamp>
                <timeStampServer xsi:type="xsd:string">30-11-2017 00:57:20:659468</timeStampServer>
                <recepientId xsi:type="xsd:string">123</recepientId>
                <recepientProvince xsi:type="xsd:string">DKI Jakarta</recepientProvince>
            </outputTransaction>
        </ns1:remittanceResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```
