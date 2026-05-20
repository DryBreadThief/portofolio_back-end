package com.niarchos.portfolio_back_end.dto;

public class CertificateDto {
    private Long id;
    private String title;
    private String issuer;
    private String issueDate;
    private String imageUrl;
    private String credentialUrl;
    private boolean top;
    private int displayOrder;

    public CertificateDto(Long id, String title, String issuer, String issueDate,
                          String imageUrl, String credentialUrl, boolean top, int displayOrder) {
        this.id = id;
        this.title = title;
        this.issuer = issuer;
        this.issueDate = issueDate;
        this.imageUrl = imageUrl;
        this.credentialUrl = credentialUrl;
        this.top = top;
        this.displayOrder = displayOrder;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getIssuer() {
        return issuer;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getCredentialUrl() {
        return credentialUrl;
    }

    public boolean isTop() {
        return top;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }
}
