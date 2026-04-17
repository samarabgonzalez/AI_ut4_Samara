# Aplicacion de Cubos

Proyecto Java sencillo para trabajar con un cubo a partir de su lado.

## Requisitos cubiertos

1. Constructor que recibe el lado.
2. Getter y setter de `lado`.
3. `calcularAreaBase()`.
4. `calcularVolumen()`.
5. Solicitud de lado por `JOptionPane`.
6. Impresion de area por `JOptionPane`.
7. Impresion de volumen por `JOptionPane`.
8. En `main`, delegacion al gestor para poblar con medidas introducidas por usuario, ordenar y comprobar encaje.
9. Clase `Pruebas` para validacion rapida.
10. JavaDoc completa en clases y metodos de la solucion.

## Estructura principal

- `Cubo/Cubo.java`: entidad y operaciones del cubo.
- `Cubo/GestorCubos.java`: gestion de colecciones de cubos (poblar, ordenar, encaje).
- `Cubo/MainCubo.java`: flujo principal de demostracion sin logica de negocio.
- `Cubo/Pruebas.java`: pruebas basicas ejecutables.

## Compilar

```powershell
Set-Location "C:\Users\samar\Desktop\AI_ut4_Samara"
javac Cubo\*.java
```

## Ejecutar pruebas

```powershell
Set-Location "C:\Users\samar\Desktop\AI_ut4_Samara"
java Cubo.Pruebas
```

## Ejecutar aplicacion

```powershell
Set-Location "C:\Users\samar\Desktop\AI_ut4_Samara"
java Cubo.MainCubo
```

La aplicacion pedira por ventanas (JOptionPane) cuantos cubos quieres crear y el lado de cada cubo.

