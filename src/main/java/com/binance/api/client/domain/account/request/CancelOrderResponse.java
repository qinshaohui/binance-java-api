package com.binance.api.client.domain.account.request;

import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.OrderSide;
import com.binance.api.client.domain.OrderStatus;
import com.binance.api.client.domain.OrderType;
import com.binance.api.client.domain.TimeInForce;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Response object returned when an order is canceled.
 *
 * @see CancelOrderRequest for the request
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CancelOrderResponse {

  private String symbol;

  private String origClientOrderId;

  private Long orderId;

  private String clientOrderId;

  private Long transactTime;

  private String price;

  private String origQty;

  private String executedQty;

  private String cummulativeQuoteQty;

  private OrderStatus status;

  private TimeInForce timeInForce;

  private OrderType type;

  private OrderSide side;

  public String getSymbol() {
    return symbol;
  }

  public CancelOrderResponse setSymbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  public String getOrigClientOrderId() {
    return origClientOrderId;
  }

  public CancelOrderResponse setOrigClientOrderId(String origClientOrderId) {
    this.origClientOrderId = origClientOrderId;
    return this;
  }

  public Long getOrderId() {
    return orderId;
  }

  public CancelOrderResponse setOrderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  public String getClientOrderId() {
    return clientOrderId;
  }

  public CancelOrderResponse setClientOrderId(String clientOrderId) {
    this.clientOrderId = clientOrderId;
    return this;
  }

  public Long getTransactTime() {
    return transactTime;
  }

  public String getPrice() {
    return price;
  }

  public String getOrigQty() {
    return origQty;
  }

  public String getExecutedQty() {
    return executedQty;
  }

  public String getCummulativeQuoteQty() {
    return cummulativeQuoteQty;
  }

  public OrderStatus getStatus() {
    return status;
  }

  public TimeInForce getTimeInForce() {
    return timeInForce;
  }

  public OrderType getType() {
    return type;
  }

  public OrderSide getSide() {
    return side;
  }

  public void setTransactTime(Long transactTime) {
    this.transactTime = transactTime;
  }

  public CancelOrderResponse setPrice(String price) {
    this.price = price;
    return this;
  }

  public CancelOrderResponse setOrigQty(String origQty) {
    this.origQty = origQty;
    return this;
  }

  public CancelOrderResponse setExecutedQty(String executedQty) {
    this.executedQty = executedQty;
    return this;
  }

  public CancelOrderResponse setCummulativeQuoteQty(String cummulativeQuoteQty) {
    this.cummulativeQuoteQty = cummulativeQuoteQty;
    return this;
  }

  public CancelOrderResponse setStatus(OrderStatus status) {
    this.status = status;
    return this;
  }

  public CancelOrderResponse setTimeInForce(TimeInForce timeInForce) {
    this.timeInForce = timeInForce;
    return this;
  }

  public CancelOrderResponse setType(OrderType type) {
    this.type = type;
    return this;
  }

  public CancelOrderResponse setSide(OrderSide side) {
    this.side = side;
    return this;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
            .append("symbol", symbol)
            .append("origClientOrderId", origClientOrderId)
            .append("orderId", orderId)
            .append("clientOrderId", clientOrderId)
            .append("transactTime", transactTime)
            .append("price", price)
            .append("origQty", origQty)
            .append("executedQty", executedQty)
            .append("cummulativeQuoteQty", cummulativeQuoteQty)
            .append("status", status)
            .append("timeInForce", timeInForce)
            .append("type", type)
            .append("side", side)
            .toString();
  }
}
