package com.torr.repository;

import com.torr.domain.Soldier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoldierRepository extends JpaRepository<Soldier,String> {
}
