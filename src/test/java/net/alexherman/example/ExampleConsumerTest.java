package net.alexherman.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ExampleConsumerTest {

    private ExampleConsumer underTest;

    @Before
    public void setup() {
        underTest = ExampleConsumer.create();
    }

    @Test
    public void itGetsSomeKnowledge() {
        String response = underTest.dropKnowledge();
        assertNotNull(response);
    }


}