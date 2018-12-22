/**
 * 
 */
package com.dse.security.core.validate.code;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * @author subiaozhou
 *
 */
public interface ValidateCodeGenerator {

	ValidateCode generate(ServletWebRequest request);
	
}
