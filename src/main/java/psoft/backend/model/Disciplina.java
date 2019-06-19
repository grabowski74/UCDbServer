package psoft.backend.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    @OneToOne
    @JsonBackReference(value = "perfil")
    private Perfil perfil;

    public Disciplina() {
    }

    public Disciplina(String nome, Perfil perfil) {
        this.nome = nome;
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return id + " - " + nome;
    }
}
