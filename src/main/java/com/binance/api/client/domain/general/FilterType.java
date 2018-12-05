package com.binance.api.client.domain.general;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Filters define trading rules on a symbol or an exchange. Filters come in two forms: symbol filters and exchange filters.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public enum FilterType {
  // Symbol
  PRICE_FILTER,
  LOT_SIZE,
  MIN_NOTIONAL,
  MAX_NUM_ORDERS,
  MAX_ALGO_ORDERS,
  MAX_NUM_ALGO_ORDERS,
  ICEBERG_PARTS,
  MAX_POSITION,
  PERCENT_PRICE,

  // Exchange
  EXCHANGE_MAX_NUM_ORDERS,
  EXCHANGE_MAX_ALGO_ORDERS,

  // UNKNOWN
  UNKNOWN;

  @JsonCreator
  public static FilterType fromString(String value) {
    for (FilterType filterType : values()) {
      if (filterType.name().equalsIgnoreCase(value)) {
        return filterType;
      }
    }

    return UNKNOWN;
  }
}
