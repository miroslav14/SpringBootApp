/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring_boot.json_processor.mutli_layer_tech.c_service.h2.serviceInterface;

import java.util.List;
import org.json.JSONObject;
import org.springframework.web.multipart.MultipartFile;
import spring_boot.json_processor.mutli_layer_tech.model.CVE_Item;

/**
 *
 * @author Miroslav
 */
public interface H2ServiceInterface {
      List<CVE_Item> getCVE_Items();
      boolean saveCVE_Items(JSONObject jsonObject);	}
