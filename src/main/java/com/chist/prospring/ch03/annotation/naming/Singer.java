package com.chist.prospring.ch03.annotation.naming;

import org.springframework.stereotype.Component;

@Component("johnMayer")
@Trophy(name = {"grammy", "platinum disk"})
//@Award({"grammy", "platinum disk"}) //similar
//@Award(prize = {"grammy", "platinum disk"}) // similar
//@Award(value = {"grammy", "platinum disk"}) // similar
public class Singer {

    private String lyric = "We found a message in a bottle we were drinking";

    public void sing() {
        System.out.println(lyric);
    }
}
