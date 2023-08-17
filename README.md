# Sistema de Control de Consumibles y Equipos
> Inventario

 # Descripción del Proyecto

Este proyecto tiene como objetivo desarrollar un sistema de control eficiente de
consumibles y equipos de cómputo. El sistema permitirá un seguimiento preciso 
de los recursos, generará alertas por reabastecimiento y proporcionará reportes
detallados para una gestión más efectiva.

#Características

- Registro de consumibles y equipos.
- Registro de entradas y salidas con fecha y departamento.
- Generación de alertas por reabastecimiento.
- Reportes de stock disponible y de entrada de insumos y equipos.

#Tecnologías Utilizadas

- JDK 11 
- IDE Neatbeans
- Wampserver para la base de datos con Mysql
- Java EE (Servlets, JSP) para el desarrollo web.
- JPA para la persistencia de datos.
- Base de datos MySQL para el almacenamiento de información.

##  **Requerimientos de instalacion**

- JDK 11
- Algun IDE
- conectar alguna base de datos (para esto instale Wampserver para correr Mysql)
- Java EE
- Apache tomcat 9

# **Instructivo de Instalación**
## Requisitos Previos
* Java JDK (versión X o superior) instalado en tu sistema.
* Servidor de aplicaciones compatible con Java EE (como Apache Tomcat) instalado.
* Base de datos MySQL (versión X o superior) instalada y configurada.

## Instalación de requisito previos
### JAVA JDK
> Paso 1: Descargar el Java JDK
> Abre tu navegador web y visita el sitio oficial de Oracle para descargar Java SE JDK: Oracle Java SE Downloads (reemplaza "XX" con la versión correspondiente).

> Paso 2: Aceptar los Términos de Licencia

> En la página de descarga, acepta los términos y condiciones de la licencia.
> Paso 3: Seleccionar la Versión
> Descarga la versión adecuada de Java JDK para tu sistema operativo (Windows x64/x86) haciendo clic en el enlace de descarga correspondiente.

> Paso 4: Ejecutar el Instalador
> Una vez que la descarga esté completa, ejecuta el archivo descargado jdk-X.X.X_windows-x64_bin.exe (o el nombre que corresponda a la versión que descargaste).

> Paso 5: Configuración de la Instalación
> Selecciona la ubicación para instalar el JDK o simplemente sigue la ubicación predeterminada. Luego, haz clic en "Next".

> En la siguiente pantalla, elige los componentes a instalar. Asegúrate de que "Public JRE" esté seleccionado para que también se instale el JRE (entorno de ejecución de Java). Luego, haz clic en "Next".

> El proceso de instalación continuará. Una vez que esté completo, marca la opción "Do you want to install the Java SE Development Kit" y selecciona "Next".

> Paso 6: Configuración del Path (opcional pero recomendado)
> Configura las variables de entorno. Esto es opcional, pero es recomendable para que puedas utilizar el JDK desde cualquier ubicación en tu sistema.

> Copia la ruta de instalación del JDK, como C:\Program Files\Java\jdk-X.X.X, y agrega esta ruta a la variable de entorno PATH.

> Paso 7: Verificar la Instalación
> Abre una ventana de línea de comandos (CMD) y ejecuta los siguientes comandos:
> java -version
> javac -version
> Si ves la información de la versión de Java y el compilador, ¡la instalación se completó exitosamente!

### Apache TomCat
> Paso 1: Descargar Apache Tomcat
> Abre tu navegador web y visita el sitio oficial de Apache Tomcat: Apache Tomcat Downloads (reemplaza "XX" con la versión más reciente).

> Paso 2: Seleccionar la Distribución
> En la página de descarga, selecciona la distribución de Apache Tomcat que deseas instalar. Por lo general, puedes elegir entre "32-bit/64-bit Windows Service Installer" o "32-bit/64-bit Windows zip".

> Paso 3: Descargar el Archivo
> Descarga el archivo de instalación (.exe o .zip) haciendo clic en el enlace correspondiente.

> Paso 4: Ejecutar el Instalador (en caso de elegir la versión con instalador)
> Si elegiste la versión con instalador (.exe), ejecuta el archivo descargado. Aparecerá un asistente de instalación.

> Asegúrate de leer y aceptar los términos y condiciones de la licencia.

> Elige la ubicación donde deseas instalar Apache Tomcat y haz clic en "Next".

> Configura las opciones adicionales según tus preferencias y sigue las instrucciones del asistente.

> Paso 5: Descomprimir el Archivo (en caso de elegir la versión en zip)
> Si elegiste la versión en zip, descomprime el archivo descargado en una ubicación de tu elección (por ejemplo, C:\apache-tomcat).
> Paso 6: Configurar Variables de Entorno
> Agrega una nueva variable de entorno llamada CATALINA_HOME y asigna la ruta de instalación de Apache Tomcat (por ejemplo, C:\apache-tomcat).

> Agrega %CATALINA_HOME%\bin al final de la variable de entorno PATH.

> Paso 7: Iniciar Apache Tomcat
> Abre una ventana de línea de comandos (CMD) y navega a la carpeta bin dentro de la instalación de Tomcat (%CATALINA_HOME%\bin).

> Ejecuta el archivo startup.bat para iniciar el servidor Tomcat.

> Paso 8: Verificar la Instalación
> Abre tu navegador web y visita http://localhost:8080. Deberías ver la página de inicio de Apache Tomcat, lo que indica que la instalación fue exitosa.

### Base de datos MySQL
> Paso 1: Descargar MySQL Installer
> Abre tu navegador web y visita el sitio oficial de MySQL: MySQL Downloads para descargar MySQL Installer.

