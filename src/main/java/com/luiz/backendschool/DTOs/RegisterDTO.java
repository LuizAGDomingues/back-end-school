package com.luiz.backendschool.DTOs;

import com.luiz.backendschool.enums.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
