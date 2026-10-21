package com.hdsupply.orderPriorityPlanner.DTO;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class CustomerDTO {
    @NotNull
    private String customerName;
    @NotNull

    private Long phoneNumber;
    @NotNull

    private String address;
    @NotNull

    private String emailId;

}
