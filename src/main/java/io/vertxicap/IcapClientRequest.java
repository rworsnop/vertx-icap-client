package io.vertxicap;

import io.vertx.core.Handler;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.streams.ReadStream;
import io.vertx.core.streams.WriteStream;

/**
 * Created by Rob Worsnop on 4/3/16.
 */
public interface IcapClientRequest extends WriteStream<Buffer>, ReadStream<IcapClientResponse> {
    @Override
    IcapClientRequest exceptionHandler(Handler<Throwable> handler);

    /**
     * @throws java.lang.IllegalStateException when no response handler is set
     */
    @Override
    IcapClientRequest write(Buffer data);

    @Override
    IcapClientRequest setWriteQueueMaxSize(int maxSize);

    @Override
    IcapClientRequest drainHandler(Handler<Void> handler);

    @Override
    IcapClientRequest handler(Handler<IcapClientResponse> handler);

    @Override
    IcapClientRequest pause();

    @Override
    IcapClientRequest resume();

    @Override
    IcapClientRequest endHandler(Handler<Void> endHandler);
}
