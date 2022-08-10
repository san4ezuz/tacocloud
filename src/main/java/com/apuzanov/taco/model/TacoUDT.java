package com.apuzanov.taco.model;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import java.util.List;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@AllArgsConstructor
@UserDefinedType("taco")
public class TacoUDT {
    private String name;
    private final List<IngredientUDT> ingredients;
}
