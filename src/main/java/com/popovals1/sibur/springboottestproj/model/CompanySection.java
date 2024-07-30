package com.popovals1.sibur.springboottestproj.model;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Data
@NoArgsConstructor
public class CompanySection extends Section{
    @NotNull(message = "CompanySection.companyList must be not null" )
    private final List<Company> companyList = new ArrayList<>();
}
