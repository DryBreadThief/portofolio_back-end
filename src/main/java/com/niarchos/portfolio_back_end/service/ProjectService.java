package com.niarchos.portfolio_back_end.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.niarchos.portfolio_back_end.dto.ProjectDto;

@Service
public class ProjectService {

    public List<ProjectDto> getAllProjects() {

        // ================= TEMP FAKE DATA - REPLACE WHEN DATABASE IS ADDED =================
        return List.of(
                new ProjectDto(
                        1L,
                        "Portfolio Website",
                        "Personal portfolio website with projects, homelab history, certificates, and contact section.",
                        "Angular, Spring Boot",
                        "/assets/images/projects/portfolio.webp",
                        "https://github.com/YOUR_USERNAME/portfolio-site",
                        "",
                        true,
                        1
                ),
                new ProjectDto(
                        2L,
                        "Backend API",
                        "Spring Boot REST API for serving portfolio data.",
                        "Java, Spring Boot",
                        "/assets/images/projects/backend.webp",
                        "https://github.com/YOUR_USERNAME/portfolio-backend",
                        "",
                        true,
                        2
                ),
                new ProjectDto(
                        3L,
                        "Appointment Booking App",
                        "Academic project for booking appointments with service providers.",
                        "Angular, Spring Boot, PostgreSQL",
                        "/assets/images/projects/appointment-app.webp",
                        "",
                        "",
                        true,
                        3
                ),
                new ProjectDto(
                        4L,
                        "Future Project",
                        "Placeholder for a future project.",
                        "To be decided",
                        "/assets/images/projects/default.webp",
                        "",
                        "",
                        false,
                        10
                )
        )
                .stream()
                .sorted(Comparator.comparingInt(ProjectDto::getDisplayOrder))
                .toList();
        // ================= END TEMP FAKE DATA =================
    }

    public List<ProjectDto> getTopProjects() {
        return getAllProjects()
                .stream()
                .filter(ProjectDto::isTop)
                .sorted(Comparator.comparingInt(ProjectDto::getDisplayOrder))
                .toList();
    }
}
