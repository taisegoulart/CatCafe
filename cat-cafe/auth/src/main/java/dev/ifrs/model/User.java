package dev.ifrs;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

//TODO dúvida: Vai ter dois tipos de usuário, o admin que pode adicionar os gatos e etc e o usuário normal que não pode. Como eu faço essa diferenciação?

@Entity
public class User {
    
}
