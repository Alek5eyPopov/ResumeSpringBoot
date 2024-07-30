package com.popovals1.sibur.springboottestproj.model;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
@Data
@NoArgsConstructor
public class TextSection extends Section{
    @NotNull(message = "TextSection.text must be not null" )
    private String text;
}
