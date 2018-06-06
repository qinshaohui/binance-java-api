package com.binance.api.examples;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiWebSocketClient;
import com.binance.api.client.domain.market.CandlestickInterval;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Market data stream endpoints examples.
 *
 * It illustrates how to create a stream to obtain updates on market data such as executed trades.
 */
public class MarketDataStreamExample {

  public static void main(String[] args) throws InterruptedException, IOException {
    BinanceApiWebSocketClient client = BinanceApiClientFactory.newInstance().newWebSocketClient();

    // Listen for aggregated trade events for ETH/BTC
    client.onAggTradeEvent("ethbtc", response -> System.out.println(response));

    // Listen for changes in the order book in ETH/BTC
    client.onDepthEvent("ethbtc", response -> System.out.println(response));

    // Obtain 1m candlesticks in real-time for ETH/BTC
    client.onCandlestickEvent("ethbtc", CandlestickInterval.ONE_MINUTE, response -> System.out.println(response));

    // Listen for change in the top 5 level order book in ETH/BTC
    client.onPartialDepthEvent("ethbtc", 5, response -> System.out.println(response));

    // change in the top 5 level order book in ETH/BTC and BNB/BTC
    List<String> symbols = new ArrayList<>();
    symbols.add("ethbtc");
    symbols.add("bnbbtc");
    client.onMultiplePartialDepthEvent(symbols, 5, response -> System.out.println(response));

  }
}
