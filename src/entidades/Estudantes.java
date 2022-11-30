package entidades;

import java.util.Objects;

public class Estudantes {

    private Integer estudante;

    public Estudantes(Integer estudante) {
        this.estudante = estudante;
    }

    public Integer getEstudante() {
        return estudante;
    }

    public void setEstudante(Integer estudante) {
        this.estudante = estudante;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudantes that = (Estudantes) o;
        return Objects.equals(estudante, that.estudante);
    }

    @Override
    public int hashCode() {
        return Objects.hash(estudante);
    }
}
