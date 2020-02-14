import java.util.Date;

public class Matricula {
    private Aluno aluno;
    private Curso curso;
    private Date dataDoDia;

    public Matricula(){

    }

    public Matricula(Aluno aluno, Curso curso, Date dataDoDia) {
        this.aluno = aluno;
        this.curso = curso;
        this.dataDoDia = dataDoDia;
    }
}
