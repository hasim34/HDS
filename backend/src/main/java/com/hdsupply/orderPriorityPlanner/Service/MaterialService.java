package com.hdsupply.orderPriorityPlanner.Service;

import java.util.List;

import com.hdsupply.orderPriorityPlanner.DTO.MaterialDTO;
import com.hdsupply.orderPriorityPlanner.Entity.Material;

public interface MaterialService {

    public Material getMaterial(Long id);

    public List<Material> getAllMaterials();

    public Material createMaterial(MaterialDTO material);

    public Material updateMaterial(Long id, MaterialDTO material);

    public void deleteMaterial(Long id);

    
}
