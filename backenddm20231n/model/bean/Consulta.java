package backenddm20231n.model.bean;

public class Consulta {
	private int id;
    private String dia;
    private String hora;
    private String clinica;
    private String vet;

    public Consulta(int id) {
		super();
		this.id = id;
	}

	public Consulta(String dia) {
		super();
		this.dia = dia;
	}
	
	public Consulta(String dia, String hora, String clinica, String vet) {
		super();
		this.dia = dia;
		this.hora = hora;
		this.clinica = clinica;
		this.vet = vet;
	}

	public Consulta(int id, String dia, String hora, String clinica, String vet) {
		super();
		this.id = id;
		this.dia = dia;
		this.hora = hora;
		this.clinica = clinica;
		this.vet = vet;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getClinica() {
		return clinica;
	}

	public void setClinica(String clinica) {
		this.clinica = clinica;
	}

	public String getVet() {
		return vet;
	}

	public void setVet(String vet) {
		this.vet = vet;
	}

	@Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", Dia da Consulta=" + dia + 
        		", Hora da Consulta=" + hora + ", Clínica=" + clinica + ", Dr. Veterinário=" + vet + '}';
    }
}
