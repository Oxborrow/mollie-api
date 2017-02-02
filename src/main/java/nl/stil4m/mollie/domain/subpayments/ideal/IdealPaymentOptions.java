package nl.stil4m.mollie.domain.subpayments.ideal;

import nl.stil4m.mollie.domain.subpayments.base.AbstractPaymentOptions;

public class IdealPaymentOptions extends AbstractPaymentOptions {

    public static final String ISSUER = "issuer";

    public IdealPaymentOptions(String issuer) {
        getParameters().put(ISSUER, issuer);
    }

    public String getIssuer() {
        return getParameters().get(ISSUER);
    }
}
