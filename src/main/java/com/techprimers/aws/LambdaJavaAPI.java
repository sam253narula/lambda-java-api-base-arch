package com.techprimers.aws;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Collections;

public class LambdaJavaAPI implements RequestHandler<Object, GatewayResponse> {

    @Override
    public GatewayResponse handleRequest(Object object, Context context) {

        String message = "Use this application as base architecture for building serverless applications on AWS Lambda";
        System.out.println(message);

        GatewayResponse response = new GatewayResponse(
                message,
                200,
                Collections.singletonMap("X-Powered-By", "TechPrimers"),
                false
        );
        return response;
    }
}
