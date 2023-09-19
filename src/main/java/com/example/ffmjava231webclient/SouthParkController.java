package com.example.ffmjava231webclient;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/southpark")
@RequiredArgsConstructor
public class SouthParkController {

   private final SouthParkService southParkService;

    @GetMapping
    SouthParkCharacterResponse getCharacter(){
        return southParkService.getCharacter();
    }
}
