package com.binance.api.client.domain.event;

import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.market.OrderBookEntry;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PartialDepthEvent {
    @JsonProperty("lastUpdateId")
    private long lastUpdateId;
    @JsonProperty("bids")
    private List<OrderBookEntry> bids;
    @JsonProperty("asks")
    private List<OrderBookEntry> asks;

    public long getLastUpdateId() {
        return lastUpdateId;
    }

    public void setLastUpdateId(long lastUpdateId) {
        this.lastUpdateId = lastUpdateId;
    }

    public List<OrderBookEntry> getBids() {
        return bids;
    }

    public void setBids(List<OrderBookEntry> bids) {
        this.bids = bids;
    }

    public List<OrderBookEntry> getAsks() {
        return asks;
    }

    public void setAsks(List<OrderBookEntry> asks) {
        this.asks = asks;
    }

    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("lastUpdateId", lastUpdateId)
                .append("bids", bids)
                .append("asks", asks)
                .toString();
    }
}
