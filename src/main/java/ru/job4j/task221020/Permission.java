package ru.job4j.task221020;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;

@Data
@Builder
public class Permission {
    private int id;
    private String name;

    @Singular("accessBy")
    private List<String> rules;
}