> Paso 2: Descargar MySQL Installer
> En la página de descarga, selecciona "MySQL Installer for Windows".

> Descarga el archivo de instalación de MySQL Installer haciendo clic en el botón de descarga.

> Paso 3: Ejecutar el MySQL Installer
> Una vez que la descarga esté completa, ejecuta el archivo descargado (mysql-installer-web-community-X.X.X.X.msi).

> El instalador mostrará varias opciones. Elige "Custom" para personalizar la instalación.

> Paso 4: Seleccionar Componentes
> Selecciona los componentes que deseas instalar. Asegúrate de seleccionar "MySQL Server" y "MySQL Workbench". También puedes agregar otros componentes según tus necesidades.

> Paso 5: Configurar Tipo de Configuración
> Selecciona el tipo de configuración que deseas. Puedes elegir "Standalone MySQL Server / Classic MySQL Replication" para una instalación independiente.

> Paso 6: Configurar MySQL Server
> Configura la contraseña del usuario root de MySQL. Asegúrate de recordar esta contraseña, ya que la necesitarás para acceder al servidor.

> Selecciona las configuraciones que mejor se adapten a tus necesidades, como el puerto de MySQL y el modo de conexión.

> Paso 7: Finalizar la Instalación
> Continúa siguiendo las instrucciones del instalador y espera a que se complete la instalación.

> Paso 8: Iniciar y Detener MySQL Server
> Una vez instalado, puedes iniciar y detener MySQL Server desde el Panel de Control de Windows o usando los comandos en el símbolo del sistema.
> Para iniciar MySQL Server:
> net start mysql

> Para detener MySQL Server:
> net stop mysql

> Paso 9: Verificar la Instalación
> Abre MySQL Workbench (si lo instalaste) y usa las credenciales del usuario root para conectarte al servidor.

> Si puedes acceder a MySQL a través de MySQL Workbench, la instalación se realizó correctamente.


### 1. Clonar el Repositorio:
Puedes clonar un repositorio de GitHub.com en el equipo local o en un codespace, para que sea más fácil corregir conflictos de combinación, agregar o quitar archivos e insertar confirmaciones más grandes. Al clonar un repositorio, se copia el repositorio de GitHub.com en la máquina local o en una máquina virtual remota cuando se crea un codespace. Para más información sobre la clonación en un codespace, consulta "Creación de un codespace para un repositorio".

Clonar un repositorio extrae una copia integral de todos los datos del repositorio que GitHub.com tiene en ese momento, incluidas todas las versiones de cada archivo y carpeta del proyecto. Puedes insertar los cambios en el repositorio remoto en GitHub.com o extraer los cambios de otras personas desde GitHub.com. Para más información, consulta "Utilizar GitHub".

Puedes clonar tu repositorio existente o clonar el repositorio existente de alguien más para contribuir con un proyecto.

Clonar un repositorio

a. En GitHub.com, navega a la página principal del repositorio.

b. Encima de la lista de archivos, haz clic en <>Código.

c. Copia la dirección URL del repositorio.
	-Para clonar el repositorio con HTTPS, en "HTTPS", haz clic en copiar.
	-Para clonar el repositorio mediante una clave SSH, incluido un certificado emitido por la entidad de certificación SSH de la organización, haz clic en SSH y 	luego en pegar.
	-Para clonar un repositorio mediante GitHub CLI, haz clic en GitHub CLI y, después, en copiar.

d. Abra Git Bash.

e. Cambia el directorio de trabajo actual a la ubicación en donde quieres clonar el directorio.

f. Escriba git clone y pegue la dirección URL que ha copiado antes.
	git clone [Repositorio](https://github.com/ivncoronado/Inventario.git)

g. Presione Entrar para crear el clon local.
	$ git clone [repositorio ](https://github.com/ivncoronado/Inventario.git)
	> Cloning into `Spoon-Knife`...
	> remote: Counting objects: 10, done.
	> remote: Compressing objects: 100% (8/8), done.
	> remove: Total 10 (delta 1), reused 10 (delta 1)
	> Unpacking objects: 100% (10/10), done.

 # Instructivo de Uso

### Registro de Consumibles y Equipos

1. Inicia sesión en la aplicación con tus credenciales.
2. Navega a la sección "Registro" y selecciona "Nuevo Consumible" o "Nuevo Equipo".
3. Completa el formulario con los detalles del consumible o equipo y haz clic en "Guardar".
4. Repite los pasos anteriores para registrar otros consumibles o equipos.

### Registro de Entradas y Salidas

1. En la sección "Registro", selecciona "Nueva Entrada" o "Nueva Salida".
2. Completa el formulario con la información requerida, incluyendo la fecha y el departamento (en caso de salida).
3. Haz clic en "Guardar" para registrar la entrada o salida.

### Generación de Reportes

1. Accede a la sección "Reportes" en el menú.
2. Selecciona "Stock Disponible" para ver el listado de consumibles y equipos con sus cantidades actuales.
3. Escoge "Entradas Registradas" para visualizar un historial de las entradas realizadas.

### Generación de Alertas

1. La aplicación generará alertas automáticamente cuando los niveles de stock estén por debajo de un umbral predefinido.
2. Las alertas se mostrarán en la interfaz y podrán ser vistas en la sección correspondiente.


#Contribuciones

Las contribuciones son bienvenidas. Si deseas colaborar, sigue los pasos:

1. Haz un fork de este repositorio.
2. Crea una rama con una descripción clara de tu contribución.
3. Realiza tus cambios y haz commits.
4. Envía un pull request explicando tus cambios y su propósito.

#Autor

-Iván Coronado https://github.com/ivncoronado/Inventario.git  Desarrollador Principal
