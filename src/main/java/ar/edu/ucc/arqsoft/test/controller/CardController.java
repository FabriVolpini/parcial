package ar.edu.ucc.arqsoft.test.controller;

import ar.edu.ucc.arqsoft.test.dao.CardDao;
import ar.edu.ucc.arqsoft.test.dto.CardDto;
import ar.edu.ucc.arqsoft.test.dto.ResponseDto;
import ar.edu.ucc.arqsoft.test.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CardController {

    //https://codeday.me/es/qa/20181204/11199.html
    @Autowired
    CardService cardService;

    @SuppressWarnings({"rawtypes"})
    @RequestMapping(value = "card/new", method = RequestMethod.POST, produces = "application/JSON")
    public ResponseEntity<?> newCard(@RequestBody CardDto cardDto) throws Exception{
        ResponseDto response = cardService.newCard(cardDto);
        return new ResponseEntity<Object>(cardDto, HttpStatus.CREATED);
    }

    

}
