package com.torr.service;

import com.torr.domain.Hero;

import java.util.List;

public interface HeroService {

    Hero insert(Hero hero);

    void delete(Hero hero);

    Hero update(Hero hero);

    List<Hero> findAll();

    Hero findOne(String Id);

    Hero findByCareer(String career);
}
