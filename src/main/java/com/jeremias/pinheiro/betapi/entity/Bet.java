package com.jeremias.pinheiro.betapi.entity;

import com.jeremias.pinheiro.betapi.enums.Modality;
import com.jeremias.pinheiro.betapi.enums.Winnner;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bet {

    private Long id;
    private String timeA,timeB;
    private double valueA,valueB;
    private Winnner winnner;
    private Date date;
    private Modality modality;
}
