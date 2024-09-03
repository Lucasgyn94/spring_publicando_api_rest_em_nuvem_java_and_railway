package me.dio.spring_api_rest_em_nuvem_java_railway.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Card {
    private Long id;
    private String number;
    private BigDecimal limit;

}
