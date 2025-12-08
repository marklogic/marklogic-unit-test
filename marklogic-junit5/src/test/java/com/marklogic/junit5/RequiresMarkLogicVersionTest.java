/*
 * Copyright (c) 2018-2025 Progress Software Corporation and/or its subsidiaries or affiliates. All Rights Reserved.
 */
package com.marklogic.junit5;

import com.marklogic.junit5.spring.AbstractSpringMarkLogicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * This is a smoke test to ensure the two concrete conditions do not cause an error.
 */
class RequiresMarkLogicVersionTest extends AbstractSpringMarkLogicTest {

    @Test
    @ExtendWith(RequiresMarkLogic12.class)
    void requires12() {
        assertNotNull(getMarkLogicVersion());
    }

    @Test
    @ExtendWith(RequiresMarkLogic11.class)
    void requires11() {
        assertNotNull(getMarkLogicVersion());
    }
}
