package ar.edu.ucc.arqsoft.test.service;


import ar.edu.ucc.arqsoft.test.dao.DaoGenerico;
import ar.edu.ucc.arqsoft.test.dto.CardDto;
import ar.edu.ucc.arqsoft.test.dto.ResponseDto;
import ar.edu.ucc.arqsoft.test.model.Card;
import ar.edu.ucc.arqsoft.test.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    @Autowired
    DaoGenerico<User, Long> userDao;

    @Autowired
    DaoGenerico<Card, Long> cardDao;


    public ResponseDto newCard(CardDto cardDto){
        //Card
        if (userDao.load(cardDto.getUser().g)
    }

}
