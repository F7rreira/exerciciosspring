package br.com.rd.exerciciospring.Repository;

import br.com.rd.exerciciospring.Model.Cupom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CupomRepository extends JpaRepository<Cupom,Long> {
    List<Cupom>findByIdCupom(String idCupom);
    List<Cupom>findByDtVenda(String dtVenda);

}
