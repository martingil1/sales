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
    @Column(name = "ID_SALE")
    @Id
    private Long idSale;

    @Column(name = "DATE_SALE")
    private LocalDateTime date;

    @Column(name = "MODE_SALE")
    private String modeSale;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Product> products;

}
