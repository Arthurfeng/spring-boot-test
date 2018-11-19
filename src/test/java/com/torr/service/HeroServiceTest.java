package com.torr.service;

import com.torr.domain.Hero;
import com.torr.repository.HeroRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class HeroServiceTest {

    @Resource
    private HeroService heroService;

    @Resource
    private HeroRepository heroRepository;

    @Test
    public void test(){
        Hero hero = heroRepository.findByCareer("adviser");
        System.out.println(hero.getHeros().get(0).getId());
        hero.getHeros().forEach(foo1 -> System.err.println(foo1.getName() + " " + foo1.getParent().getName()));
        hero.getSoldiers().forEach(System.err::println);

    }


}
