package com.cpconnect.api.jobIntegracao.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Booking {

    @JsonProperty("bookingId")
    private int bookingId;
    @JsonProperty("bookingPMSId")
    private String bookingPMSId;
    @JsonProperty("alphaId")
    private String alphaId;
    @JsonProperty("startDate")
    private String startDate;
    @JsonProperty("endDate")
    private String endDate;
    @JsonProperty("roomTypePMSId")
    private String roomTypePMSId;
    @JsonProperty("rules")
    private Rules rules;
    @JsonProperty("rates")
    private List<Rates> rates;
    @JsonProperty("payments")
    private Payments payments;
    @JsonProperty("guests")
    private List<Guests> guests;
    @JsonProperty("total")
    private Total total;
    @JsonProperty("status")
    private String status;
    @JsonProperty("source")
    private String source;
    @JsonProperty("customer")
    private Customer customer;
    @JsonProperty("requestor")
    private Requestor requestor;
    @JsonProperty("property")
    private Property property;
    @JsonProperty("lastModified")
    private String lastModified;
    @JsonProperty("created")
    private String created;
    @JsonProperty("guestCounts")
    private List<GuestCounts> guestCounts;

    public Booking(int bookingId, String bookingPMSId, String alphaId, String startDate, String endDate, String roomTypePMSId, Rules rules, List<Rates> rates, Payments payments, List<Guests> guests, Total total, String status, String source, Customer customer, Requestor requestor, Property property, String lastModified, String created, List<GuestCounts> guestCounts) {
        this.bookingId = bookingId;
        this.bookingPMSId = bookingPMSId;
        this.alphaId = alphaId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.roomTypePMSId = roomTypePMSId;
        this.rules = rules;
        this.rates = rates;
        this.payments = payments;
        this.guests = guests;
        this.total = total;
        this.status = status;
        this.source = source;
        this.customer = customer;
        this.requestor = requestor;
        this.property = property;
        this.lastModified = lastModified;
        this.created = created;
        this.guestCounts = guestCounts;
    }

    public int getBookingId() {
        return bookingId;
    }

    public String getBookingPMSId() {
        return bookingPMSId;
    }

    public String getAlphaId() {
        return alphaId;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getRoomTypePMSId() {
        return roomTypePMSId;
    }

    public Rules getRules() {
        return rules;
    }

    public List<Rates> getRates() {
        return rates;
    }

    public Payments getPayments() {
        return payments;
    }

    public List<Guests> getGuests() {
        return guests;
    }

    public Total getTotal() {
        return total;
    }

    public String getStatus() {
        return status;
    }

    public String getSource() {
        return source;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Requestor getRequestor() {
        return requestor;
    }

    public Property getProperty() {
        return property;
    }

    public String getLastModified() {
        return lastModified;
    }

    public String getCreated() {
        return created;
    }

    public List<GuestCounts> getGuestCounts() {
        return guestCounts;
    }
}
