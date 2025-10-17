package epicode.u5d9hw.payloads.blogs;


import jakarta.validation.constraints.NotNull;

public record NewBlogPostPayload(
		@NotNull(message = "L'id dell'autore è obbligatorio")
		Integer authorId,
		@NotNull(message = "La categoria è obbligatoria")
		String category,
		String content,
		@NotNull(message = "Il tempo di lettura è obbligatorio")
		double readingTime,
		@NotNull(message = "Il titolo è obbligatorio")
		String title
) {
}
