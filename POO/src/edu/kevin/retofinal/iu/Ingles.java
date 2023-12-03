package edu.kevin.retofinal.iu;

/**
 * Clase que implementa el idioma ingles.
 * Proporciona las traducciones específicas al ingles.
 */
public class Ingles extends Idioma {

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerBienvenida() {
        return "¡Welcome to the Tic Tac Toe game!";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerMenu() {
        return "Select an option:\n1. Play against a friend\n2. Play against the computer\n3. Show Scoreboard\n4. Exit";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerSeleccionJugador() {
        return "Turn of:";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerNombreJugador() {
        return "Enter the player's name";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerFila() {
        return "Enter the ROW (0, 1, 2): ";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerColumna() {
        return "Enter the COLUM (0, 1, 2): ";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerMovimientoInvalido() {
        return "****Invalid move. Please try again.****";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerGanador() {
        return "¡The winner is";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerEmpate() {
        return "The game has ended in a draw.";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerTurnoComputadora() {
        return "Computer's turn";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerDeseaJugarOtraVez() {
        return "Do you want to play again? (Yes/No): ";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerGraciasPorJugar() {
        return "Thank you for playing. Goodbye!";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerErrorCargarScoreboard() {
        return "Error al cargar el scoreboard. Se creará uno nuevo.";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerErrorGuardarScoreboard() {
        return "Error al guardar el scoreboard.";
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
        return "Invalid option. Please select a valid option.";
    }
}