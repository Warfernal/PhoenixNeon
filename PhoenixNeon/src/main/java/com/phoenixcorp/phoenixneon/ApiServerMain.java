package com.phoenixcorp.phoenixneon;
import io.javalin.Javalin;

public class ApiServerMain {
    public static void main(String[] args) {
        var app = Javalin.create(cfg -> cfg.staticFiles.add("/static"));
        app.get("/api/status", ctx -> ctx.json("{\"status\":\"running\"}"));
        app.start(8080);
        System.out.println("Phoenix Neon running on http://localhost:8080");
    }
}
