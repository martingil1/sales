package models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "PRODUCT")
public class Product {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_product")
    @Id
    private Long idProduct;

    private String name;

    private Long price;

    private Integer cant;

}
