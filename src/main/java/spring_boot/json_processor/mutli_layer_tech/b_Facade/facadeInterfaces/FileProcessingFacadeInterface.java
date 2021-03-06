/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring_boot.json_processor.mutli_layer_tech.b_Facade.facadeInterfaces;

import java.util.List;
import org.json.JSONObject;
import org.springframework.web.multipart.MultipartFile;
import spring_boot.json_processor.mutli_layer_tech.model.CVE_Item;

/**
 *
 * @author Miroslav
 */
public interface FileProcessingFacadeInterface {
      List<CVE_Item> getCVE_Items_for_Web();
      boolean saveCVE_Items_from_Web(MultipartFile file, String db_name);
      List<CVE_Item> getCVE_Items_for_REST_API();
      boolean saveCVE_Items_from_REST_API(JSONObject jsonfile, String db_name);
}
