package entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

@Entity
@Table (name = "categoria")
@Audited
public class Categoria {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (name = "denominacion") 
	private String denominacion;

	@ManyToMany(mappedBy = "categorias")
	private List<Articulo> articulo = new ArrayList<Articulo>();	
	
	public Categoria() {
		
	}
	
		public Categoria(String denominacion, List<Articulo> articulo) {
		this.denominacion = denominacion;
		this.articulo = articulo;
	}

		

	public List<Articulo> getArticulo() {
			return articulo;
		}

		public void setArticulo(List<Articulo> articulo) {
			this.articulo = articulo;
		}

	public Categoria(String denominacion) {
		super();
		this.denominacion = denominacion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
