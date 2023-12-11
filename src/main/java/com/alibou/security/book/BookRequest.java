package com.alibou.security.book;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Getter
@Setter


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest {

    private Integer id;
    private String author;
    private String isbn;
}
