/*
 * Copyright (c) 2018-2025 Progress Software Corporation and/or its subsidiaries or affiliates. All Rights Reserved.
 */
package org.example;

import com.marklogic.junit5.spring.AbstractSpringMarkLogicTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This is an example of testing a custom resource extension via a Java class - EchoManager - that extends the
 * MarkLogic Java Client's ResourceManager class.
 */
public class EchoTest extends AbstractSpringMarkLogicTest {

	@Test
	public void test() {
		String response = new EchoManager(getDatabaseClient()).echo("Hello world");
		assertEquals("You said: Hello world", response);
	}
}
