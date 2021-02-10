/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring_boot.json_processor.mutli_layer_tech.a_Controllers_and_DTOs.webapp;


import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

//import org.json.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Miroslav
 */
@Controller
public class IndexController {

	
	@GetMapping("/home")
	public String getHomepage(Model model) {
		model.addAttribute("blue", "Object ready for itteration check");
		return "webapp/index";
	}

	@GetMapping("/H2Response")
	public String showUserList(Model model) {

		return "webapp/h2/H2Response";
	}

	@PostMapping("/process")
	public String upload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {

		if (file.isEmpty()) {
			redirectAttributes.addFlashAttribute("message", "Please select a file to upload.");

		} else {
			redirectAttributes.addFlashAttribute
	                         ("message", "You successfully uploaded " + file.getOriginalFilename() + "!");

			
		}
		return "redirect:/H2Response";
	}
}
