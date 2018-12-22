/**
 * 
 */
package com.dse.service.impl;

import org.springframework.stereotype.Service;

import com.dse.service.HelloService;

/**
 * @author subiaozhou
 *
 */
@Service
public class HelloServiceImpl implements HelloService {

	/* (non-Javadoc)
	 * @see com.dse.service.HelloService#greeting(java.lang.String)
	 */
	@Override
	public String greeting(String name) {
		System.out.println("greeting");
		return "hello "+name;
	}

}
