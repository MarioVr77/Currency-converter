<h1 aling ="center"> Proyecto: Currency-converter</h1>


<img src="https://cdn.icon-icons.com/icons2/618/PNG/512/Currency_Conversion_icon-icons.com_56682.png" alt="Texto alternativo" width="300" height="300">


# Conversor de Moneda

Este proyecto es un conversor de moneda desarrollado en Java. Permite convertir entre varias monedas utilizando una API de tipo de cambio. Este proyecto fue creado como parte del curso de Alura.

## Características

- Conversión entre múltiples monedas:
  - Dólar a Peso Argentino
  - Peso Argentino a Dólar
  - Dólar a Real Brasileño
  - Real Brasileño a Dólar
  - Dólar a Peso Colombiano
  - Peso Colombiano a Dólar
- Interfaz de línea de comandos fácil de usar.
- Conexión a una API de tipo de cambio para obtener las tasas de cambio actuales.

## Requisitos

- Java 11 o superior.
- IntelliJ IDEA (opcional pero recomendado para desarrollo).
- Biblioteca Gson para la deserialización de JSON.

## Instalación

1. Clona el repositorio en tu máquina local:

    ```sh
    git clone https://github.com/tu-usuario/tu-repositorio.git
    ```

2. Abre el proyecto en IntelliJ IDEA.

3. Asegúrate de que la biblioteca Gson esté incluida en el proyecto. Puedes añadirla manualmente si es necesario:

    - Descarga el archivo JAR de Gson desde [Maven Repository - Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson).
    - Añade el JAR descargado a las bibliotecas de tu proyecto en IntelliJ IDEA (`File` -> `Project Structure` -> `Libraries` -> `+` -> `Java`).

4. Configura las dependencias en tu archivo de compilación si estás utilizando un sistema de construcción como Maven o Gradle:

    **Maven (`pom.xml`):**

    ```xml
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.8.9</version>
    </dependency>
    ```

    **Gradle (`build.gradle`):**

    ```groovy
    implementation 'com.google.code.gson:gson:2.8.9'
    ```

## Uso

1. Ejecuta la clase `Principal` desde IntelliJ IDEA o desde la línea de comandos.

    ```sh
    javac -cp gson-2.8.9.jar com/aluracursos/conversor/principal/Principal.java
    java -cp .:gson-2.8.9.jar com.aluracursos.conversor.principal.Principal
    ```

2. Sigue las instrucciones en pantalla para seleccionar la conversión deseada y proporcionar el monto a convertir.

## 📁 Estructura del Proyecto
src
└── main

├── java

│ └── com

│ └── aluracursos

│ └── conversor

│ ├── modulos

│ │ ├── ConsultaConversor.java

│ │ └── Conversor.java

│ └── principal

│ └── Principal.java

└── resources

## Ejemplo de Uso

******Sea Bienvenido/a al conversor de Moneda

1.- Dólar =>> Peso Argentino

2 - Peso Argentino =>> Dólar

3 - Dólar =>> Real Brasileño

4 - Real Brasileño =>> Dólar

5 - Dólar =>> Peso Colombiano

6 - Peso Colombiano =>> Dólar

9 - Salir

Elija una opción válida:

Ingrese el valor en USD que desea convertir a ARS:
100

[USD] corresponde al valor final de =>>> 9400.00 [ARS]


## Contribución

Si deseas contribuir a este proyecto, por favor sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama (`git checkout -b feature/nueva-caracteristica`).
3. Realiza tus cambios y haz commit (`git commit -am 'Agregar nueva característica'`).
4. Haz push a la rama (`git push origin feature/nueva-caracteristica`).
5. Abre un Pull Request.




  
-Estado del proyecto:Finalizado
  
## Autor
Mario Alonso Vicente Rodriguez 
