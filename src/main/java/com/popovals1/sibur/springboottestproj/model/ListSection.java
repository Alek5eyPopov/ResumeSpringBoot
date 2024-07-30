package com.popovals1.sibur.springboottestproj.model;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Data
@NoArgsConstructor
public class ListSection extends Section{
    @NotNull(message = "ListSection.list must be not null" )
    private List<String> list = new ArrayList<>();
}
