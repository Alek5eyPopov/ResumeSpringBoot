package com.popovals1.sibur.springboottestproj.model;

public enum SectionType {
    OBJECTIVE("Позиция"),
    PERSONAL("Личные качества"),
    ACHIEVEMENT("Достижения"),
    QUALIFICATIONS("Квалификация"),
    EXPERIENCE("Опыт работы"),
    EDUCATION("Образование");
    private String title;

    SectionType(String title) {
        this.title = title;
    }
}
