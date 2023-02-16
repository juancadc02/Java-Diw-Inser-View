package es.juancadc.ejemploWeb.aplicacion.DAO;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente",schema = "public")
public class ClienteDAO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_cliente")
	private int id_cliente;
	@Column(name="nombre_cliente")
	private String nombre;
	@Column(name="apellidos_cliente")
	private String apellidos;
	@Column(name="dni_cliente")
	private String dni;
	
	//Contructor por defecto 
	
	public ClienteDAO() {
		super();
	}
	
	//Constructor sin el id.
	
	public ClienteDAO(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}

	//Getters and Setters 
	
	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
	
	
	
	
	
}
