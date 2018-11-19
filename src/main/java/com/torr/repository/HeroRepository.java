package com.torr.repository;

import com.torr.domain.Hero;
import com.torr.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroRepository extends JpaRepository<Hero,String> {
    Hero findByCareer(String career);
}
