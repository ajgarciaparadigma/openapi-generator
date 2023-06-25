package com.paradigma.serveropenapigenerator.controller;

import com.paradigma.interfaces.rest.product.PetsApi;
import com.paradigma.interfaces.rest.product.dtos.Pet;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;


@Slf4j
@RestController
@RequiredArgsConstructor
public class PetsController implements PetsApi
{
    @Override
    public ResponseEntity<List<Pet>> listPets(Integer limit) {
        return ResponseEntity.ok(Arrays.asList(new Pet (1L,"Firulais"), new Pet (2L,"Michi")) );
    }
}