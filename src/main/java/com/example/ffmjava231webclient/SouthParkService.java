package com.example.ffmjava231webclient;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Objects;

@Service
public class SouthParkService {

    private final WebClient webClient = WebClient.create("https://spapi.dev/api/characters");

    public SouthParkCharacterResponse getCharacter() {

      ResponseEntity<SouthParkCharacterResponse> response =   webClient
                .get()
                .uri("/1")
                .retrieve()
                .toEntity(SouthParkCharacterResponse.class)
                .block();


        return Objects.requireNonNull(response).getBody();
    }
}
