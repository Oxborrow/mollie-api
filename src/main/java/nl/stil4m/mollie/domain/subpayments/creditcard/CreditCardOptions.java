package nl.stil4m.mollie.domain.subpayments.creditcard;

import nl.stil4m.mollie.domain.subpayments.paypal.PayPalOptions;

public class CreditCardOptions extends PayPalOptions {

    public static final String BILLING_ADDRESS = "billingAddress";
    public static final String BILLING_CITY = "billingCity";
    public static final String BILLING_REGION = "billingRegion";
    public static final String BILLING_POSTAL = "billingPostal";
    public static final String BILLING_COUNTRY = "billingCountry";

    public CreditCardOptions(String billingAddress, String billingCity, String billingRegion, String billingPostal, String billingCountry,
                             String shippingAddress, String shippingCity, String shippingRegion, String shippingPostal, String shippingCountry) {
        super(shippingAddress, shippingCity, shippingRegion, shippingPostal, shippingCountry);
        getParameters().put(BILLING_ADDRESS, billingAddress);
        getParameters().put(BILLING_CITY, billingCity);
        getParameters().put(BILLING_REGION, billingRegion);
        getParameters().put(BILLING_POSTAL, billingPostal);
        getParameters().put(BILLING_COUNTRY, billingCountry);
    }

    public String getBillingAddress() {
        return getParameters().get(BILLING_ADDRESS);
    }

    public String getBillingCity() {
        return getParameters().get(BILLING_CITY);
    }

    public String getBillingRegion() {
        return getParameters().get(BILLING_REGION);
    }

    public String getBillingPostal() {
        return getParameters().get(BILLING_POSTAL);
    }

    public String getBillingCountry() {
        return getParameters().get(BILLING_COUNTRY);
    }


}
