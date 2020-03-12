package br.com.rd.exerciciospring.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class CupomItem {




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cupom_item")
    private Long idCupom;

    @Id
//    @OneToMany
    @JoinColumn(name = "id_cupom")
    private Long IdCupom;


    @Id
//    @OneToMany
    @JoinColumn (name = "id_produto")

    @Column(name = "qt_produto")
    private long qt_produto;

    @Column(name = "vl_produto")
    private BigDecimal vlProduto;


}
