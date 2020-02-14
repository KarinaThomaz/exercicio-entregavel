public class ProfessorAdjunto extends Professor{
    private Integer horasMonitoria;

    public ProfessorAdjunto(){

    }

    public ProfessorAdjunto(Integer codigoProfessor, String nome, String sobrenome, Integer tempoCasa, Integer horasMonitoria) {
        super(codigoProfessor, nome, sobrenome, tempoCasa);
        this.horasMonitoria = horasMonitoria;
    }

    public Integer getHorasMonitoria() {
        return horasMonitoria;
    }

    public void setHorasMonitoria(Integer horasMonitoria) {
        this.horasMonitoria = horasMonitoria;
    }
}
