/*
 * Copyright (c) 2018-2025 Progress Software Corporation and/or its subsidiaries or affiliates. All Rights Reserved.
 */
package com.marklogic.junit5;

import org.jdom2.Namespace;

/**
 * Provides an array of Namespace objects that can be registered with JDOM for use in XPath expressions.
 */
public interface NamespaceProvider {

    Namespace[] getNamespaces();
}
