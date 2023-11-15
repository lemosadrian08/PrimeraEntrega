create database ventas;
use ventas;

create table clientes(
	id int primary key auto_increment,
    nombre varchar(75),
    apellido varchar(75),
    numero_documento varchar(11)
);


create table productos(
    id int primary key auto_increment,
    descripcion varchar(150),
    codigo varchar(50),
    stock int,
    precio decimal(10,2)
);

create table facturas(
	id int primary key auto_increment,
    clientes_id int,
    fecha_creacion datetime,
    total double,

    constraint fk_clientes_id foreign key (clientes_id) references clientes(id)
);
create table detalles_factura(
	id int primary key auto_increment,
	facturas_id int,
    cantidad_productos int,
    productos_id int,
    importe double,

    constraint fk_factura_id foreign key (facturas_id) references facturas(id),
    constraint fk_productos_id foreign key (productos_id) references productos(id)


);