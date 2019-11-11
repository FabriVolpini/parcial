package ar.edu.ucc.arqsoft.test.dao;

import ar.edu.ucc.arqsoft.test.dto.CardDto;
import ar.edu.ucc.arqsoft.test.model.Card;
import org.springframework.stereotype.Repository;

//Provides CRUD operations
@Repository
public class CardDao extends DaoGenerico<Card, Long>{

    boolean useCard(CardDto dto, double balance);

}
