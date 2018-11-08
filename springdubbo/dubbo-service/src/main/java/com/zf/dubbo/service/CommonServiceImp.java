package com.zf.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zf.dubbo.api.CommonService;

@Service(interfaceClass = CommonService.class)
public class CommonServiceImp implements CommonService {

	@Override
	public String getPas(String name) {
		return "abcdef";
	}

}
