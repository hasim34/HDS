package com.hdsupply.orderPriorityPlanner.Service;

import java.util.List;

import com.hdsupply.orderPriorityPlanner.Entity.Material;

public interface MaterialService {

    public Material getMaterial(Long id);

    public List<Material> getAllMaterials();

    public Material createMaterial(Material material);

    public Material updateMaterial(Long id, Material material);

    public void deleteMaterial(Long id);

    
}
