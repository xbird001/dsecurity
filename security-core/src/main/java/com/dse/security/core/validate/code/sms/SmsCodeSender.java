/**
 * 
 */
package com.dse.security.core.validate.code.sms;

/**
 * @author subiaozhou
 *
 */
public interface SmsCodeSender {
	
	void send(String mobile, String code);

}
