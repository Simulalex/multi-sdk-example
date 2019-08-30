require "example_consumer"

describe ExampleConsumer do

    context "example_consumer" do
        it "should call the API" do
            knowledge = ExampleConsumer.create.dropKnowledge
            expect(knowledge).not_to be_nil
        end
    end
end

