package biz.brumm.thenursejava.entity;

import lombok.Data;

@Data
public class AuthResponse {
  private String authenticationToken;
  private String username;
  private String isAdmin;
}
