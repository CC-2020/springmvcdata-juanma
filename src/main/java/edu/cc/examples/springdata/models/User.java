package edu.cc.examples.springdata.models;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;
import java.util.Set;

@Entity
@Data
@Table(name="usuarios")
public class User implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id")
	private Long id;
    
	private String nombre;
	private String email;
	//private String password;
    //private String passwordConfirm;
    
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Rol.class)
    @JoinTable(name = "user_rol", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Rol> roles;

	
}