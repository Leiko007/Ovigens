package modelo;

import java.sql.Date;

public class cobro {
	
	private int id_cob;
	private Date fecha_cob;
	private String nom_cob;
	private String dir_cob;
	private int cuit_cob;
	private int tel_cob;
	private String obs_cob;
	
	public cobro(int id_cob, Date fecha_cob, String nom_cob, String dir_cob, int cuit_cob, int tel_cob,
			String obs_cob) {
		super();
		this.id_cob = id_cob;
		this.fecha_cob = fecha_cob;
		this.nom_cob = nom_cob;
		this.dir_cob = dir_cob;
		this.cuit_cob = cuit_cob;
		this.tel_cob = tel_cob;
		this.obs_cob = obs_cob;
	}
	
	public cobro() {
		// TODO Auto-generated constructor stub
	}

	public int getId_cob() {
		return id_cob;
	}

	public void setId_cob(int id_cob) {
		this.id_cob = id_cob;
	}

	public Date getFecha_cob() {
		return fecha_cob;
	}

	public void setFecha_cob(Date fecha_cob) {
		this.fecha_cob = fecha_cob;
	}

	public String getNom_cob() {
		return nom_cob;
	}

	public void setNom_cob(String nom_cob) {
		this.nom_cob = nom_cob;
	}

	public String getDir_cob() {
		return dir_cob;
	}

	public void setDir_cob(String dir_cob) {
		this.dir_cob = dir_cob;
	}

	public int getCuit_cob() {
		return cuit_cob;
	}

	public void setCuit_cob(int cuit_cob) {
		this.cuit_cob = cuit_cob;
	}

	public int getTel_cob() {
		return tel_cob;
	}

	public void setTel_cob(int tel_cob) {
		this.tel_cob = tel_cob;
	}

	public String getObs_cob() {
		return obs_cob;
	}

	public void setObs_cob(String obs_cob) {
		this.obs_cob = obs_cob;
	}

	@Override
	public String toString() {
		return "cobro [id_cob=" + id_cob + ", fecha_cob=" + fecha_cob + ", nom_cob=" + nom_cob + ", dir_cob=" + dir_cob
				+ ", cuit_cob=" + cuit_cob + ", tel_cob=" + tel_cob + ", obs_cob=" + obs_cob + "]";
	}

}
