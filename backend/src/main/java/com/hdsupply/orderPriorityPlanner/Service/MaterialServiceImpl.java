package com.hdsupply.orderPriorityPlanner.Service;

import java.util.List;

import org.springframework.stereotype.Service;

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
public class MaterialServiceImpl implements MaterialService {
    private  final MaterialRepository materialRepository;

    @Override
    public Material getMaterial(Long id){
        return materialRepository.findById(id).orElseThrow(() -> new RuntimeException("No material found for this id : "+ id));
    }

    @Override
    public List<Material> getAllMaterials(){
        return materialRepository.findAll();
    }

    @Override
    public Material createMaterial(Material material){
        Material materialNew = new Material();

        materialNew.setMaterialName(material.getMaterialName());
        materialNew.setUnitPrice(material.getUnitPrice());
        materialNew.setAvailbleStock(material.getAvailableStock());

        return materialRepository.save(materialNew);
    }

    @Override
    public Material updateMaterial(Long id, Material material){
        Material existingMaterial = materialRepository.findById(id).orElseThrow(() -> );
    }

    @Override
    public void deleteMaterial(Long id){

    }
}
