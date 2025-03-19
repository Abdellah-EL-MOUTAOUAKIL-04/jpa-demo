package ma.abdellah.jpademo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Role {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String desc;
    @Column(unique = true,length = 20)
    private String roleName;
    @ManyToMany(fetch = FetchType.EAGER)
    //pour specifie le nom de la table qui resulte a cause de la relation ManyToMany
    //@JoinTable(name = "USERS_ROLES")
    private List<User> users=new ArrayList<>();
}
