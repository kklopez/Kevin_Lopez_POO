package edu.kevin.retofinal.iu;

/**
 * Clase base que define un idioma para el juego.
 * Proporciona metodos abstractos que deben ser implementados por las clases derivadas.
 */
public abstract class Idioma {

    /**
     * Obtiene el mensaje de bienvenida en el idioma correspondiente.
     *
     * @return Mensaje de bienvenida.
     */
    public abstract String obtenerBienvenida();

    /**
     * Obtiene el menu del juego en el idioma correspondiente.
     *
     * @return Menu del juego.
     */
    public abstract String obtenerMenu();

    /**
     * Obtiene el turno del jugador en el idioma correspondiente.
     *
     * @return Turno del jugador.
     */
    public abstract String obtenerSeleccionJugador();

    /**
     * Obtiene el nombre del jugador en el idioma correspondiente.
     *
     * @return Nombre del jugador.
     */
    public abstract String obtenerNombreJugador();

    /**
     * Obtiene la fila en el idioma correspondiente.
     *
     * @return Fila.
     */
    public abstract String obtenerFila();

    /**
     * Obtiene la columna en el idioma correspondiente.
     *
     * @return Columna.
     */
    public abstract String obtenerColumna();

    /**
     * Obtiene el mensaje de opcion invalida en el idioma correspondiente.
     *
     * @return Mensaje de opcion invalida.
     */
    public abstract String obtenerMovimientoInvalido();

    /**
     * Obtiene el mensaje de el ganador en el idioma correspondientes.
     *
     * @return Mensaje de el ganador.
     */
    public abstract String obtenerGanador();

    /**
     * Obtener mesaje de empate en el idioma correspondientes.
     *
     * @return Mensaje de empate.
     */
    public abstract String obtenerEmpate();

    /**
     * Obtiene el mensaje de el turno de la computadora en el idioma correspondiente.
     *
     * @return Mensaje de el turno de la computadora.
     */
    public abstract String obtenerTurnoComputadora();

    /**
     * Obtener mensaje de jugar otra vez en el idioma correspondiente.
     *
     * @return Mensaje de jugar otra vez.
     */
    public abstract String obtenerDeseaJugarOtraVez();

    /**
     * Obtener mensaje de despedida en el idioma correspondiente.
     *
     * @return Mensaje de despedida.
     */
    public abstract String obtenerGraciasPorJugar();

    /**
     * Obtener mensaje de error al cargar Scoreboard en el idioma correspondiente.
     *
     * @return Mensaje de error al cargar Scoreboard.
     */
    public abstract String obtenerErrorCargarScoreboard();

    /**
     * Obtine el mensaje de error al guardar el Scoreboard en el idioma correspondiente.
     *
     * @return Mensaje de error al guardar el Scoreboard.
     */
    public abstract String obtenerErrorGuardarScoreboard();

    /**
     * Obtiene el mensaje del Scoreboard en el idioma correspondiente.
     *
     * @return Mensaje del Scoreboard.
     */
    public abstract String obtenerEncabezadoScoreboard();

    /**
     * Obtener mensaje de opcion invalida en el idioma correspondiente.
     *
     * @return Mensaje de opcion invalida.
     */
    public abstract String obtenerOpcionInvalida();
}
