package com.grupoaval.bancopopular.clientews.infrastructure.soap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.grupoaval.bancopopular.clientews.infrastructure.soap.SoapConnector;

@Configuration
public class SoapClientConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this is the package name specified in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("com.grupoaval.bancopopular.clientews.domain");
        return marshaller;
    }
 
    @Bean
    public SoapConnector soapConnector(Jaxb2Marshaller marshaller) {
    	SoapConnector client = new SoapConnector();
        client.setDefaultUri("http://localhost:8080/ProdsChnsMngt/SSL/FirstBuy");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
	
}
