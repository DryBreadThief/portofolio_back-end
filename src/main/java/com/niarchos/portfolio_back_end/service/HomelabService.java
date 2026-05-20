package com.niarchos.portfolio_back_end.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.niarchos.portfolio_back_end.dto.HomelabDto;

@Service
public class HomelabService {

    public List<HomelabDto> getAllHomelabs() {

        // ================= TEMP FAKE DATA - REPLACE WHEN DATABASE IS ADDED =================
        return List.of(
                new HomelabDto(
                        1L,
                        "Basic Home Server",
                        "A small server used for learning Linux, networking, Docker, and backend deployment.",
                        "Linux, Docker, SSH",
                        "/assets/images/homelabs/home-server.webp",
                        "In Progress",
                        true,
                        1
                ),
                new HomelabDto(
                        2L,
                        "Docker Deployment Lab",
                        "A lab for deploying frontend and backend services with containers.",
                        "Docker, Docker Compose, Nginx",
                        "/assets/images/homelabs/docker-lab.webp",
                        "In Progress",
                        true,
                        2
                ),
                new HomelabDto(
                        3L,
                        "Network Segmentation Lab",
                        "Practice lab for separating frontend, backend, and database services into different network zones.",
                        "VLANs, Firewall, Nginx",
                        "/assets/images/homelabs/network-lab.webp",
                        "Planned",
                        true,
                        3
                ),
                new HomelabDto(
                        4L,
                        "Proxmox Virtualization Lab",
                        "Future lab for testing VMs, containers, and service isolation.",
                        "Proxmox, Linux, VMs",
                        "/assets/images/homelabs/proxmox.webp",
                        "Planned",
                        false,
                        10
                )
        )
                .stream()
                .sorted(Comparator.comparingInt(HomelabDto::getDisplayOrder))
                .toList();
        // ================= END TEMP FAKE DATA =================
    }

    public List<HomelabDto> getTopHomelabs() {
        return getAllHomelabs()
                .stream()
                .filter(HomelabDto::isTop)
                .sorted(Comparator.comparingInt(HomelabDto::getDisplayOrder))
                .toList();
    }
}
