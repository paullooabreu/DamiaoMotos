package br.com.damiaomotos.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cli_codigo", nullable = false)
	private Integer codigo;

	@Column(name = "cli_nome", length = 50, nullable = false)
	private String nome;

	@Column(name = "cli_cpf", length = 11, nullable = false, unique = true)
	private String cpf;

	@Column(name = "cli_sexo", length = 1, nullable = false)
	private String sexo;

	@Column(name = "cli_celular", length = 11)
	private Integer celular;

	@Column(name = "cli_telefone", length = 11)
	private Integer telefone;

	@Temporal(value = TemporalType.DATE)
	@Column(name = "cli_dataNascimento", nullable = false)
	private Date dataNascimento;

	@Temporal(value = TemporalType.DATE)
	@Column(name = "cli_dataCadastro", nullable = false)
	private Date dataCadastro;

	@Column(name = "cli_email", length = 80)
	private String email;

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getCelular() {
		return celular;
	}

	public void setCelular(Integer celular) {
		this.celular = celular;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
