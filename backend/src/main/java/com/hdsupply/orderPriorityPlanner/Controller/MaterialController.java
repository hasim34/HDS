package com.hdsupply.orderPriorityPlanner.Controller;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdsupply.orderPriorityPlanner.DTO.MaterialDTO;
import com.hdsupply.orderPriorityPlanner.Entity.Material;
import com.hdsupply.orderPriorityPlanner.Service.MaterialService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

@RestController 
@RequiredArgsConstructor 
@RequestMapping("/materials")
public class MaterialController {
    private final MaterialService materialService;

    @GetMapping("/{id}")
    public Material getMaterial(@PathVariable Long id){
        return materialService.getMaterial(id);
    }

    @GetMapping 
    public List<Material> getAllMaterials(){
        return materialService.getAllMaterials();
    }

    @PostMapping
    public Material createMaterial(@Valid MaterialDTO materialDTO){
        return materialService.createMaterial(materialDTO);
    }

    @PutMapping 
    public Material updateMaterial(Long id,@Valid MaterialDTO materialDTO){
        return materialService.updateMaterial(id,materialDTO);
    }

    @DeleteMapping 
    public void deleteMaterial(Long id){
        materialService.deleteMaterial(id);
    }
}
