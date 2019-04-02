//package by.talking.Controller;
//
//import by.talking.Repo.UserDetailsRepo;
//import by.talking.domain.User;
//import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
//import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.time.LocalDateTime;
//
//@Controller
//@RequestMapping("/login")
//@EnableWebSecurity
//
//public class LoginController {
//    private final UserDetailsRepo userDetailsRepo;
//
//    public LoginController(UserDetailsRepo userDetailsRepo) {
//        this.userDetailsRepo = userDetailsRepo;
//    }
//
//    @GetMapping("/google")
//    @Bean
//    public PrincipalExtractor oauthGoogle(){
//        return map -> {
//            String id = (String) map.get("sub");
//
//            User user = userDetailsRepo.findById(id).orElseGet(() -> {
//                User newUser = new User();
//
//                newUser.setId(id);
//                newUser.setName((String) map.get("name"));
//                newUser.setEmail((String) map.get("email"));
//                newUser.setGender((String) map.get("gender"));
//                newUser.setLocale((String) map.get("locale"));
//                newUser.setUserpic((String) map.get("picture"));
//
//                return newUser;
//            });
//
//            user.setLastVisit(LocalDateTime.now());
//
//            return userDetailsRepo.save(user);
//        };
//
//    }
//
//    @GetMapping("/vk")
//    @Bean
//    public PrincipalExtractor oauthVk(){
//        return map -> {
//            String id = (String) map.get("sub");
//
//            User user = userDetailsRepo.findById(id).orElseGet(() -> {
//                User newUser = new User();
//
//                newUser.setId(id);
//                newUser.setName((String) map.get("name"));
//                newUser.setEmail((String) map.get("email"));
//                newUser.setGender((String) map.get("gender"));
//                newUser.setLocale((String) map.get("locale"));
//                newUser.setUserpic((String) map.get("picture"));
//
//                return newUser;
//            });
//
//            user.setLastVisit(LocalDateTime.now());
//
//            return userDetailsRepo.save(user);
//        };
//
//    }
//
//
//}
