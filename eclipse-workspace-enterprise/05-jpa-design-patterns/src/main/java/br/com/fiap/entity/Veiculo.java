package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_VEICULO")
@SequenceGenerator(name="veiculo", sequenceName = "SQ_TB_VEICULO",allocationSize = 1)
public class Veiculo {
	
	@Id
	@Column(name="cd_veiculo")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "veiculo")
	private Integer codigo;
	
	@Column(name="nm_modelo", length= 50, nullable = false)
	private String nome;
	
	@Column(name="vl_veiculo", length= 10)
	private double valor;
	
	@Column(name="nr_ano")
	private int ano;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_revisao")
	private Calendar revisao;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_tipo", length=30)
	private TipoVeiculo tipo;
	
	@Column(name="br_placa", length=8)
	private String placa;

	
    //Getters e setters
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Calendar getRevisao() {
		return revisao;
	}

	public void setRevisao(Calendar revisao) {
		this.revisao = revisao;
	}

	public TipoVeiculo getTipo() {
		return tipo;
	}

	public void setTipo(TipoVeiculo tipo) {
		this.tipo = tipo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
}
