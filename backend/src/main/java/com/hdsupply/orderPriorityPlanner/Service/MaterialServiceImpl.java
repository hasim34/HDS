package com.hdsupply.orderPriorityPlanner.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hdsupply.orderPriorityPlanner.DTO.MaterialDTO;
import com.hdsupply.orderPriorityPlanner.Entity.Material;
import com.hdsupply.orderPriorityPlanner.Repository.MaterialRepository;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data 
@Getter 
@Setter 
@Service
@RequiredArgsConstructor 
@Transactional
public class MaterialServiceImpl implements MaterialService {
    private  final MaterialRepository materialRepository;

    @Override
    @Transactional(readOnly = true)
    public Material getMaterial(Long id){
        return materialRepository.findById(id).orElseThrow(() -> new RuntimeException("No material found for this id : "+ id));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Material> getAllMaterials(){
        return materialRepository.findAll();
    }

    @Override
    public Material createMaterial(MaterialDTO material){
        Material materialNew = new Material();

        materialNew.setMaterialName(material.getMaterialName());
        materialNew.setUnitPrice(material.getUnitPrice());
        materialNew.setAvailableStock(material.getAvailableStock());

        return materialRepository.save(materialNew);
    }

    @Override
    public Material updateMaterial(Long id, MaterialDTO material){
        Material existingMaterial = materialRepository.findById(id).orElseThrow(() -> new RuntimeException("No material found for this id : "+ id + "Hence cannot update")) ;

        existingMaterial.setMaterialName(material.getMaterialName());
        existingMaterial.setUnitPrice(material.getUnitPrice());
        existingMaterial.setAvailableStock(material.getAvailableStock());

        return materialRepository.save(existingMaterial);
    }

    @Override
    public void deleteMaterial(Long id){
        Material existingMaterial = materialRepository.findById(id).orElseThrow(() -> new RuntimeException("No material found for this id : "+ id + "Hence cannot delete it")) ;
        materialRepository.delete(existingMaterial);
    }
}
