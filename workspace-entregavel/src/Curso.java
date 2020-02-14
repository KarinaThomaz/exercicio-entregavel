import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {
    private Integer codigoCurso;
    private String nome;
    private ProfessorTitular titular;
    private ProfessorAdjunto adjunto;
    private Integer maxAlunos;
    List<Aluno> listaAlunos = new ArrayList<>();

    public Curso(){

    }

    public Curso(Integer codigoCurso, String nome) {
        this.codigoCurso = codigoCurso;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(codigoCurso, curso.codigoCurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoCurso);
    }

    public Boolean adicionarUmAluno(Aluno umAluno) {
        Integer qtdeAlunos = listaAlunos.size();
        if (qtdeAlunos < this.maxAlunos) {
            listaAlunos.add(umAluno);
            qtdeAlunos++;
            return true;
        }else{
            return false;
        }
    }

    public void excluirAluno(Aluno umAluno){
        listaAlunos.remove(umAluno);
        System.out.println("Aluno excluído com sucessor");
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ProfessorTitular getTitular() {
        return titular;
    }

    public void setTitular(ProfessorTitular titular) {
        this.titular = titular;
    }

    public ProfessorAdjunto getAdjunto() {
        return adjunto;
    }

    public void setAdjunto(ProfessorAdjunto adjunto) {
        this.adjunto = adjunto;
    }

    public Integer getMaxAlunos() {
        return maxAlunos;
    }

    public void setMaxAlunos(Integer maxAlunos) {
        this.maxAlunos = maxAlunos;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
}
