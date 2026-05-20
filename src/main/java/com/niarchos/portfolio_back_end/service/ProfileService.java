package com.niarchos.portfolio_back_end.service;

import com.niarchos.portfolio_back_end.dto.ProfileDto;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    public ProfileDto getProfile() {

        // ================= TEMP FAKE DATA - REPLACE WHEN DATABASE IS ADDED =================
        return new ProfileDto(
                1L,
                "Theodoros Niarchos",
                "IT Support / Backend / Homelab Enthusiast",
                "I am building a personal portfolio to showcase my projects, homelab progress, certificates, and technical experience.",
                "Greece",
                "https://github.com/YOUR_USERNAME",
                "https://linkedin.com/in/YOUR_LINKEDIN",
                "your-email@example.com"
        );
        // ================= END TEMP FAKE DATA =================
    }
}
