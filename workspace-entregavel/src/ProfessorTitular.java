public class ProfessorTitular extends Professor {
    private String especialidade;

    public ProfessorTitular(){

    }

    public ProfessorTitular(Integer codigoProfessor, String nome, String sobrenome, Integer tempoCasa, String especialidade) {
        super(codigoProfessor, nome, sobrenome, tempoCasa);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
