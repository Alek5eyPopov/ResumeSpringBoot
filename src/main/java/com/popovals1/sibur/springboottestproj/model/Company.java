package com.popovals1.sibur.springboottestproj.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Data
@NoArgsConstructor
public class Company {
    private Link homePage;
    private List<Period> periods;

    Company(String name, String website, List<Period> periods) {
        this.homePage = new Link(name,website);
        this.periods = periods;
    }
}
