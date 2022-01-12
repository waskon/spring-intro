package com.example;


import org.springframework.stereotype.Component;

import java.util.Random;

@Component("randomMessageService")
public class RandomTextMessageService implements MessageService{
    String [] tab= {
            "Wiadomosc1",
            "Wiadomosc2",
            "Wiadomosc3",
            "Wiadomosc4",
            "Wiadomosc5",
            "Wiadomosc6",
            "Wiadomosc7",
            "Wiadomosc8",
            "Wiadomosc9",
            "Wiadomosc10"

    };

    @Override
    public String getMessage() {
        Random random = new Random();
        return tab[random.nextInt(10)];
    }
}
