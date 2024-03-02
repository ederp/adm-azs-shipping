package com.projeto.azship.adapters.swagger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.projeto.azship.ports.swagger.HomeControllerPort;

/**
 * Redireciona a home para a documentação da api do swagger  
 */

@Controller
public class HomeController implements HomeControllerPort {

	@RequestMapping(value = "/")
	@Override
	public String index() {
		// TODO Auto-generated method stub
		return "redirect:/swagger-ui/";
	}

}
