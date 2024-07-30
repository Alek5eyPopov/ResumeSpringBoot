package com.popovals1.sibur.springboottestproj.model;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Objects;
@Data
public class Link {
    @NotNull(message = "Link.name must be not null" )
    private final String name;
    @NotNull(message = "Link.url must be not null" )
    private final String url;
}
