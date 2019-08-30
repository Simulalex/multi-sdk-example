/*
 * Licensed Materials - Property of IBM
 * 5725Z85
 * (C) Copyright IBM Corp. 2009, 2018. All Rights Reserved.
 * US Government Users Restricted Rights - Use, duplication or
 * disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 */

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