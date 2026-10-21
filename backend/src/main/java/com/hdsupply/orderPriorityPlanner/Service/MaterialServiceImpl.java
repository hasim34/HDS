package com.hdsupply.orderPriorityPlanner.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hdsupply.orderPriorityPlanner.Entity.Material;
import com.hdsupply.orderPriorityPlanner.Repository.MaterialRepository;

import lombok.RequiredArgsConstructor;

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
        
    }

    @Override
    public Material updateMaterial(Long id, Material material){

    }

    @Override
    public void deleteMaterial(Long id){

    }
}
