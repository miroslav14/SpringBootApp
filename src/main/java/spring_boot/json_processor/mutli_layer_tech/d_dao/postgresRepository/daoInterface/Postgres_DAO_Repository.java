/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring_boot.json_processor.mutli_layer_tech.d_dao.postgresRepository.daoInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spring_boot.json_processor.mutli_layer_tech.model.CVE_Item;
/**
 *
 * @author Miroslav
 */
@Repository
public interface Postgres_DAO_Repository extends CrudRepository<CVE_Item,Long>{
	
}
