package com.popovals1.sibur.springboottestproj.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.*;
@Data
public class Resume {
    private final String uuid;
    private String fullName;
    private final Map<ContactType, String> contacts = new EnumMap<>(ContactType.class);

    public Map<SectionType, Section> getSections() {
        return sections;
    }

    private final Map<SectionType, Section> sections = new EnumMap<>(SectionType.class);


    public Resume(String fullName) {
        this.fullName = fullName;
        this.uuid = UUID.randomUUID().toString();
    }

    public Resume() {
        this.uuid = UUID.randomUUID().toString();
    }

    public Resume(String uuid, String fullName) {
        this.uuid = uuid;
        this.fullName = fullName;
    }

    public void addContact(ContactType contactType, String value) {
        contacts.put(contactType, value);
    }

    public void addTextSectionData(SectionType sectionType, String value) {
//        sections.put(sectionType, new TextSection(value));
    }

    public void addListSectionData(SectionType sectionType, String value) {
        if (!sections.containsKey(sectionType)) sections.put(sectionType, new ListSection());
        ListSection section = (ListSection )sections.get(sectionType);
        section.getList().add(value);
    }

    public void addCompSectionData(SectionType sectionType, String name, String website, LocalDate begin,
                                   LocalDate end, String tittle, String description) {
//        if (!sections.containsKey(sectionType)) sections.put(sectionType, new CompanySection());
//        CompanySection section = (CompanySection)sections.get(sectionType);
//        List<Period> periodList = new ArrayList<>();
//        periodList.add(new Period(begin,end,tittle,description));
//
//        section.getCompanyList().add(new Company(name, website, periodList));
    }

    public void addCompSectionData(SectionType sectionType, String name, String website, LocalDate begin,
                                   LocalDate end, String description) {
//        if (!sections.containsKey(sectionType)) sections.put(sectionType, new CompanySection());
//        CompanySection section = (CompanySection)sections.get(sectionType);
//        List<Period> periodList = new ArrayList<>();
//        periodList.add(new Period(begin,end,"",description));
//        section.getCompanyList().add(new Company(name, website, periodList));
    }
}
