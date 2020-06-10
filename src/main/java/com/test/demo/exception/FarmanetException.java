package com.test.demo.exception;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class FarmanetException extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private static Logger LOGGER = LoggerFactory.getLogger(FarmanetException.class);

    public int codigo = 0;
    public String descriptionStatus = "";
    public String mensaje = "";
    public String data = "";

    public FarmanetException(int type, String descriptionStatus, String msg, String data) {
        StringBuilder cadena = new StringBuilder();
        cadena.append(type);
        cadena.append(" << == >> ");
        cadena.append("Mensaje: ");
        cadena.append(msg);
        this.codigo = type;
        this.descriptionStatus = descriptionStatus;
        this.mensaje = cadena.toString();
        this.data = data;
        LOGGER.error("##############################################");
        LOGGER.error("Info-General: " + this.getDescriptionStatus());
        LOGGER.error("##############################################");
        LOGGER.error("Error de Excepcion:  " + this.mensaje);
        LOGGER.error("##############################################");
        LOGGER.error("Data de la Operación :  " + this.data);
        LOGGER.error("##############################################");

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescriptionStatus() {
        return descriptionStatus;
    }

    public void setDescriptionStatus(String descriptionStatus) {
        this.descriptionStatus = descriptionStatus;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}