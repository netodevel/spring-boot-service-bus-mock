package br.com.netodevel.springservicebusmock;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("azure")
public class ServiceBusMockProperties {

    private boolean mock = false;

    public boolean isMock() {
        return mock;
    }

    public void setMock(boolean mock) {
        this.mock = mock;
    }
}
