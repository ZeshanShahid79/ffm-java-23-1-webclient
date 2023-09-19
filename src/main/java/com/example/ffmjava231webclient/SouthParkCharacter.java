package com.example.ffmjava231webclient;

import java.util.List;

public record SouthParkCharacter(
        int id,
        String name,
        String age,
        List<SouthParkRelatives> relatives
) {
}
