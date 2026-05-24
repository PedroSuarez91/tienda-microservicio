# Registrar tienda
post http://localhost:8083/api/tiendas

{
  "nombre": "EcoMarket Concepción",
  "ubicacion": "Av. Los Carrera 1234, Concepción",
  "nominaEmpleados": [
    "Pedro Suárez",
    "Nicolás Castillo",
    "Benjamin Carrillo"
  ],
  "normas": [
    "Mantener orden en bodega",
    "Registrar ingreso y salida de productos",
    "Usar uniforme"
  ],
  "horarioTienda": "Lunes a Viernes de 09:00 a 18:00"
}

# application.properties

spring.application.name=tienda-microservicio

server.port=8083

# MySQL Connection Settings

spring.datasource.url=jdbc:mysql://localhost:3306/tiendasdb

spring.datasource.username=root

spring.datasource.password=

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA/Hibernate Settings

spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true
