# Expense Manager App

## Descripción
**Expense Manager** es una aplicación multiplataforma desarrollada en **Kotlin** que permite a los usuarios gestionar sus gastos de manera eficiente. La aplicación ofrece funcionalidades para agregar, editar y visualizar gastos, categorizándolos para un mejor seguimiento.

## Características
- **Agregar Gastos**: Permite a los usuarios agregar nuevos gastos con detalles como monto, descripción y categoría.
- **Editar Gastos**: Los usuarios pueden editar los gastos existentes.
- **Categorías de Gastos**: Los gastos se pueden categorizar para una mejor organización.
- **Interfaz de Usuario Intuitiva**: Utiliza **Jetpack Compose** para una interfaz de usuario moderna y responsiva.
- **Navegación Fluida**: Implementa `moe.tlaster.precompose` para una navegación fluida entre pantallas.

## Tecnologías Utilizadas
- **Kotlin**: Lenguaje principal de programación.
- **Jetpack Compose**: Para la construcción de la interfaz de usuario.
- **PreCompose**: Para la navegación.
- **Gradle**: Sistema de construcción.

## Estructura del Proyecto
```plaintext
composeApp/
├── src/
│   ├── commonMain/
│   │   └── kotlin/
│   │       └── org/
│   │           └── example/
│   │               └── project/
│   │                   ├── App.kt
│   │                   ├── navigation/
│   │                   │   └── Navigator.kt
│   │                   └── ui/
│   │                       └── ExpensesDetailScreen.kt
└── ...
├── build.gradle.kts
└── settings.gradle.kts

```
## Instalación

### Clonar el repositorio
```bash
git clone 
cd 
```

## Configurar el Entorno

1. **Asegúrate de tener instalado Android Studio.**
2. **Abre el proyecto en Android Studio.**

## Construir el Proyecto

1. **Sincroniza el proyecto con Gradle.**
2. **Ejecuta la aplicación en un emulador o dispositivo físico.**

## Información Adicional

Este es un proyecto de **Kotlin Multiplatform**  **Android** e **iOS**.

### Estructura del Proyecto

- `/composeApp`: Contiene el código que será compartido entre tus aplicaciones Compose Multiplatform. Incluye varias subcarpetas:
  - `commonMain`: Para código que es común para todos los objetivos.
  - Otras carpetas son para código Kotlin que se compilará solo para la plataforma indicada en el nombre de la carpeta. Por ejemplo, si deseas usar **CoreCrypto** de Apple para la parte de **iOS** de tu aplicación Kotlin, `iosMain` sería la carpeta adecuada para tales llamadas.

- `/iosApp`: Contiene aplicaciones para **iOS**. Aun si compartes tu UI con Compose Multiplatform, necesitas este punto de entrada para tu aplicación iOS. Aquí es donde también deberías agregar código de **SwiftUI** para tu proyecto.

### Capturas de Pantalla:
![image](https://github.com/user-attachments/assets/30eb2abe-adea-4b6e-9196-2f6f32a218d3)

![image](https://github.com/user-attachments/assets/9c15260b-4115-47e7-9c75-054e6dd99928)

