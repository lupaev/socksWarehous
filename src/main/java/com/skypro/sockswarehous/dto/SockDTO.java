package com.skypro.sockswarehous.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * DTO сущности Носков
 */

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SockDTO {

    @JsonIgnore
    Long id;

    @NotNull
    @NotBlank
    String color;

    @Min(value = 1, message = "Минимальное значение 1")
    @Max(value = 100, message = "Максимальное значение 100")
    Integer cottonPart;

    @Min(value = 1, message = "Минимальное значение 1")
    Integer quantity;

}
