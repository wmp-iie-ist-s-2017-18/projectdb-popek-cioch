package Baza;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class Main {

	public static void main(String[] args) throws SQLException, IOException, ParseException  {
		// TODO Auto-generated method stub
String datebaseUrl = "jdbc:sqlite:baza1.db";
ConnectionSource connectionSource =
new JdbcConnectionSource(datebaseUrl);

TableUtils.dropTable(connectionSource, Uczen.class, true);
TableUtils.createTable(connectionSource, Uczen.class);

TableUtils.dropTable(connectionSource, Oceny.class, true);
TableUtils.createTable(connectionSource, Oceny.class);

TableUtils.dropTable(connectionSource, Przedmioty.class, true);
TableUtils.createTable(connectionSource, Przedmioty.class);
connectionSource.close();
	}

}
