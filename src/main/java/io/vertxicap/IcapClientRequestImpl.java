package io.vertxicap;

import io.vertx.core.Handler;
import io.vertx.core.Vertx;

/**
 * Created by Rob Worsnop on 4/3/16.
 */
class IcapClientRequestImpl implements IcapClientRequest {

    private final IcapMethod method;
    private final String host;
    private final int port;
    private final String requestURI;
    private final Handler<IcapClientResponse> responseHandler;
    private final Vertx vertx;

    public IcapClientRequestImpl(IcapMethod method, String host, int port, String requestURI, Handler<IcapClientResponse> responseHandler, Vertx vertx) {
        this.method = method;
        this.host = host;
        this.port = port;
        this.requestURI = requestURI;
        this.responseHandler = responseHandler;
        this.vertx = vertx;
    }
}
