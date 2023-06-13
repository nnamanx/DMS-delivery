package com.nnamanx.deliverymanagementsystem.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    int count;
    double totalAmount;

    @OneToMany
    List<Food> food;

    @OneToOne
    Cart cart;

    @OneToOne
    MyUser myUser;


    public double totalBudget() {
        double budget = 0.0;
        for (Food foodItem : food) {
            double foodPrice = foodItem.getPrice();
            int foodCount = foodItem.getCount();
            budget += foodPrice * foodCount;
        }
        return budget;

    }

}
