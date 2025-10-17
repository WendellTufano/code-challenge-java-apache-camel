package com.example.challenge.integration;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.http.base.HttpOperationFailedException;
import org.springframework.stereotype.Component;

/**
 * TODO: Implementar a rota do pagamento:
 * - from("direct:payOrder") com headers orderId e amount
 * - if amount > 1000 -> chamar failureUrl, else -> successUrl
 * - onException(HttpOperationFailedException) com retries/backoff das props
 * - chamar endpoints/beans para marcar PAID/FAILED no serviço
 */
@Component
public class PaymentRoute extends RouteBuilder {
  public static final String DIRECT_PAY = "direct:payOrder";

  private final PaymentProperties props;

  public PaymentRoute(PaymentProperties props) {
    this.props = props;
  }

  @Override
  public void configure() throws Exception {
    // TODO: implementar rota e onException
  }
}
