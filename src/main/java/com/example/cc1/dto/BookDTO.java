package com.example.cc1.dto;

import lombok.*;

import java.util.Date;
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookDTO {
    private String titre;
    private String publisher;
    private Date datePublication;
    private double price;
    private String resume;
}
