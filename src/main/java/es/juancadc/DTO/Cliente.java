package es.juancadc.DTO;



public class Cliente {

	// Atributos
		
		private int id;
		
		private String nombre;
		
		private String apellidos;
		
		private int tlf;
		
		private String dni;

		// Getters and Setters
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
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

		public int getTlf() {
			return tlf;
		}

		public void setTlf(int tlf) {
			this.tlf = tlf;
		}

		public String getDni() {
			return dni;
		}

		public void setDni(String dni) {
			this.dni = dni;
		}

		// Constructores
		public Cliente(int id, String nombre, String apellidos, int tlf, String dni) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.tlf = tlf;
			this.dni = dni;
		}
		public Cliente(String nombre, String apellidos, String dni) {
			super();
			
			this.nombre = nombre;
			this.apellidos = apellidos;
			
			this.dni = dni;
		}
		public Cliente() {
			super();
		}
}
