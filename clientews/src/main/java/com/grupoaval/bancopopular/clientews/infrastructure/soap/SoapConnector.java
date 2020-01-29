package com.grupoaval.bancopopular.clientews.infrastructure.soap;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

/**
 * 
 * @author nvillar
 *
 */
public class SoapConnector extends WebServiceGatewaySupport {

	/**
	 * 
	 * @param url
	 * @param request
	 * @return
	 */
	public Object callWebService(String url, Object request) {
		return getWebServiceTemplate().marshalSendAndReceive(url, request);
	}
	
}
