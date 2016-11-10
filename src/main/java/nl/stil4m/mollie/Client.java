package nl.stil4m.mollie;

import nl.stil4m.mollie.concepts.CustomerPayments;
import nl.stil4m.mollie.concepts.Customers;
import nl.stil4m.mollie.concepts.Issuers;
import nl.stil4m.mollie.concepts.Methods;
import nl.stil4m.mollie.concepts.Payments;
import nl.stil4m.mollie.concepts.Refunds;
import nl.stil4m.mollie.concepts.Status;

public class Client {

    private final DynamicClient dynamicClient;
    private final String apiKey;


    public Client(DynamicClient dynamicClient, String apiKey) {
        this.dynamicClient = dynamicClient;
        this.apiKey = apiKey;
    }

    public Payments payments() {
        return dynamicClient.payments(apiKey);
    }

    public Status status() {
        return dynamicClient.status(apiKey);
    }

    public Methods methods() {
        return dynamicClient.methods(apiKey);
    }

    public Issuers issuers() {
        return dynamicClient.issuers(apiKey);
    }

    public Refunds refunds(String paymentId) {
        return dynamicClient.refunds(apiKey,paymentId);
    }

    public Customers customers() {
        return dynamicClient.customers(apiKey);
    }

    public CustomerPayments customerPayments(String customerId) {
        return dynamicClient.customerPayments(apiKey, customerId);
    }
}
