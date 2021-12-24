package com.cigarro.cigarro.Cigar;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Long id;

    @Column(name = "brand_name")
    private String brand;

    @OneToMany
    @JoinColumn(name = "id")
    private Set<Cigar> cigar;

    public Set<Cigar> getCigar() {
        return cigar;
    }

    public void setCigar(Set<Cigar> cigar) {
        this.cigar = cigar;
    }

    public Brand() {
    }

    public Brand(Long id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }
}
