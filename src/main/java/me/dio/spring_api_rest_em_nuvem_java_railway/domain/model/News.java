package me.dio.spring_api_rest_em_nuvem_java_railway.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class News {
    private Long id;
    private String icon;
    private String description;
}
