package ar.edu.ucc.arqsoft.test.service;


import ar.edu.ucc.arqsoft.test.dao.DaoGenerico;
import ar.edu.ucc.arqsoft.test.dto.*;
import ar.edu.ucc.arqsoft.test.model.Card;
import ar.edu.ucc.arqsoft.test.model.Transactions;
import ar.edu.ucc.arqsoft.test.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
public class CardService {

    @Autowired
    DaoGenerico<User, Long> userDao;

    @Autowired
    DaoGenerico<Card, Long> cardDao;
    @Autowired
    DaoGenerico<Transactions, Long> transactionsDao;


    public ResponseDto newCard(CardDto cardDto){
        Card card = new Card();


        User user = userDao.load(cardDto.getId());

        card.setBalance(cardDto.getBalance());
        card.setNumber(cardDto.getNumber());
        card.setUser(user);
        cardDao.saveOrUpdate(card);
        cardDto.setId(card.getId());

        return new ResponseDto(cardDto.getId().toString(), 01, "DONE");
    }




    public HashSet<TransactionsDto> getAllTrans(NewCardDto dto){

        List<Transactions> transactions = transactionsDao.getAll();
        HashSet<TransactionsDto> transactionsDto = new HashSet<TransactionsDto>();

        for (Transactions t: transactions){
            if ( t.getCard().getId() == dto.getId() ){
                transactionsDto.add(new TransactionsDto(t.getCard().getId(),t.getDate(),t.getAmount(),t.getOperationType(),new CardDto(t.getCard().getId())) );
            }
        }
        return transactionsDto;
    }


//
//    public ResponseDto chargeAmount(RequestDto requestDto){
//
//    }

}
