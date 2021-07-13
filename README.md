# Santander tecnologia  
Desafio Tecnico 

Api REST - Orientada al manejo de meetups la cantidad de usuarios que asistiran, el clima del dia de la meet y
 la cantidad de birras segun la cantidad de asistentes y la temperatura de ese dia.

url para levantar el proyecto mediante swagger ui

http://localhost:8080/swagger-ui.html#/

el api cuenta con tres RestController

	-Authentication Rest Controller : cuenta con un solo metodo
		-login funciona como login el cual valida el usuario y devuelve	un token JWT para autenticarse en todos los futuros request 
	
	- User RestController: cuenta con solo dos metodos
		-crear un usuario (ADMIN)
		-listar todos los usuario, (ADMIN)	 
	 
	 
	- Meetups Rest Controller : cuenta con estos metodos; 
		-create para creacion de una meet (SOLO ADMIN)
		-buscar por id , que devuelve el detalle de esta meet incluida la cantidad de usuarios que asistiran y la temperatura.(ADMIN,USER) 
		si la fecha de la meet ya paso devolvera un mensaje.
		-listar todas las meet con una breve descripcion estaran incluidas en la lista las meet cuyas fechas ya pasaron.(ADMIN,USER) 
	
	-Cateringbeer Rest Controller : cuenta con un solo metodo:
		-devuelve la cantidad de invitados, la cantidad de cerveza y la cantidad de cajas de cerveza que comprar para la meet. (ADMIN)
	
	-Usersattending meet Rest Controller : cuenta con estos metodos; 
		-checking de asistencia de la reunion. (USER)
		-asistir a una meet .(USER)
		-listar todas las meet a las que se encuentra registrado(USER)

	
	
# USUARIOS  (/api/v1/users) 

existen dos usuarios ya creados en el import.sql que estan habilidatos para insertarse en el primer run (para que sea mas facil probar)

      "username": "MAGDALY"
      "fullName": "Magdaly Santos"
      "password": "1234"
      "role": "ADMIN"
     
      "username": "NOHEMY"
      "fullName": "Nohemy Santos"
      "password": "1234"
      "role": "USER"
      
NOTA : Para crear usuario hay que tomar en cuenta que en los ROLES: solo acepta "ADMIN" y "USER"
	


# TECNOLOGIAS 
	-java 1.8
	-Spring boot 2.3.3.RELEAS
	-JPA 
	-JSON Web Token + Interceptor + RolesAllowed 
	-Java Validation
	-Swagger 
	-Junit + Mockito
	
#POSIBLES MEJORAS

	-mas validaciones con expressiones regulares para evitar cualquier vulnerabilidad en cada DTO de entrada.
	-crear otro microservicio que sea de user y una SDK para manejo de todo lo que es autenticacion y autorizacion.
	-crear otras excepciones para posibles errores con la conexion de la bd.
	-Encriptar la password en la bd y no mostrarla a la hora de listar por temas de seguridad.
	-agregar metodos de get by id en el UserRestController y algunos otros necesarios.
	-colocar las properties de conexion con la bd en variables de entorno.
	-agregar mas logger en toda la api asi saber todo el recorrido del usuario.
	-crear todos los test de junir para todas las clases para cumplir con el coverage deseado
	-crear un enum para validar los roles de usuarios ("ADMIN" y "USER")
	-creacion del notificaciones para que le lleguen todos las meets a los usuarios.
	
	
	