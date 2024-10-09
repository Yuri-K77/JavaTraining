package rest_assured.gorest_co_in.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class User {

    @JsonProperty("email")
    private String Email;
    @JsonProperty("gender")
    private String Gender;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("status")
    private String status;
}
