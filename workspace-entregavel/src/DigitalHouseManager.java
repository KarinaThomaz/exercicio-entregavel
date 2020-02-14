import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DigitalHouseManager {
    private List<Aluno> listaAluno = new ArrayList<>();
    private List<Professor> listaProfessor = new ArrayList<>();
    private List<Curso> listaCurso = new ArrayList<>();
    private List<Matricula> listaMatricula = new ArrayList<>();

    public void registrarCurso(Integer codigoCurso, String nome, Integer quantidadeMaximaDeAlunos){
        Curso curso = new Curso(codigoCurso, nome, quantidadeMaximaDeAlunos);
        listaCurso.add(curso);
        System.out.println("Curso adicionado com sucesso");
    }

    public void excluirCurso(Integer codigoCurso){
        listaCurso.remove(codigoCurso);
        System.out.println("Curso excluído com sucesso!");
    }

    public void registrarProfessorAdjunto(Integer codigoProfessor, String nome, String sobrenome, Integer quantidadeDeHoras){
        ProfessorAdjunto adjunto = new ProfessorAdjunto(codigoProfessor, nome, sobrenome, 0,  quantidadeDeHoras);
        listaProfessor.add(adjunto);
        System.out.println("Professor Adjunto adicionado com sucesso!");
    }

    public void registrarProfessorTitular(Integer codigoProfessor, String nome, String sobrenome, String especialidade){
        ProfessorTitular titular = new ProfessorTitular(codigoProfessor, nome, sobrenome, 0, especialidade);
        listaProfessor.add(titular);
        System.out.println("Professor titular adicionado com sucesso!");
    }

    public void excluirProfessor(Integer codigoProfessor){
        listaProfessor.remove(codigoProfessor);
        System.out.println("Professor excluído com sucesso!");
    }

    public void registrarAluno(Integer codigoAluno, String nome, String sobrenome){
        Aluno aluno = new Aluno(codigoAluno, nome, sobrenome);
        listaAluno.add(aluno);
        System.out.println("Aluno registrado com sucesso! "+aluno);
    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso){
        //Matricula mat = new Matricula(codigoAluno, codigoCurso, new Date());
        Integer codA=codigoAluno;
        Integer codC=codigoCurso;
        for (Curso i : listaCurso) {
            if(codigoCurso.equals(i.getCodigoCurso())){
                codC=i.getCodigoCurso();
                for (Aluno j : listaAluno) {
                    if(codigoAluno.equals(j.getCodigoAluno())){
                        codA=j.getCodigoAluno();
                    }
                }
            }
        }

        //Matricula matricula = new Matricula(codigoAluno, codigoCurso, new Date());

    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){

    }

    //gets e sets
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
