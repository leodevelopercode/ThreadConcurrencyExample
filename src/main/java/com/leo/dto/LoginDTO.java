package com.leo.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author leo
 * @version 1.0
 */
@Data
public class LoginDTO implements Serializable {

    private String loginSign;

    private Integer currDate;

    private Integer expDate;

    private String token;

}
