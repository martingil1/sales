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
    private LocalDateTime date;

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_seller", referencedColumnName = "id_seller")
    private Seller idSeller;

    @Column(name = "total_sales")
    private Long totalSales;

    @Column(name = "total_expense")
    private Long totalExpense;

    @Column(name = "total_day_by_seller")
    private Long totalDayBySeller;

}
