/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring_boot.json_processor.mutli_layer_tech.b_Facade.facadeImplementation;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import spring_boot.json_processor.mutli_layer_tech.b_Facade.facadeInterfaces.FileProcessingFacadeInterface;
import spring_boot.json_processor.mutli_layer_tech.model.CVE_Item;

/**
 *
 * @author Miroslav
 */
@Component
public class FileProcessingFacadeImplementation implements FileProcessingFacadeInterface {

	@Override
	public List<CVE_Item> getCVE_Items() {
		return new ArrayList<CVE_Item>();
	}

	@Override
	public boolean saveCVE_Items(MultipartFile file, String db_name) {
		List<CVE_Item> listOfCVE_items = new ArrayList<>();
		try {
			byte[] bytes = file.getBytes();
			String completeData = new String(bytes);
			JSONObject obj = new JSONObject(completeData);
			if (db_name.equals("H2_DB")) {
				return true;
			} else if (db_name.equals("Postgres_DB")) {
				return true;
			} else if (db_name.equals("Kafka_DB")) {
				return true;
			} else {
				return false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
