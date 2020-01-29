package com.grupoaval.bancopopular.clientews;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.grupoaval.bancopopular.clientews.infrastructure.soap.SoapConnector;

@Component
public class SoapClientRunner {

    @Bean
    CommandLineRunner lookup(SoapConnector soapConnector) {
        return args -> {
            String name = "Sajal";//Default Name
            if(args.length>0){
                name = args[0];
            }

            Stream.of(soapConnector.callWebService("http://localhost:8080/service/student-details", null)).map(m-> m.toString());

        };
    }
}
