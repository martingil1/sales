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
@Table(name = "SALE")
public class Sale {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_sale")
    @Id
    private Long idSale;

    private LocalDateTime date;

    @Column(name = "mode_sale")
    private String modeSale;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Product> products;

}
