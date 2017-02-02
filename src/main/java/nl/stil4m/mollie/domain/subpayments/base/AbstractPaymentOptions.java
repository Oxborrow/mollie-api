package nl.stil4m.mollie.domain.subpayments.base;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Oscar Farg
 */
public abstract class AbstractPaymentOptions implements PaymentOptions {

    @JsonIgnore
    private Map<String, String> parameters = new HashMap<>();

    public Map<String, String> getParameters() {
        return parameters;
    }

}
