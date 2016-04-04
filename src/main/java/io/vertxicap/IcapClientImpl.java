package io.vertxicap;

import io.vertx.core.Handler;
import io.vertx.core.Vertx;

import static io.vertxicap.IcapMethod.*;

/**
 * Created by Rob Worsnop on 4/3/16.
 */
class IcapClientImpl implements IcapClient {
    private final Vertx vertx;
    private final IcapClientOptions options;

    IcapClientImpl(Vertx vertx, IcapClientOptions options) {
        this.vertx = vertx;
        this.options = options;
    }

    @Override
    public IcapClientRequest request(IcapMethod method, String requestURI, Handler<IcapClientResponse> responseHandler) {
        return doRequest(method, options.getDefaultHost(), options.getDefaultPort(), requestURI, responseHandler);
    }

    @Override
    public IcapClientRequest options(String requestURI, Handler<IcapClientResponse> responseHandler) {
        return request(OPTIONS, requestURI, responseHandler);
    }

    @Override
    public IcapClientRequest reqmod(String requestURI, Handler<IcapClientResponse> responseHandler) {
        return request(REQMOD, requestURI, responseHandler);
    }

    @Override
    public IcapClientRequest respmod(String requestURI, Handler<IcapClientResponse> responseHandler) {
        return request(RESPMOD, requestURI, responseHandler);
    }

    private IcapClientRequest doRequest(IcapMethod method, String host, int port, String requestURI, Handler<IcapClientResponse> responseHandler) {
        return new IcapClientRequestImpl(method, host, port, requestURI, responseHandler, vertx);
    }
}
