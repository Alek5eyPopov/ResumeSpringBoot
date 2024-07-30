package com.popovals1.sibur.springboottestproj.model;

public enum ContactType {
    TELEPHONE("Телефон"),
    SKYPE("Скайп"),
    EMAIL("Почта"),
    LINKEDIN("Профиль LinkedIn"),
    GITHUB("Профиль GitHub"),
    STACKOVERFLOW("Профиль Stackoverflow"),
    HOMEPAGE("Домашняя страница");

    public String getTitle() {
        return title;
    }
    ContactType(String title) {
        this.title = title;
    }
    private String title;
}
