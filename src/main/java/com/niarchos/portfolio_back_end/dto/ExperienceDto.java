package com.niarchos.portfolio_back_end.dto;

public class ExperienceDto {
    private Long id;
    private String role;
    private String organization;
    private String startDate;
    private String endDate;
    private String description;
    private String technologies;
    private boolean top;
    private int displayOrder;

    public ExperienceDto(Long id, String role, String organization, String startDate,
                         String endDate, String description, String technologies, boolean top, int displayOrder) {
        this.id = id;
        this.role = role;
        this.organization = organization;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.technologies = technologies;
        this.top = top;
        this.displayOrder = displayOrder;
    }

    public Long getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public String getOrganization() {
        return organization;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getDescription() {
        return description;
    }

    public String getTechnologies() {
        return technologies;
    }

    public boolean isTop() {
        return top;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }
}
