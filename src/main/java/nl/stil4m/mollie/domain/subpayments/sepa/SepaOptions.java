package nl.stil4m.mollie.domain.subpayments.sepa;

import nl.stil4m.mollie.domain.subpayments.base.AbstractPaymentOptions;

public class SepaOptions extends AbstractPaymentOptions {

    public static final String CONSUMER_NAME = "consumerName";
    public static final String CONSUMER_ACCOUNT = "consumerAccount";

    public SepaOptions(String consumerName, String consumerAccount) {
        getParameters().put(CONSUMER_NAME, consumerName);
        getParameters().put(CONSUMER_ACCOUNT, consumerAccount);
    }

    public String getConsumerName() {
        return getParameters().get(CONSUMER_NAME);
    }

    public String getConsumerAccount() {
        return getParameters().get(CONSUMER_ACCOUNT);
    }
}
