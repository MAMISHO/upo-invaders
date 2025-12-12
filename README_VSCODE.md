# UPO Space Invaders - Proyecto de Patrones de Diseño

## Descripción
Juego educativo de Space Invaders implementado en Java para enseñar patrones de diseño.

## Patrones de Diseño Implementados

### 1. Factory Pattern
- **Clase**: `NaveFactory`
- **Propósito**: Creación de naves de forma centralizada y aleatoria
- **Ubicación**: `src/game/NaveFactory.java`

### 2. Interface Pattern
- **Interface**: `INaveBase`
- **Propósito**: Define el contrato para todas las naves
- **Ubicación**: `src/game/objetos/INaveBase.java`

## Estructura del Proyecto

```
src/
├── game/
│   ├── NaveFactory.java          # Factory para crear naves
│   └── objetos/
│       ├── INaveBase.java         # Interface base para naves
│       ├── Lienzo.java            # Canvas del juego (JFrame)
│       ├── Nave.java              # Clase principal de nave
│       ├── NaveDimension.java     # Modelo de dimensiones
│       └── enums/
│           └── Direction.java     # Enum para direcciones
└── patrones/
    ├── Main.java                  # Punto de entrada
    └── Patrones.java
```

## Requisitos

- Java JDK 8 o superior
- Visual Studio Code
- Extensión "Extension Pack for Java" instalada en VS Code

## Configuración en VS Code

### 1. Instalar Extensiones
Instala el pack de extensiones de Java:
- Abre VS Code
- Ve a Extensions (⌘+Shift+X en Mac)
- Busca "Extension Pack for Java"
- Instala el pack completo

### 2. Abrir el Proyecto
```bash
cd /Users/mamisho/dev/upo/upo-invaders
code .
```

### 3. Compilar
VS Code compilará automáticamente. También puedes usar:
```bash
javac -d build/classes -sourcepath src src/patrones/Main.java
```

### 4. Ejecutar
Opción 1 - Desde VS Code:
- Presiona F5 o usa "Run > Start Debugging"
- O haz clic derecho en `Main.java` y selecciona "Run Java"

Opción 2 - Desde terminal:
```bash
java -cp build/classes patrones.Main
```

## Cómo Funciona

1. Se crea un `Lienzo` (JFrame) de 600x400 píxeles
2. Se utiliza `NaveFactory` para crear hasta 10 naves en posiciones aleatorias
3. Cada nave se dibuja usando Graphics con un color diferente
4. Las naves se mueven automáticamente:
   - De izquierda a derecha
   - Bajan cuando llegan al borde
   - Cambian de dirección (de derecha a izquierda)

## Patrones de Diseño a Implementar (Próximamente)

- **Strategy Pattern**: Para diferentes comportamientos de movimiento
- **Observer Pattern**: Para notificaciones de eventos del juego
- **Singleton Pattern**: Para gestión del estado del juego
- **Decorator Pattern**: Para añadir capacidades a las naves
- **Command Pattern**: Para manejo de inputs del usuario

## Mejoras Pendientes

1. ✅ Configuración para VS Code
2. ⏳ Arreglar bucle infinito del juego
3. ⏳ Implementar game loop adecuado
4. ⏳ Añadir controles del jugador
5. ⏳ Implementar sistema de colisiones
6. ⏳ Añadir proyectiles

## Notas de Desarrollo

### Problemas Conocidos
- El bucle while(true) en Main.java bloquea el hilo de eventos de Swing
- Necesita implementación de un game loop con Timer

### Solución Propuesta
Usar `javax.swing.Timer` para crear un game loop no bloqueante que actualice el juego a intervalos regulares.

## Autor
@mamisho

## Licencia
Ver archivo LICENSE
