package com.niarchos.portfolio_back_end.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.niarchos.portfolio_back_end.dto.ExperienceDto;

@Service
public class ExperienceService {

    public List<ExperienceDto> getAllExperience() {

        // ================= TEMP FAKE DATA - REPLACE WHEN DATABASE IS ADDED =================
        return List.of(
                new ExperienceDto(
                        1L,
                        "Helpdesk / IT Support",
                        "Company / Organization Name",
                        "2024",
                        "Present",
                        "Providing technical support, troubleshooting user issues, handling tickets, and assisting with IT operations.",
                        "Jira, Windows, Linux, Networking",
                        true,
                        1
                ),
                new ExperienceDto(
                        2L,
                        "SOC / Monitoring Practice",
                        "Learning / Work Environment",
                        "2024",
                        "Present",
                        "Learning security monitoring concepts, QRadar basics, events, flows, and infrastructure health monitoring.",
                        "QRadar, XClarity, Logs, Monitoring",
                        true,
                        2
                ),
                new ExperienceDto(
                        3L,
                        "Portfolio Backend Development",
                        "Personal Project",
                        "2026",
                        "Present",
                        "Building a Spring Boot backend for serving portfolio data to an Angular frontend.",
                        "Java, Spring Boot, REST API",
                        true,
                        3
                ),
                new ExperienceDto(
                        4L,
                        "Future Experience",
                        "To be decided",
                        "Future",
                        "Future",
                        "Placeholder for future work, learning, or project experience.",
                        "To be decided",
                        false,
                        10
                )
        )
                .stream()
                .sorted(Comparator.comparingInt(ExperienceDto::getDisplayOrder))
                .toList();
        // ================= END TEMP FAKE DATA =================
    }

    public List<ExperienceDto> getTopExperience() {
        return getAllExperience()
                .stream()
                .filter(ExperienceDto::isTop)
                .sorted(Comparator.comparingInt(ExperienceDto::getDisplayOrder))
                .toList();
    }
}
