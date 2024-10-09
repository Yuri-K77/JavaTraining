package serial_deserial.jackson.jackson3;//package SerialDeserial.Jackson.Jackson3;
//
//import com.fasterxml.jackson.annotation.JsonInclude;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import com.fasterxml.jackson.annotation.JsonPropertyOrder;
//
//import java.util.List;
//
//@SuppressWarnings("all")
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//        "users"
//})
//public class Users {
//
//    @JsonProperty("users")
//    private List<User> users = null;
//
//    @JsonProperty("users")
//    public List<User> getUsers() {
//        return users;
//    }
//
//    @JsonProperty("users")
//    public void setUsers(List<User> users) {
//        this.users = users;
//    }
//
//    file = new File("src/main/java/com/javc/serialization/dto_pojo/users2.json");
//    Users users2 = objectMapper.readValue(file, Users.class);
//        System.out.println(users2
//                .getUsers()
//                .get(0)
//        .getName());
//
//    User andrey = users2.getUsers().get(0);
//        andrey.setName("Andrey");
//        andrey.setAddress("Minsk");
//
//        objectMapper.writeValue(new File("src/main/java/com/javc/serialization/dto_pojo/users3.json"), users2);
//}

