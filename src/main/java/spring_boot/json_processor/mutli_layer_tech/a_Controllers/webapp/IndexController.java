/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring_boot.json_processor.mutli_layer_tech.a_Controllers.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Miroslav
 */
@Controller
public class IndexController {

	@GetMapping("/webapp/home")
	public String getHomepage(Model model){
		model.addAttribute("blue", "Object ready for itteration check");
		return "webapp/index";
	}
}
