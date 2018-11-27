package modelo;

import java.sql.Date;

public class macho {
	
	private int id_mach;
	private String nom_mach;
	private int num_mach;
	private String sex_mach;
	private String edad_mach;
	private Date fecha_nac;
	private Date fecha_reg;
	private Date feha_actu;
	
	public macho(int id_mach, String nom_mach, int num_mach, String sex_mach, String edad_mach, Date fecha_nac,
			Date fecha_reg, Date feha_actu) {
		super();
		this.id_mach = id_mach;
		this.nom_mach = nom_mach;
		this.num_mach = num_mach;
		this.sex_mach = sex_mach;
		this.edad_mach = edad_mach;
		this.fecha_nac = fecha_nac;
		this.fecha_reg = fecha_reg;
		this.feha_actu = feha_actu;
	}
	
	public macho() {
		// TODO Auto-generated constructor stub
	}

	public int getId_mach() {
		return id_mach;
	}

	public void setId_mach(int id_mach) {
		this.id_mach = id_mach;
	}

	public String getNom_mach() {
		return nom_mach;
	}

	public void setNom_mach(String nom_mach) {
		this.nom_mach = nom_mach;
	}

	public int getNum_mach() {
		return num_mach;
	}

	public void setNum_mach(int num_mach) {
		this.num_mach = num_mach;
	}

	public String getSex_mach() {
		return sex_mach;
	}

	public void setSex_mach(String sex_mach) {
		this.sex_mach = sex_mach;
	}

	public String getEdad_mach() {
		return edad_mach;
	}

	public void setEdad_mach(String edad_mach) {
		this.edad_mach = edad_mach;
	}

	public Date getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(Date string) {
		this.fecha_nac = string;
	}

	public Date getFecha_reg() {
		return fecha_reg;
	}

	public void setFecha_reg(Date fecha_reg) {
		this.fecha_reg = fecha_reg;
	}

	public Date getFeha_actu() {
		return feha_actu;
	}

	public void setFeha_actu(Date feha_actu) {
		this.feha_actu = feha_actu;
	}

	@Override
	public String toString() {
		return "ovigen [id_mach=" + id_mach + ", nom_mach=" + nom_mach + ", num_mach=" + num_mach + ", sex_mach="
				+ sex_mach + ", edad_mach=" + edad_mach + ", fecha_nac=" + fecha_nac + ", fecha_reg=" + fecha_reg
				+ ", feha_actu=" + feha_actu + "]";
	}
	
	
	

}
