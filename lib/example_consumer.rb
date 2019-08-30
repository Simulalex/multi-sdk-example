require "swanson_quotes_client"

class ExampleConsumer

    def self.create
        ExampleConsumer.new(SwansonQuotesClient::DefaultApi.new())
    end

    def initialize(default_api)
        @default_api = default_api;
    end

    def dropKnowledge
        @default_api.quotes_get()[0]
    end

end
