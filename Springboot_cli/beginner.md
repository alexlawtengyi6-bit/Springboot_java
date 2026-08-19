# Spring Boot Starters & CLI

## 1. What is Spring Boot?

Spring Boot is a Java framework that makes it easier to build web applications and REST APIs.

For a signup system:

Client
↓
Spring Boot Controller
↓
Service
↓
Repository
↓
Database

## 2. Spring Boot Starters

Spring Boot Starters are dependency packages that provide the libraries needed for specific features.

### Spring Web

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>


<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-validation</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>

spring --version
spring init --dependencies=web,data-jpa,validation signup-app
cd signup-app
./mvnw spring-boot:run
mvnw.cmd spring-boot:run

signup-app/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── com/example/signup/
                ├── SignupApplication.java
                ├── controller/
                │   └── UserController.java
                ├── service/
                │   └── UserService.java
                ├── model/
                │   └── User.java
                └── repository/
                    └── UserRepository.java

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
    private String password;

    public User() {
    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // Getters and setters
}

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);
}

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User signup(User user) {

        if (userRepository.existsByUsername(user.getUsername())) {
            throw new RuntimeException("Username already exists");
        }

        if (userRepository.existsByEmail(user.getEmail())) {
            throw new RuntimeException("Email already exists");
        }

        return userRepository.save(user);
    }
}

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public User signup(@RequestBody User user) {
        return userService.signup(user);
    }
}
/users/signup

Client
  ↓
UserController
  ↓
UserService
  ↓
UserRepository
  ↓
Database
