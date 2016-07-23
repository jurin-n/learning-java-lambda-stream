package com.example.part04_05;

import static org.junit.Assert.*;

import org.junit.Test;

public class FluentMailerTest {

    @Test
    public void test() {
        FluentMailer.send(mailer -> mailer.from("aaa@test.org")
                .to("bbb@test.org").subject("build notification")
                .body("...much...better.."));
    }

}
