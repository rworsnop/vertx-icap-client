package io.vertxicap;

import io.vertx.core.Handler;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.streams.ReadStream;

/**
 * Created by Rob Worsnop on 4/3/16.
 */
public interface IcapClientResponse extends ReadStream<Buffer>{

    @Override
    IcapClientResponse resume();

    @Override
    IcapClientResponse exceptionHandler(Handler<Throwable> handler);

    @Override
    IcapClientResponse handler(Handler<Buffer> handler);

    @Override
    IcapClientResponse pause();

    @Override
    IcapClientResponse endHandler(Handler<Void> endHandler);
}
