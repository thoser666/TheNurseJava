package biz.brumm.thenursejava.mapper;

import biz.brumm.thenursejava.dto.AuthResponseDTO;
import biz.brumm.thenursejava.entity.AuthResponse;
import org.mapstruct.Mapper;

@Mapper
public interface AuthResponseMapper {

    AuthResponseDTO authResponseToAuthResponseDTO(AuthResponse authResponse);
}
