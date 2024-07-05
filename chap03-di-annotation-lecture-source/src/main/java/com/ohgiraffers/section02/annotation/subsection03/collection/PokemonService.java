package com.ohgiraffers.section02.annotation.subsection03.collection;

import com.ohgiraffers.section02.annotation.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("pokemonServiceCollection")
public class PokemonService {

    // 생성자 주입
    // 모든 포켓몬을 불러왔을 때는 사전순으로 정렬됨

    // 1. List 타입으로 주입
//    private List<Pokemon> pokemonList;
//
//    @Autowired
//    public PokemonService(List<Pokemon> pokemonList) {
//        this.pokemonList = pokemonList;
//    }

//    public void pokemonAttack() {
//        for (Pokemon pokemon : pokemonList) {
//            pokemon.attack();
//        }
//    }

    // 2. Map 타입으로 주입
    private Map<String, Pokemon>pokemonMap;

    @Autowired
    public PokemonService(Map<String, Pokemon> pokemonMap) {
        this.pokemonMap = pokemonMap;
    }

    public void pokemonAttack() {
        pokemonMap.forEach((k, v) -> {
            System.out.println("key : " + k);
            System.out.println("공격 : " );
            v.attack();
        });
    }
}
