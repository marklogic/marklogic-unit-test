/*
 * Copyright (c) 2018-2025 Progress Software Corporation and/or its subsidiaries or affiliates. All Rights Reserved.
 */
package com.marklogic.test.unit;

/**
 * Captures the data for a test case failure.
 */
public class JUnitTestFailure {

    private String type;
    private String message;
    private String failureXml;

    public JUnitTestFailure(String type, String message, String failureXml) {
        this.type = type;
        this.message = message;
        this.failureXml = failureXml;
    }

    @Override
    public String toString() {
        return String.format("[type: %s, message: %s, failureXml: %s]", type, message, failureXml);
    }

    public String getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    public String getFailureXml() {
        return failureXml;
    }
}
