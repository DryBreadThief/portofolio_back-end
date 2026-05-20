package com.niarchos.portfolio_back_end.dto;

public class ProjectDto {
    private Long id;
    private String title;
    private String description;
    private String techStack;
    private String imageUrl;
    private String githubUrl;
    private String liveUrl;
    private boolean top;
    private int displayOrder;

    public ProjectDto(Long id, String title, String description, String techStack,
                      String imageUrl, String githubUrl, String liveUrl, boolean top, int displayOrder) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.techStack = techStack;
        this.imageUrl = imageUrl;
        this.githubUrl = githubUrl;
        this.liveUrl = liveUrl;
        this.top = top;
        this.displayOrder = displayOrder;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getTechStack() {
        return techStack;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public String getLiveUrl() {
        return liveUrl;
    }

    public boolean isTop() {
        return top;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }
}
