# Currency Converter

Bienvenido al proyecto **Currency Converter**, una aplicación de consola desarrollada en Java que permite convertir monedas utilizando la [Exchange Rate API](https://v6.exchangerate-api.com/). La aplicación obtiene las tasas de cambio en tiempo real y ofrece opciones para convertir entre diferentes monedas.

## Características

- Conversión de monedas entre USD, CLP, BRL, COP, y más.
- Opción para ingresar manualmente otras monedas.
- Tasas de cambio actualizadas en tiempo real usando la API.
- Interfaz de consola fácil de usar.

## Requisitos y Tecnologías utilizadas

- [Java 11 o superior](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) (opcional, pero recomendado)
- Conexión a internet para acceder a la API de tasas de cambio.
- [Biblioteca Gson 2.10.1 en adelante](https://search.maven.org/artifact/com.google.code.gson/gson)
- [API Exchange Rate API u otra similar que hayas elegido.](https://www.exchangerate-api.com/)
- HttpClient para facilita la conexión y la obtención de respuestas de la API de manera eficiente. 
- Tener Maven configurado para manejar dependencias (si lo estás utilizando).


## Funcionalidades
- Conversión de Dólar estadounidense (USD) a varias monedas latinoamericanas y viceversa.
- Conversión entre:
  - Dólar a Peso chileno
  - Peso chileno a Dólar
  - Dólar a Real brasileño
  - Real brasileño a Dólar
  - Dólar a Peso colombiano
  - Peso colombiano a Dólar
 - Otras monedas
- Interfaz de usuario en la consola, permitiendo la selección de opciones a través de un menú interactivo.


## Ejemplos de Uso
### Conversión de USD a CLP:
 - Selecciona la opción 1 en el menú.
 - Ingresa la cantidad en dólares a convertir.
- La aplicación mostrará el equivalente en pesos chilenos.
- Conversión de Monedas Personalizadas
- Selecciona la opción 7 para convertir entre otras monedas.
- Ingresa los códigos de las monedas de origen y destino (por ejemplo, USD y EUR).
- Ingresa la cantidad a convertir.
- Para terminar el programa ingresa la Opción 8

## Screenshots

![App Screenshot](https://github.com/carlosalegriam/conversor_monedas/blob/main/src/com/calegriam/currencyconverter/screen/sc_cm1.png)
![App Screenshot](https://github.com/carlosalegriam/conversor_monedas/blob/main/src/com/calegriam/currencyconverter/screen/sc_cm2.png)

## Instalación

1. Clona este repositorio:

   ```bash
   git clone https://github.com/carlosalegriam/conversor_monedas.git
