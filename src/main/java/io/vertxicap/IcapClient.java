package io.vertxicap;

import io.vertx.core.Handler;
import io.vertx.core.Vertx;

/**
 * Created by Rob Worsnop on 4/3/16.
 */
public interface IcapClient {
    static IcapClient create(Vertx vertx, IcapClientOptions options){
        return new IcapClientImpl(vertx, options);
    }

    static IcapClient create(Vertx vertx){
        return new IcapClientImpl(vertx, new IcapClientOptions());
    }

    IcapClientRequest request(IcapMethod method, String requestURI, Handler<IcapClientResponse> responseHandler);
    IcapClientRequest options(String requestURI, Handler<IcapClientResponse> responseHandler);
    IcapClientRequest reqmod(String requestURI, Handler<IcapClientResponse> responseHandler);
    IcapClientRequest respmod(String requestURI, Handler<IcapClientResponse> responseHandler);
}
