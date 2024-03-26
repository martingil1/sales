package models;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
public class SaleBoxId implements Serializable {

    private LocalDateTime date;

    private Seller idSeller;

}
