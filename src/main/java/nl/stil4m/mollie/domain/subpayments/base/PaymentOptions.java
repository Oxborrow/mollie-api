package nl.stil4m.mollie.domain.subpayments.base;

import java.util.Map;

/**
 * @author Oscar Farg
 */
public interface PaymentOptions {

    Map<String, String> getParameters();
}
