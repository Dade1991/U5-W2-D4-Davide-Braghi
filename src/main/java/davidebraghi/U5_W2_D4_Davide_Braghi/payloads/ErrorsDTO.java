package davidebraghi.U5_W2_D4_Davide_Braghi.payloads;

import java.time.LocalDateTime;

public record ErrorsDTO(String message, LocalDateTime timestamp) {
}
