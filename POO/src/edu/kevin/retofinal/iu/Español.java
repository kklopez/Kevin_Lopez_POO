package edu.kevin.retofinal.iu;

/**
 * Clase que implementa el idioma espaniol.
 * Proporciona las traducciones específicas al espaniol.
 */
public class Español extends Idioma {

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerBienvenida() {
        return "¡Bienvenido al juego Tres en Línea!";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerMenu() {
        return "Seleccione una opción:\n1. Jugar contra un amigo\n2. Jugar contra la computadora\n3. Mostrar Scoreboard\n4. Salir";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerSeleccionJugador() {
        return "Turno de:";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerNombreJugador() {
        return "Ingrese el nombre del jugador";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerFila() {
        return "Ingrese la FILA (0, 1, 2): ";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerColumna() {
        return "Ingrese la COLUMNA (0, 1, 2): ";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerMovimientoInvalido() {
        return "****Movimiento no válido. Inténtalo de nuevo.****";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerGanador() {
        return "¡El ganador es";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerEmpate() {
        return "El juego ha terminado en empate.";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerTurnoComputadora() {
        return "Turno de la computadora";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerDeseaJugarOtraVez() {
        return "¿Desea jugar otra vez? (Sí/No): ";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerGraciasPorJugar() {
        return "Gracias por jugar. ¡Hasta luego!";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerErrorCargarScoreboard() {
        return "Error loading the scoreboard. A new one will be created.";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerErrorGuardarScoreboard() {
        return "Error saving the scoreboard.";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerEncabezadoScoreboard() {
        return "Scoreboard:";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerOpcionInvalida() {
        return "Opcion no valida. Por favor, seleccione una opcion valida.";
    }
}