package ru.job4j.task221018;

import lombok.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@RequiredArgsConstructor
public class Category {
    @Getter
    @EqualsAndHashCode.Include
    @NonNull
    private Integer id;

    @Getter
    @Setter
    private String name;
}