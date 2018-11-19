package com.torr.service.impl;

import com.torr.domain.Hero;
import com.torr.repository.HeroRepository;
import com.torr.service.HeroService;

import javax.annotation.Resource;
import java.util.List;

public class HeroServiceImpl implements HeroService {

    @Resource
    private HeroRepository heroRepository;


    @Override
    public Hero insert(Hero hero) {
        return heroRepository.save(hero);
    }

    @Override
    public void delete(Hero hero) {
        heroRepository.delete(hero);

    }

    @Override
    public Hero update(Hero hero) {
        return heroRepository.save(hero);
    }

    @Override
    public List<Hero> findAll() {
        return heroRepository.findAll();
    }

    @Override
    public Hero findOne(String Id) {
        return heroRepository.getOne(Id);
    }

    @Override
    public Hero findByCareer(String career) {
        return heroRepository.findByCareer(career);
    }
}
