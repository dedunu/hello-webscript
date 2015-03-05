package org.dedunu.alfresco;

import java.util.HashMap;
import java.util.Map;

import org.springframework.extensions.webscripts.Cache;
import org.springframework.extensions.webscripts.DeclarativeWebScript;
import org.springframework.extensions.webscripts.Status;
import org.springframework.extensions.webscripts.WebScriptRequest;

public class HelloWorldWebScript extends DeclarativeWebScript {

    @Override
    protected Map<String, Object> executeImpl(WebScriptRequest req,
             Status status, Cache cache) {
        Map<String, Object> model = new HashMap<String, Object>();

        model.put("helloMessage", "Hello World! - Welcome to Alfresco Development!");

        return model;
    }
}
