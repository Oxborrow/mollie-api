package nl.stil4m.mollie.domain.subpayments.banktransfer;

import nl.stil4m.mollie.domain.subpayments.base.AbstractPaymentOptions;

public class BankTransferOptions extends AbstractPaymentOptions {

    public static final String BILLING_EMAIL = "billingEmail";
    public static final String DUE_DATE = "dueDate";

    public BankTransferOptions(String billingEmail, String dueDate) {
        getParameters().put(BILLING_EMAIL, billingEmail);
        getParameters().put(DUE_DATE, dueDate);
    }

    public String getBillingEmail() {
        return getParameters().get(BILLING_EMAIL);
    }

    public String getDueDate() {
        return getParameters().get(DUE_DATE);
    }
}
