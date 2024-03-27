package models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "SALE_BOX")
@IdClass(SaleBoxId.class)
public class SaleBox {

    @Id
    @Column(name = "DATE_SALE_BOX")
    private LocalDateTime date;

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_SELLER", referencedColumnName = "ID_SELLER")
    private Seller idSeller;

    @Column(name = "TOTAL_SALES")
    private Long totalSales;

    @Column(name = "TOTAL_EXPENSE")
    private Long totalExpense;

    @Column(name = "TOTAL_DAY_BY_SELLER")
    private Long totalDayBySeller;

}
