package com.yuetsao.dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@Controller
public class DockerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoApplication.class, args);
	}

	@RequestMapping("user/find")
	@ResponseBody
	public Object findUser() {
		Map<String, String> returnMap = new HashMap<String, String>();
		returnMap.put("name", "yuetsao");
		returnMap.put("age","28");
		return returnMap;
	}

}

