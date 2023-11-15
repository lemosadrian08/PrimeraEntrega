package PrimeraEntrega.PrimeraEntrega.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name= "detalles_factura")
public class DetallesFacturaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "facturas_id",nullable = false)
    private FacturaModel factura;

    @Column(name = "cantidad_productos")
    private Integer cantidadProductos;

    @ManyToOne
    @JoinColumn(name ="productos_id", nullable = false)
    private ProductoModel producto;

    private Double Importe;
}

