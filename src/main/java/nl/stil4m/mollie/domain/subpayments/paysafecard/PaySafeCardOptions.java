package nl.stil4m.mollie.domain.subpayments.paysafecard;

import nl.stil4m.mollie.domain.subpayments.base.AbstractPaymentOptions;

public class PaySafeCardOptions extends AbstractPaymentOptions {

    public static final String CUSTOMER_REFERENCE = "customerReference";

    public PaySafeCardOptions(String customerReference) {
        getParameters().put(CUSTOMER_REFERENCE, customerReference);
    }

    public String getCustomerReference() {
        return getParameters().get(CUSTOMER_REFERENCE);
    }
}
