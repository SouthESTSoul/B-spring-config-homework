package com.thoughtworks.capability.gtb.demospringconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties("mail")
public class MailConfig {

    private String hostname;
    private int port;
    private String from;
    private Credentials credentials;
    private List<String> defaultRecipients;
    private Map<String,String> additionalHeaders;

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public List<String> getDefaultRecipients() {
        return defaultRecipients;
    }

    public void setDefaultRecipients(List<String> defaultRecipients) {
        this.defaultRecipients = defaultRecipients;
    }

    public Map<String, String> getAdditionalHeaders() {
        return additionalHeaders;
    }

    public void setAdditionalHeaders(Map<String, String> additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @Override
    public String toString() {
        return "MailConfig{" +
                "hostname='" + hostname + '\'' +
                ", port=" + port +
                ", from='" + from + '\'' +
                ", credentials=" + credentials +
                ", defaultRecipients=" + defaultRecipients +
                ", additionalHeaders=" + additionalHeaders +
                '}';
    }
}
