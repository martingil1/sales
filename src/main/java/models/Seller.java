package models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "SELLER")
public class Seller {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_seller")
    @Id
    private Long idSeller;

    private String name;

    private String pass;

    private LocalDateTime entry;

    private LocalDateTime exit;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Sale> sales;

}
