package net.alexherman.example;

import net.alexherman.example.api.DefaultApi;

public class ExampleConsumer {

    private final DefaultApi swansonQuotesApi;

    public static ExampleConsumer create() {
        return new ExampleConsumer(new DefaultApi());
    }

    public ExampleConsumer(DefaultApi swansonQuotesApi) {
        this.swansonQuotesApi = swansonQuotesApi;
    }

    public String dropKnowledge() {
        return swansonQuotesApi.quotesGet().get(0);
    }
}
