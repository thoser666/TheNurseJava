package biz.brumm.thenursejava.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AuthResponseDTOTest {
  AuthResponseDTO authResponseDTO = new AuthResponseDTO();

  @Test
  void testSetAuthenticationToken() {
    authResponseDTO.setAuthenticationToken("authenticationToken");
  }

  @Test
  void testSetUsername() {
    authResponseDTO.setUsername("username");
  }

  @Test
  void testSetIsAdmin() {
    authResponseDTO.setIsAdmin("isAdmin");
  }

    @Test
    void testEquals() {
        boolean result = authResponseDTO.equals("o");
        Assertions.assertEquals(false, result);
    }

    @Test
    void testCanEqual() {
        boolean result = authResponseDTO.canEqual("other");
        Assertions.assertEquals(false, result);
    }

    @Test
    void testHashCode() {
        int result = authResponseDTO.hashCode();
        Assertions.assertEquals(357642, result);
    }

//    @Test
//    void testToString() {
//        String result = authResponseDTO.toString();
//        Assertions.assertEquals("replaceMeWithExpectedResult", result);
//    }
}

// Generated with love by TestMe :) Please raise issues & feature requests at:
// https://weirddev.com/forum#!/testme
