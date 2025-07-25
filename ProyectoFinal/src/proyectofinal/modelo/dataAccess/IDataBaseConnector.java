package proyectofinal.modelo.dataAccess;

import java.sql.Connection;

/**
 *
 * @author L
 */
public interface IDataBaseConnector extends AutoCloseable {
    Connection getConnection();
    void openConnection();
    void closeConnection();
}
