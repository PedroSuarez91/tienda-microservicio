# Registrar tienda
post http://localhost:8083/api/tiendas

{
  "nombre": "EcoMarket Concepción",
  "ubicacion": "Concepción Centro",
  "horarioTienda": "Lunes a Viernes 09:00 - 18:00",
  "nominaEmpleados": ["Pedro"],
  "normas": [
    "Mantener la tienda limpia",
    "Atender bien a los clientes"
  ]
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
