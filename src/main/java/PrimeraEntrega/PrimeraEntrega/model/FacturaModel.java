package PrimeraEntrega.PrimeraEntrega.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name= "facturas")
public class FacturaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	@JoinColumn(name="clientes_id")
	private ClienteModel cliente;
	@Column(name= "fecha_creacion")
	private Date fechaCreacion;
	private Double total;

}
