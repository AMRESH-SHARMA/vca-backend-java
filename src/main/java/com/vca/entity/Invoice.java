package com.vca.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Invoices")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoice_id")
    private int invoiceId;

    @Column(name = "price")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

    @ManyToOne
    @JoinColumn(name = "alt_id")
    private AlternateComponent alternateComponent;

    @ManyToOne
    @JoinColumn(name = "registration_id")
    private Registration registration;

    // Constructors, getters, and setters

    public Invoice() {
    }

    public Invoice(Double price, Model model, AlternateComponent alternateComponent, Registration registration) {
//    public Invoice(Double price, Variant variant) {
        this.price = price;
        this.model = model;
        this.alternateComponent = alternateComponent;
        this.registration = registration;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public AlternateComponent getAlternateComponent() {
        return alternateComponent;
    }

    public void setAlternateComponent(AlternateComponent alternateComponent) {
        this.alternateComponent = alternateComponent;
    }

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }
}