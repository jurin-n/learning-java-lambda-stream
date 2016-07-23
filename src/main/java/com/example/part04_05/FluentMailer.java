package com.example.part04_05;

import java.util.function.Consumer;

public class FluentMailer {
    private FluentMailer() {
    }

    public FluentMailer from(final String address) {
        System.out.println("from:" + address);
        return this;
    }

    public FluentMailer to(final String to) {
        System.out.println("to:" + to);
        return this;
    }

    public FluentMailer subject(final String subject) {
        System.out.println("subject:" + subject);
        return this;
    }

    public FluentMailer body(final String body) {
        System.out.println("body:" + body);
        return this;
    }

    public static void send(final Consumer<FluentMailer> block) {
        FluentMailer mailer = new FluentMailer();
        block.accept(mailer);
        System.out.println("sending....");
    }
}
