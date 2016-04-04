package io.vertxicap;

import io.vertx.core.net.ClientOptionsBase;

/**
 * Created by Rob Worsnop on 4/3/16.
 */
public class IcapClientOptions extends ClientOptionsBase{
    /**
     * The default value for host name = "localhost"
     */
    public static final String DEFAULT_DEFAULT_HOST = "localhost";

    /**
     * The default value for port = 80
     */
    public static final int DEFAULT_DEFAULT_PORT = 1344;

    private String defaultHost;
    private int defaultPort;

    public IcapClientOptions() {
        this.defaultHost = DEFAULT_DEFAULT_HOST;
        this.defaultPort = DEFAULT_DEFAULT_PORT;
    }

    public IcapClientOptions(IcapClientOptions other) {
        super(other);
        this.defaultHost = other.defaultHost;
        this.defaultPort = other.defaultPort;
    }

    public String getDefaultHost() {
        return defaultHost;
    }

    public void setDefaultHost(String defaultHost) {
        this.defaultHost = defaultHost;
    }

    public int getDefaultPort() {
        return defaultPort;
    }

    public void setDefaultPort(int defaultPort) {
        this.defaultPort = defaultPort;
    }
}
