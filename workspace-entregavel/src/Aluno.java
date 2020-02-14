import java.util.Objects;

public class Aluno {
    private Integer codigoAluno;
    private String nome;
    private String sobrenome;

    public Aluno(){

    }

    public Aluno(Integer codigoAluno, String nome, String sobrenome) {
        this.codigoAluno = codigoAluno;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(codigoAluno, aluno.codigoAluno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoAluno);
    }
}
