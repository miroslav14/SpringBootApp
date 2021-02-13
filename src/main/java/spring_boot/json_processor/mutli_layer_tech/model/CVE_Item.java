/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring_boot.json_processor.mutli_layer_tech.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Miroslav
 */
@Entity
@Data
@NoArgsConstructor
public class CVE_Item {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String publishedDate; 
    private String severity;
}
