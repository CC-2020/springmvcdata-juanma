package edu.cc.examples.springdata.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "rol")
public class Rol {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="rol_id")
    private Long id;
    private String name;
    
    @ManyToMany(mappedBy = "roles", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private Set<User> users;

    
}
