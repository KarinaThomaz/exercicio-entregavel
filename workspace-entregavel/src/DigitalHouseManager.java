import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    List<Aluno> listaAluno = new ArrayList<>();
    List<Professor> listaProfessor = new ArrayList<>();
    List<Curso> listaCurso = new ArrayList<>();
    List<Matricula> listaMatricula = new ArrayList<>();



    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos){
        

    }

    public void excluirCurso(Integer codigoCurso){
        listaCurso.remove(codigoCurso);
    }

    public List<Aluno> getListaAluno() {
        return listaAluno;
    }

    public void setListaAluno(List<Aluno> listaAluno) {
        this.listaAluno = listaAluno;
    }

    public List<Professor> getListaProfessor() {
        return listaProfessor;
    }

    public void setListaProfessor(List<Professor> listaProfessor) {
        this.listaProfessor = listaProfessor;
    }

    public List<Curso> getListaCurso() {
        return listaCurso;
    }

    public void setListaCurso(List<Curso> listaCurso) {
        this.listaCurso = listaCurso;
    }

    public List<Matricula> getListaMatricula() {
        return listaMatricula;
    }

    public void setListaMatricula(List<Matricula> listaMatricula) {
        this.listaMatricula = listaMatricula;
    }
}
