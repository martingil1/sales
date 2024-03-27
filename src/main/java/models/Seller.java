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
    @Column(name = "ID_SELLER")
    @Id
    private Long idSeller;

    @Column(name = "NAME_SELLER")
    private String name;

    private String pass;

    @Column(name = "ENTRY_HOUR")
    private LocalDateTime entryHour;

    @Column(name = "EXIT_HOUR")
    private LocalDateTime exitHour;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Sale> sales;

}
