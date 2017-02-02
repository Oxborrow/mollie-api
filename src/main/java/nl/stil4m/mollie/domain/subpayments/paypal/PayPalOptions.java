package nl.stil4m.mollie.domain.subpayments.paypal;

import nl.stil4m.mollie.domain.subpayments.base.AbstractPaymentOptions;

public class PayPalOptions extends AbstractPaymentOptions {

    public static final String SHIPPING_ADDRESS = "shippingAddress";
    public static final String SHIPPING_CITY = "shippingCity";
    public static final String SHIPPING_REGION = "shippingRegion";
    public static final String SHIPPING_POSTAL = "shippingPostal";
    public static final String SHIPPING_COUNTRY = "shippingCountry";

    public PayPalOptions(String shippingAddress, String shippingCity, String shippingRegion, String shippingPostal, String shippingCountry) {
        getParameters().put(SHIPPING_ADDRESS, shippingAddress);
        getParameters().put(SHIPPING_CITY, shippingCity);
        getParameters().put(SHIPPING_REGION, shippingRegion);
        getParameters().put(SHIPPING_POSTAL, shippingPostal);
        getParameters().put(SHIPPING_COUNTRY, shippingCountry);
    }

    public String getShippingAddress() {
        return getParameters().get(SHIPPING_ADDRESS);
    }

    public String getShippingCity() {
        return getParameters().get(SHIPPING_CITY);
    }

    public String getShippingRegion() {
        return getParameters().get(SHIPPING_REGION);
    }

    public String getShippingPostal() {
        return getParameters().get(SHIPPING_POSTAL);
    }

    public String getShippingCountry() {
        return getParameters().get(SHIPPING_COUNTRY);
    }
}
