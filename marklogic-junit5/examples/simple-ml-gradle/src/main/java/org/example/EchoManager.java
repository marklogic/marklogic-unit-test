/*
 * Copyright (c) 2018-2025 Progress Software Corporation and/or its subsidiaries or affiliates. All Rights Reserved.
 */
package org.example;

import com.marklogic.client.DatabaseClient;
import com.marklogic.client.extensions.ResourceManager;
import com.marklogic.client.io.StringHandle;
import com.marklogic.client.util.RequestParameters;

public class EchoManager extends ResourceManager {

	public EchoManager(DatabaseClient client) {
		client.init("echo", this);
	}

	public String echo(String message) {
		RequestParameters params = new RequestParameters();
		params.put("message", message);
		return getServices().get(params, new StringHandle()).get();
	}
}
