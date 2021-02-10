/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring_boot.json_processor.mutli_layer_tech.a_Controllers_and_DTOs.webapp.error;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 *
 * @author Miroslav
 */
@Controller
public class AppErrorController implements ErrorController{

    private final static String PATH = "/error";
    @Override
    @RequestMapping(PATH)
    //@ResponseBody
    public String getErrorPath() {
        
       return "webapp/errors/GeneralError";
    }

}
