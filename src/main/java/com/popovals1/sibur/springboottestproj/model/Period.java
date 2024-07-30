package com.popovals1.sibur.springboottestproj.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
@Data
@NoArgsConstructor
public class Period {
    private LocalDate begin;
    private LocalDate end;
    private String tittle;
    private String description;
}
