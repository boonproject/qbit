package io.advantageous.qbit.service;

import io.advantageous.qbit.message.MethodCall;
import io.advantageous.qbit.message.Response;

/**
 * Use this to register for after method calls for services.
 * Created by Richard on 8/26/14.
 * @author rhightower
 */
public interface AfterMethodCall {


    boolean after(MethodCall call, Response response);
}
