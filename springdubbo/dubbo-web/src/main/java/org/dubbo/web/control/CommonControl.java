package org.dubbo.web.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zf.dubbo.api.CommonService;

@RestController
@RequestMapping(value = "/common")
public class CommonControl {

	@Reference
	CommonService commonService;

	@RequestMapping("test")
	public String test() {
		String test = commonService.getPas("test");
		return test;
	}
}
