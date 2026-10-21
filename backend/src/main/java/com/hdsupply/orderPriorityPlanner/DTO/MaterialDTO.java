package com.hdsupply.orderPriorityPlanner.DTO;

import java.text.DecimalFormat;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data 
@Getter 
@Setter 
public class MaterialDTO {
    @NotBlank 
    public String  materialName;
    @NotNull
    @Positive 
    public DecimalFormat unitPrice;
    @NotNull 
    @Min(0)
    public Integer availableStock;
}
