package com.niarchos.portfolio_back_end.dto;

public class ProfileDto {
    private Long id;
    private String fullName;
    private String title;
    private String summary;
    private String location;
    private String githubUrl;
    private String linkedinUrl;
    private String email;

    public ProfileDto(Long id, String fullName, String title, String summary,
                      String location, String githubUrl, String linkedinUrl, String email) {
        this.id = id;
        this.fullName = fullName;
        this.title = title;
        this.summary = summary;
        this.location = location;
        this.githubUrl = githubUrl;
        this.linkedinUrl = linkedinUrl;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
    }

    public String getLocation() {
        return location;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public String getLinkedinUrl() {
        return linkedinUrl;
    }

    public String getEmail() {
        return email;
    }
}
