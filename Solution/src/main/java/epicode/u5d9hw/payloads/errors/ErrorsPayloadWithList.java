package epicode.u5d9hw.payloads.errors;

import java.util.Date;
import java.util.List;

public record ErrorsPayloadWithList(
		String message,
		Date timestamp,
		List<String> errorsList
) {
}
