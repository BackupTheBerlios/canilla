package org.canilla.exception;

/**
 * @author Diego Romoli
 * Signals an unrecoverable configuration exception (value missing, malformed
 * configuration file, etc).
 */
public class RuntimeConfigurationException extends RuntimeException {
    
    public RuntimeConfigurationException() {
        super();
    }

    public RuntimeConfigurationException(String message) {
        super(message);
    }

    public RuntimeConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }

    public RuntimeConfigurationException(Throwable cause) {
        super(cause);
    }
}
