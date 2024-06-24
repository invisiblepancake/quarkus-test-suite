package io.quarkus.ts.vertx;

import jakarta.enterprise.context.ApplicationScoped;

import io.quarkus.vertx.ConsumeEvent;

@ApplicationScoped
public class GreetingService {

    @ConsumeEvent("greetings")
    public String greet(String name) {
        return "Greetings, " + name;
    }
}